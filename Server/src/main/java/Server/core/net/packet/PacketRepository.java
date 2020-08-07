package core.net.packet;

import core.net.packet.in.*;
import core.net.packet.out.*;
import core.net.packet.out.GrandExchangePacket;

import java.util.HashMap;
import java.util.Map;

/**
 * The packet repository. || Packet Sizes Located in GameReadEvent.java
 * @author Woah
 */
public final class PacketRepository {

	/**
	 * The outgoing packets mapping.
	 */
	private final static Map<Class<?>, OutgoingPacket<? extends Context>> OUTGOING_PACKETS = new HashMap<>();

	/**
	 * The incoming packets mapping.
	 */
	private final static Map<Integer, IncomingPacket> INCOMING_PACKETS = new HashMap<>();

	/**
	 * Populate the mappings.
	 */
	static {

		/**Unknown Packet Pool - Outgoing -
		 * 0, 2, 6, 7, 15, 21, 25, 26, 39, 41, 54, 58, 65, 66, 72, 74, 78, 81, 82, 92, 104, 107, 112,
		 * 118, 124, 127, 128, 130, 131, 137, 139, 140, 141, 155, 159, 160, 163, 170, 183, 189, 192,
		 * 195, 198, 200, 202, 206, 212, 223, 226, 228, 229, 235, 243, 244, 248, 250, 249, 254
		 */

		/**
		 * Out Going Packets
		 */
		OUTGOING_PACKETS.put(LoginPacket.class, new LoginPacket());//Up to date 562
		OUTGOING_PACKETS.put(UpdateSceneGraph.class, new UpdateSceneGraph());//Up to date 562		76										LESA,S,P,PA,PA,S,S
		OUTGOING_PACKETS.put(WindowsPane.class, new WindowsPane());//Up to date 562					50										SA,S,PS,
		OUTGOING_PACKETS.put(Interface.class, new Interface());//Up to date 562						56										S,PS,S,LEI
		OUTGOING_PACKETS.put(SkillLevel.class, new SkillLevel());//Up to date 562					38										PA,IA,PC
		OUTGOING_PACKETS.put(Config.class, new Config());//Up to date 562							151, 186								LEI,S |128 >| PS,LESA
		OUTGOING_PACKETS.put(AccessMask.class, new AccessMask());//Up to date 562					113										I,LES,LES,LESA,LEI
		OUTGOING_PACKETS.put(GameMessage.class, new GameMessage());//Up to date 562					193										SMART,I,P,STRING
		OUTGOING_PACKETS.put(RunScriptPacket.class, new RunScriptPacket());//Up to date 562			70										S,STRING,I
		OUTGOING_PACKETS.put(RunEnergy.class, new RunEnergy());//Up to date 562						63										P
		OUTGOING_PACKETS.put(ContainerPacket.class, new ContainerPacket());//						120										I,S,S,S, S,IA,PC,PC,LES,LES,PC | Slot | SMART,S,P,I,P,S
		OUTGOING_PACKETS.put(StringPacket.class, new StringPacket());//Up to date 562				106										P,P,STRING,IB
		OUTGOING_PACKETS.put(Logout.class, new Logout());//Up to date 562							236
		OUTGOING_PACKETS.put(CloseInterface.class, new CloseInterface());//Up to Date 562			203
		OUTGOING_PACKETS.put(AnimateInterface.class, new AnimateInterface());//Up to date 562		61
		OUTGOING_PACKETS.put(DisplayModel.class, new DisplayModel());//Up to date 562 				219, 158, 145, 53
		OUTGOING_PACKETS.put(InterfaceConfig.class, new InterfaceConfig());//Up to date 562			3
		OUTGOING_PACKETS.put(PingPacket.class, new PingPacket());//									255
		OUTGOING_PACKETS.put(UpdateAreaPosition.class, new UpdateAreaPosition());//					83, 207
		OUTGOING_PACKETS.put(ConstructObject.class, new ConstructObject());//						115
		OUTGOING_PACKETS.put(ClearObject.class, new ClearObject());//								27
		OUTGOING_PACKETS.put(HintIcon.class, new HintIcon());//										122	Recheck Needed
		OUTGOING_PACKETS.put(ClearMinimapFlag.class, new ClearMinimapFlag());//						5	Recheck Needed Try: 169
		OUTGOING_PACKETS.put(InteractionOption.class, new InteractionOption());//					73
		OUTGOING_PACKETS.put(SetWalkOption.class, new SetWalkOption());//							246
		OUTGOING_PACKETS.put(MinimapState.class, new MinimapState());//								208
		OUTGOING_PACKETS.put(ConstructGroundItem.class, new ConstructGroundItem());//				22
		OUTGOING_PACKETS.put(ClearGroundItem.class, new ClearGroundItem());//						221
		OUTGOING_PACKETS.put(RepositionChild.class, new RepositionChild());//						160	Recheck Needed Try: 160
		OUTGOING_PACKETS.put(PositionedGraphic.class, new PositionedGraphic());//					109
		OUTGOING_PACKETS.put(SystemUpdatePacket.class, new SystemUpdatePacket());//					231
		OUTGOING_PACKETS.put(CameraViewPacket.class, new CameraViewPacket());//						147, 157, 44, 121
		OUTGOING_PACKETS.put(MusicPacket.class, new MusicPacket());//								30, 188
		OUTGOING_PACKETS.put(AudioPacket.class, new AudioPacket());//								136
		OUTGOING_PACKETS.put(GrandExchangePacket.class, new GrandExchangePacket());//				134
		OUTGOING_PACKETS.put(BuildDynamicScene.class, new BuildDynamicScene());//					146
		OUTGOING_PACKETS.put(AnimateObjectPacket.class, new AnimateObjectPacket());//				109
//		OUTGOING_PACKETS.put(ClearRegionChunk.class, new ClearRegionChunk());
		OUTGOING_PACKETS.put(ContactPackets.class, new ContactPackets());//							5	Recheck Needed || 20, 62
//		OUTGOING_PACKETS.put(CommunicationMessage.class, new CommunicationMessage());
		OUTGOING_PACKETS.put(UpdateClanChat.class, new UpdateClanChat());//							91  Recheck Needed
//		OUTGOING_PACKETS.put(UpdateGroundItemAmount.class, new UpdateGroundItemAmount());
//		OUTGOING_PACKETS.put(WeightUpdate.class, new WeightUpdate());
//		OUTGOING_PACKETS.put(UpdateRandomFile.class, new UpdateRandomFile());
//		OUTGOING_PACKETS.put(InstancedLocationUpdate.class, new InstancedLocationUpdate());
		OUTGOING_PACKETS.put(CSConfigPacket.class, new CSConfigPacket());//							70

		/**
		 * Incoming Packets
		 */

		INCOMING_PACKETS.put(4, new ClientFocusPacket());// Minimize Client
		INCOMING_PACKETS.put(5, new UpdateInterfaceCounter());
		INCOMING_PACKETS.put(68, new QuickChatPacket());
		INCOMING_PACKETS.put(87, new MouseClickPacket());//Up to date 562
		INCOMING_PACKETS.put(118, new ReportAbusePacket());
		INCOMING_PACKETS.put(139, new core.net.packet.in.GrandExchangePacket());
		INCOMING_PACKETS.put(170, new DisplayUpdatePacket());//Up to date 562
		INCOMING_PACKETS.put(171, new CommandPacket());//Up to date 562
		INCOMING_PACKETS.put(182, new ChatPacket());//Up to date 562
		INCOMING_PACKETS.put(235, new CameraMovementPacket());
		INCOMING_PACKETS.put(244, new IdlePacketHandler());//Up to date 562
		INCOMING_PACKETS.put(253, new SlotSwitchPacket());
		INCOMING_PACKETS.put(255, new PingPacketHandler());//Up to date 562
//		INCOMING_PACKETS.put(4, new MusicPacketHandler());
//		INCOMING_PACKETS.put(201, packet = new CommunicationPacket());
//		INCOMING_PACKETS.put(157, new ChatSettingsPacket());
//		INCOMING_PACKETS.put(244, packet = new RunScriptPacketHandler());
//		INCOMING_PACKETS.put(110, new RegionChangePacket());
		IncomingPacket interactionPacket = new InteractionPacket(); //562 Action button 3
		INCOMING_PACKETS.put(3, interactionPacket);//NPC_CLICK4_PACKET
		INCOMING_PACKETS.put(45, interactionPacket);//OBJECT_CLICK1_PACKET
		INCOMING_PACKETS.put(190, interactionPacket);//OBJECT_CLICK2_PACKET
		INCOMING_PACKETS.put(26, interactionPacket);//OBJECT_CLICK3_PACKET
		INCOMING_PACKETS.put(143, interactionPacket);//OBJECT_CLICK4_PACKET
		INCOMING_PACKETS.put(181, interactionPacket);//OBJECT_CLICK5_PACKET
		INCOMING_PACKETS.put(217, interactionPacket);//NPC_CLICK1_PACKET
		INCOMING_PACKETS.put(254, interactionPacket);//NPC_CLICK2_PACKET
		INCOMING_PACKETS.put(38, interactionPacket);//NPC_CLICK3_PACKET
		INCOMING_PACKETS.put(95, interactionPacket);//NPC_CLICK4_PACKET
 		INCOMING_PACKETS.put(141, interactionPacket); //PLAYER_TRADE_OPTION_PACKET 562
		INCOMING_PACKETS.put(114, interactionPacket); //PLAYER_OPTION4_PACKET 562
		INCOMING_PACKETS.put(140, interactionPacket);//PLAYER_OPTION_2_PACKET
		INCOMING_PACKETS.put(207, interactionPacket);//ATTACK_NPC
		INCOMING_PACKETS.put(152, interactionPacket);//ATTACK_PLAYER
		INCOMING_PACKETS.put(159, interactionPacket); //SPELL_ON_OBJECT 562
		IncomingPacket clanPacket = new ClanPacketHandler();//36,77,162
		INCOMING_PACKETS.put(36, clanPacket); //JOIN_CLAN_CHAT_PACKET 562
		INCOMING_PACKETS.put(47, clanPacket);//CLAN_CHAT_SETUP
		INCOMING_PACKETS.put(77, clanPacket);//LEAVE_CLAN_PACKET
		INCOMING_PACKETS.put(82, clanPacket);//CLAN_UNKNOWN_PACKET3
		INCOMING_PACKETS.put(103, clanPacket); //CLAN_UNKNOWN_PACKET
		INCOMING_PACKETS.put(105, clanPacket);//CLAN_INFO_PACKET
		INCOMING_PACKETS.put(115, clanPacket);//CLAN_UNKNOWN_PACKET2
		INCOMING_PACKETS.put(162, clanPacket);//LEAVE_CLAN_PACKET
		IncomingPacket examinePacket = new ExaminePacket();
		INCOMING_PACKETS.put(49, examinePacket); //NPC_EXAMINE_PACKET 562
		INCOMING_PACKETS.put(124, examinePacket);//ITEM_EXAMINE_PACKET
		INCOMING_PACKETS.put(142, examinePacket); //OBJECT_EXAMINE_PACKET 562
		IncomingPacket interfaceUseOnPacket = new InterfaceUseOnPacket();
		INCOMING_PACKETS.put(54, interfaceUseOnPacket);//INTERFACE_ON_GROUND_ITEM
		INCOMING_PACKETS.put(78, interfaceUseOnPacket); //INTERFACE_ON_ITEM
		INCOMING_PACKETS.put(79, interfaceUseOnPacket);//INTERFACE_ON_PLAYER
		INCOMING_PACKETS.put(84, interfaceUseOnPacket);//INTERFACE_ON_NPC
		IncomingPacket walkPacket = new WalkPacket(); //119 WALKING_PACKET 562
		INCOMING_PACKETS.put(119, walkPacket);
		INCOMING_PACKETS.put(160, walkPacket); //WEIRD_WALKING_PACKET 562
		INCOMING_PACKETS.put(163, walkPacket);
		IncomingPacket itemaction = new ItemActionPacket();//136, 138, 117, 202
		INCOMING_PACKETS.put(29, itemaction);//ITEM_OPERATE_PACKET
		INCOMING_PACKETS.put(66, itemaction);//ITEM_SELECT_PACKET
		INCOMING_PACKETS.put(69, itemaction);//ITEM_OPERATE2_PACKET
		INCOMING_PACKETS.put(117, itemaction);//ITEM_ON_ITEM_PACKET
		INCOMING_PACKETS.put(136, itemaction);//ITEM_ON_NPC_PACKET
		INCOMING_PACKETS.put(138, itemaction); //ITEM_ON_PLAYER 562
		INCOMING_PACKETS.put(189, itemaction);//ITEM_OPERATE1_PACKET
		INCOMING_PACKETS.put(194, itemaction);//ITEM_TAKE_PACKET
		INCOMING_PACKETS.put(202, itemaction);//ITEM_ON_OBJECT_PACKET
		IncomingPacket actionButtonPacket = new ActionButtonPacket();
		INCOMING_PACKETS.put(3, actionButtonPacket); //ACTION_BUTTON3_PACKET 562
		INCOMING_PACKETS.put(19, actionButtonPacket); //ACTION_BUTTON4_PACKET 562
		INCOMING_PACKETS.put(76, actionButtonPacket); //ACTION_BUTTON6_PACKET 562
		INCOMING_PACKETS.put(89, actionButtonPacket); //ACTION_BUTTON8_PACKET 562
		INCOMING_PACKETS.put(173, actionButtonPacket); //ACTION_BUTTON7_PACKET 562
		INCOMING_PACKETS.put(193, actionButtonPacket); //ACTION_BUTTON5_PACKET 562
		INCOMING_PACKETS.put(205, actionButtonPacket); //ACTION_BUTTON2_PACKET 562
		INCOMING_PACKETS.put(216, actionButtonPacket); //ACTION_BUTTON1_PACKET 562
		INCOMING_PACKETS.put(221, actionButtonPacket); //ACTION_BUTTON9_PACKET 562
		INCOMING_PACKETS.put(229, actionButtonPacket); //WEAR_ITEM_PACKET 562
		INCOMING_PACKETS.put(234, actionButtonPacket);//ITEM_OPTION1_PACKET
		INCOMING_PACKETS.put(248, actionButtonPacket);//ITEM_DROP_PACKET
		INCOMING_PACKETS.put(91, actionButtonPacket);//CLOSE_INTERFACE_PACKET

		/**
		 * Unsorted for now
		 */

		INCOMING_PACKETS.put(148, actionButtonPacket); //WORLD_MAP_CLICKING_PACKET 562
		INCOMING_PACKETS.put(197, actionButtonPacket); //ENTER_LONGSTRING_PACKET 562
		INCOMING_PACKETS.put(4, actionButtonPacket);//IN_OUT_SCREEN_PACKET
		INCOMING_PACKETS.put(5, actionButtonPacket);//INTER_PACKET_COUNT_CHECKER_PACKET
		INCOMING_PACKETS.put(155, actionButtonPacket);//SWITCH_DETAIL
		INCOMING_PACKETS.put(116, actionButtonPacket);//DONE_LOADING_REGION
		INCOMING_PACKETS.put(182, actionButtonPacket);//PUBLIC_CHAT_PACKET
		INCOMING_PACKETS.put(226, actionButtonPacket);//ADD_FRIEND_PACKET
		INCOMING_PACKETS.put(92, actionButtonPacket);//REMOVE_FRIEND_PACKET
		INCOMING_PACKETS.put(123, actionButtonPacket);//SEND_FRIEND_MESSAGE_PACKET
		INCOMING_PACKETS.put(147, actionButtonPacket);//DIALOGUE_CONTINUE_PACKET
		INCOMING_PACKETS.put(206, actionButtonPacket);//ENTER_INTEGER_PACKET
		INCOMING_PACKETS.put(253, actionButtonPacket);//SWITCH_INTERFACE_ITEM_PACKET
		INCOMING_PACKETS.put(112, actionButtonPacket);//SWITCH_BANK_ITEMS
		INCOMING_PACKETS.put(172, actionButtonPacket);//ENTER_NAME_PACKET
		INCOMING_PACKETS.put(41, actionButtonPacket);//UNKNOWN2_PACKET
		INCOMING_PACKETS.put(183, actionButtonPacket);//MUSIC_VOLUME_PACKET
		INCOMING_PACKETS.put(151, actionButtonPacket);//GROUND_ITEM_CLICK_2



//		INCOMING_PACKETS.put(98, packet = new MapClosedPacket()); // this packet is sent when the world map is closed by the client
		// INCOMING_PACKETS.put(77, packet);
		// INCOMING_PACKETS.put(191, packet);
		// INCOMING_PACKETS.put(139, packet);
		// INCOMING_PACKETS.put(251, packet);
		// INCOMING_PACKETS.put(55, packet);
	}

	/**
	 * Sends a new packet.
	 * @param clazz The class of the outgoing packet to send.
	 * @param context The context.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void send(Class<? extends OutgoingPacket> clazz, Context context) {
		OutgoingPacket p = OUTGOING_PACKETS.get(clazz);
		if (p == null) {
			System.err.println("Invalid outgoing packet [handler=" + clazz + ", context=" + context + "].");
			return;
		}
		System.out.println("Sending packet " + p + " to the client");
		p.send(context);
	}

	/**
	 * Gets an incoming packet.
	 * @param opcode The opcode.
	 * @return The incoming packet.
	 */
	public static IncomingPacket getIncoming(int opcode) {
		System.out.println("INCOMING OPCODE :: " + opcode);
		return INCOMING_PACKETS.get(opcode);
	}
}