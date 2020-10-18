package org.runite.client;

import org.rs09.client.data.HashTable;
import org.rs09.client.data.ReferenceCache;

final class AtmosphereParser {

    /**
     * Values used for the Atmosphere Parser
     */
	/*
    	Start Opcode Values
	*/
    int regionLighting;
    float aFloat1187;
    float aFloat1190;
    float aFloat1189;
    int anInt1178;
    int anInt1185;
    int anInt1181;
    int regionAmbience;
    int anInt1184;
	/*
		End Opcode Values
	 */
    /**
     * Cache Information
     */
    public static ReferenceCache aReferenceCache_1135 = new ReferenceCache(4);
    /**
     * Default Region Values
     */
    static int defaultRegionAmbience = 13156520;
    static int defaultRegionLighting = 16777215;
    /**
     * Unsorted
     */
    static HashTable aHashTable_3679 = new HashTable(16);


    static AtmosphereParser[][] aAtmosphereParserArrayArray1581 = new AtmosphereParser[13][13];

    public AtmosphereParser() {
        try {
            this.regionLighting = defaultRegionLighting;
            this.aFloat1189 = 1.2F;
            this.anInt1178 = -50;
            this.aFloat1187 = 1.1523438F;
            this.regionAmbience = defaultRegionAmbience;
            this.anInt1181 = -60;
            this.aFloat1190 = 0.69921875F;
            this.anInt1184 = 0;
            this.anInt1185 = -50;
        } catch (RuntimeException var2) {
            throw ClientErrorException.clientError(var2, "li.<init>()");
        }
    }

    AtmosphereParser(DataBuffer buffer) {
        try {
            int opcode = buffer.readUnsignedByte();
            if ((opcode & 1) == 0) {
                this.regionLighting = defaultRegionLighting;
            } else {
                this.regionLighting = buffer.readInt();
            }

            if ((opcode & 2) == 0) {
                this.aFloat1187 = 1.1523438F;
            } else {
                this.aFloat1187 = (float) buffer.readUnsignedShort() / 256.0F;
            }

            if ((opcode & 4) == 0) {
                this.aFloat1190 = 0.69921875F;
            } else {
                this.aFloat1190 = (float) buffer.readUnsignedShort() / 256.0F;
            }

            if ((opcode & 8) == 0) {
                this.aFloat1189 = 1.2F;
            } else {
                this.aFloat1189 = (float) buffer.readUnsignedShort() / 256.0F;
            }

            if ((opcode & 16) == 0) {
                this.anInt1178 = -50;
                this.anInt1185 = -50;
                this.anInt1181 = -60;
            } else {
                this.anInt1185 = buffer.readSignedShort();
                this.anInt1181 = buffer.readSignedShort();
                this.anInt1178 = buffer.readSignedShort();
            }

            if ((opcode & 32) == 0) {
                this.regionAmbience = defaultRegionAmbience;
            } else {
                this.regionAmbience = buffer.readInt();
            }

            if ((opcode & 64) == 0) {
                this.anInt1184 = 0;
            } else {
                this.anInt1184 = buffer.readUnsignedShort();
            }

        } catch (RuntimeException var3) {
            throw ClientErrorException.clientError(var3, "li.<init>(" + (buffer != null ? "{...}" : "null") + ')');
        }
    }

}
