package org.rs09.client.net.game

import org.rs09.client.net.game.inbound.ConsoleAutocompletionPacketDecoder
import org.rs09.client.net.game.inbound.ConsoleMessageDecoder
import org.rs09.client.net.game.inbound.GamePacketDecoder
import org.runite.client.*
import java.io.IOException

object PacketDecoder {
    val decoders = HashMap<Int, GamePacketDecoder>()
    var OPCODE_OFFSET = 241

    private fun registerCustomDecoder(size: Int, decoder: GamePacketDecoder): Int {
        val opcode = OPCODE_OFFSET++

        Class75_Sub4.incomingPacketSizes[opcode] = size
        decoders[opcode] = decoder
        return opcode
    }

    init {
        // VERY IMPORTANT - WHEN ADDING NEW PACKETS, ADD THEM AFTER THE OLD PACKETS
        // OTHERWISE YOU >>WILL<< MESS UP OPCODES

        registerCustomDecoder(-2, ConsoleMessageDecoder)
        registerCustomDecoder(-2, ConsoleAutocompletionPacketDecoder)
//        println("NOTE > Registered ConsoleAutocompletionPacket as opcode $completion")
    }

    @Throws(IOException::class)
    fun decodePacket(): Boolean {
        val connection = Class3_Sub15.activeConnection ?: return false
        var availableBytes = connection.availableBytes()
        if (availableBytes <= 0) return false

        if (PacketParser.incomingOpcode == -1) {
            availableBytes--
            Class3_Sub15.activeConnection.readBytes(PacketParser.incomingBuffer.buffer, 0, 1)
            PacketParser.incomingBuffer.index = 0
            PacketParser.incomingOpcode = PacketParser.incomingBuffer.opcode
            Unsorted.incomingPacketLength = Class75_Sub4.incomingPacketSizes[PacketParser.incomingOpcode]
        }

        if (Unsorted.incomingPacketLength == -1) {
            if (availableBytes < 1) return false

            availableBytes--
            Class3_Sub15.activeConnection.readBytes(PacketParser.incomingBuffer.buffer, 0, 1)
            Unsorted.incomingPacketLength = PacketParser.incomingBuffer.buffer[0].toInt() and 0xff
        }

        if (Unsorted.incomingPacketLength == -2) {
            if (availableBytes < 2) return false

            availableBytes -= 2
            Class3_Sub15.activeConnection.readBytes(PacketParser.incomingBuffer.buffer, 0, 2)
            PacketParser.incomingBuffer.index = 0
            Unsorted.incomingPacketLength = PacketParser.incomingBuffer.readUnsignedShort()
        }

        if (availableBytes < Unsorted.incomingPacketLength) return false

        PacketParser.incomingBuffer.index = 0
        Class3_Sub15.activeConnection.readBytes(PacketParser.incomingBuffer.buffer, 0, Unsorted.incomingPacketLength)
        Class24.anInt469 = Class7.anInt2166
        Class7.anInt2166 = LinkableRSString.anInt2582
        LinkableRSString.anInt2582 = PacketParser.incomingOpcode
        Class3_Sub28_Sub16.anInt3699 = 0

        val decoder = decoders[PacketParser.incomingOpcode]
        if (decoder == null) return PacketParser.parseIncomingPackets();
        else decoder.decode(PacketParser.incomingBuffer)

        // TODO This should only happen after everything else.
        PacketParser.incomingOpcode = -1
        return true
    }
}