package core.net.packet;

import core.net.packet.in.*;
import core.net.packet.out.*;
import core.net.packet.out.GrandExchangePacket;

import java.util.HashMap;
import java.util.Map;

/**
 * The packet repository.
 * @author Emperor
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
		OUTGOING_PACKETS.put(LoginPacket.class, new LoginPacket());
		OUTGOING_PACKETS.put(UpdateSceneGraph.class, new UpdateSceneGraph());
		OUTGOING_PACKETS.put(WindowsPane.class, new WindowsPane());
		OUTGOING_PACKETS.put(Interface.class, new Interface());
		OUTGOING_PACKETS.put(SkillLevel.class, new SkillLevel());
		OUTGOING_PACKETS.put(Config.class, new Config());
		OUTGOING_PACKETS.put(AccessMask.class, new AccessMask());
		OUTGOING_PACKETS.put(GameMessage.class, new GameMessage());
		OUTGOING_PACKETS.put(RunScriptPacket.class, new RunScriptPacket());
		OUTGOING_PACKETS.put(RunEnergy.class, new RunEnergy());
		OUTGOING_PACKETS.put(ContainerPacket.class, new ContainerPacket());
		OUTGOING_PACKETS.put(StringPacket.class, new StringPacket());
		OUTGOING_PACKETS.put(Logout.class, new Logout());
		OUTGOING_PACKETS.put(CloseInterface.class, new CloseInterface());
		OUTGOING_PACKETS.put(AnimateInterface.class, new AnimateInterface());
		OUTGOING_PACKETS.put(DisplayModel.class, new DisplayModel());
		OUTGOING_PACKETS.put(InterfaceConfig.class, new InterfaceConfig());
		OUTGOING_PACKETS.put(PingPacket.class, new PingPacket());
		OUTGOING_PACKETS.put(UpdateAreaPosition.class, new UpdateAreaPosition());
		OUTGOING_PACKETS.put(ConstructObject.class, new ConstructObject());
		OUTGOING_PACKETS.put(ClearObject.class, new ClearObject());
		OUTGOING_PACKETS.put(HintIcon.class, new HintIcon());
		OUTGOING_PACKETS.put(ClearMinimapFlag.class, new ClearMinimapFlag());
		OUTGOING_PACKETS.put(InteractionOption.class, new InteractionOption());
		OUTGOING_PACKETS.put(SetWalkOption.class, new SetWalkOption());
		OUTGOING_PACKETS.put(MinimapState.class, new MinimapState());
		OUTGOING_PACKETS.put(ConstructGroundItem.class, new ConstructGroundItem());
		OUTGOING_PACKETS.put(ClearGroundItem.class, new ClearGroundItem());
		OUTGOING_PACKETS.put(RepositionChild.class, new RepositionChild());
		OUTGOING_PACKETS.put(PositionedGraphic.class, new PositionedGraphic());
		OUTGOING_PACKETS.put(SystemUpdatePacket.class, new SystemUpdatePacket());
		OUTGOING_PACKETS.put(CameraViewPacket.class, new CameraViewPacket());
		OUTGOING_PACKETS.put(MusicPacket.class, new MusicPacket());
		OUTGOING_PACKETS.put(AudioPacket.class, new AudioPacket());
		OUTGOING_PACKETS.put(GrandExchangePacket.class, new GrandExchangePacket());
		OUTGOING_PACKETS.put(BuildDynamicScene.class, new BuildDynamicScene());
		OUTGOING_PACKETS.put(AnimateObjectPacket.class, new AnimateObjectPacket());
		OUTGOING_PACKETS.put(ClearRegionChunk.class, new ClearRegionChunk());
		OUTGOING_PACKETS.put(ContactPackets.class, new ContactPackets());
		OUTGOING_PACKETS.put(CommunicationMessage.class, new CommunicationMessage());
		OUTGOING_PACKETS.put(UpdateClanChat.class, new UpdateClanChat());
		OUTGOING_PACKETS.put(UpdateGroundItemAmount.class, new UpdateGroundItemAmount());
		OUTGOING_PACKETS.put(WeightUpdate.class, new WeightUpdate());
		OUTGOING_PACKETS.put(UpdateRandomFile.class, new UpdateRandomFile());
		OUTGOING_PACKETS.put(InstancedLocationUpdate.class, new InstancedLocationUpdate());
		OUTGOING_PACKETS.put(CSConfigPacket.class, new CSConfigPacket());
		INCOMING_PACKETS.put(22, new ClientFocusPacket());
		INCOMING_PACKETS.put(93, new PingPacketHandler());
		INCOMING_PACKETS.put(44, new CommandPacket());
		INCOMING_PACKETS.put(237, new ChatPacket());
		INCOMING_PACKETS.put(21, new CameraMovementPacket());
		INCOMING_PACKETS.put(75, new MouseClickPacket());
		INCOMING_PACKETS.put(243, new DisplayUpdatePacket());
		INCOMING_PACKETS.put(177, new UpdateInterfaceCounter());
		INCOMING_PACKETS.put(4, new MusicPacketHandler());
		INCOMING_PACKETS.put(245, new IdlePacketHandler());
		INCOMING_PACKETS.put(111, new core.net.packet.in.GrandExchangePacket());
		IncomingPacket packet = new WalkPacket(); //119 WALKING_PACKET 562
		INCOMING_PACKETS.put(39, packet);
		INCOMING_PACKETS.put(77, packet);
		INCOMING_PACKETS.put(215, packet);
		packet = new ItemActionPacket();
		INCOMING_PACKETS.put(134, packet);//item on object
		//INCOMING_PACKETS.put(115, packet);//on npc OLD 530
		INCOMING_PACKETS.put(27, packet);//item on item
		//INCOMING_PACKETS.put(248, packet);//on player	OLD 530
		//INCOMING_PACKETS.put(3, packet = new InteractionPacket()); //530 Client
		INCOMING_PACKETS.put(180, packet);//jagex.Player interact options v
		//INCOMING_PACKETS.put(68, packet); //OLD 530
		INCOMING_PACKETS.put(71, packet);
		//INCOMING_PACKETS.put(114, packet); //OLD 530
		INCOMING_PACKETS.put(175, packet);//jagex.Player interact options ^
		INCOMING_PACKETS.put(30, packet);
		//INCOMING_PACKETS.put(78, packet);//OLD 530
		INCOMING_PACKETS.put(218, packet);
		//INCOMING_PACKETS.put(84, packet); //OLD 530
		//INCOMING_PACKETS.put(170, packet); //OLD 530
		//INCOMING_PACKETS.put(254, packet); //OLD 530
		//INCOMING_PACKETS.put(194, packet); //OLD 530
		//INCOMING_PACKETS.put(66, packet); //OLD 530
		INCOMING_PACKETS.put(33, packet);
		INCOMING_PACKETS.put(247, packet);
		INCOMING_PACKETS.put(156, packet = new ActionButtonPacket()); //Item V
		INCOMING_PACKETS.put(55, packet);
		INCOMING_PACKETS.put(153, packet);
		INCOMING_PACKETS.put(161, packet);
		INCOMING_PACKETS.put(135, packet); //^
		INCOMING_PACKETS.put(81, packet);
		INCOMING_PACKETS.put(184, packet);//close interface
		//INCOMING_PACKETS.put(155, packet); //Interface V OLD 530
		INCOMING_PACKETS.put(196, packet);
		//INCOMING_PACKETS.put(124, packet); //OLD 530
		INCOMING_PACKETS.put(199, packet);
		//INCOMING_PACKETS.put(234, packet); //OLD 530
		INCOMING_PACKETS.put(168, packet);
		INCOMING_PACKETS.put(166, packet);
		INCOMING_PACKETS.put(64, packet);
		INCOMING_PACKETS.put(53, packet);
		INCOMING_PACKETS.put(9, packet); //^
		INCOMING_PACKETS.put(132, packet); //Dialogue
		INCOMING_PACKETS.put(10, packet); //logout
		//INCOMING_PACKETS.put(206, packet);//operate OLD 530
		INCOMING_PACKETS.put(72, packet = new ExaminePacket());
		//INCOMING_PACKETS.put(92, packet); //OLD 530
		INCOMING_PACKETS.put(94, packet);
		//INCOMING_PACKETS.put(57, packet); //OLD 530
		//INCOMING_PACKETS.put(34, packet); //OLD 530
		//INCOMING_PACKETS.put(213, packet); //OLD 530
		//INCOMING_PACKETS.put(69, packet);
		//packet 98 - 530 settings interface
		INCOMING_PACKETS.put(104, packet = new ClanPacketHandler());
		INCOMING_PACKETS.put(188, packet);
		INCOMING_PACKETS.put(162, packet);
		INCOMING_PACKETS.put(157, new ChatSettingsPacket());
		//INCOMING_PACKETS.put(244, packet = new RunScriptPacketHandler()); //Old 530 Packet
		INCOMING_PACKETS.put(23, packet);
		INCOMING_PACKETS.put(65, packet);
		INCOMING_PACKETS.put(110, new RegionChangePacket());
		INCOMING_PACKETS.put(195, packet = new InterfaceUseOnPacket());
		INCOMING_PACKETS.put(239, packet);
		INCOMING_PACKETS.put(73, packet);
		//INCOMING_PACKETS.put(253, packet); //OLD 530
	    INCOMING_PACKETS.put(233, packet);
		INCOMING_PACKETS.put(231, packet = new SlotSwitchPacket());
		//INCOMING_PACKETS.put(79, packet); //OLD 530
		INCOMING_PACKETS.put(167, new QuickChatPacket());	
		INCOMING_PACKETS.put(201, packet = new CommunicationPacket());
		INCOMING_PACKETS.put(120, packet);
		INCOMING_PACKETS.put(57, packet);
		INCOMING_PACKETS.put(34, packet);
		INCOMING_PACKETS.put(213, packet);
		INCOMING_PACKETS.put(138, packet); //ITEM_ON_PLAYER 562
		INCOMING_PACKETS.put(36, packet); //JOIN_CLAN_CHAT_PACKET 562
		INCOMING_PACKETS.put(78, packet); //INTERFACE_BUTTON_ON_ITEM_PACKET 562
		INCOMING_PACKETS.put(49, packet); //NPC_EXAMINE_PACKET 562
		INCOMING_PACKETS.put(142, packet); //OBJECT_EXAMINE_PACKET 562
		INCOMING_PACKETS.put(148, packet); //WORLD_MAP_CLICKING_PACKET 562
		INCOMING_PACKETS.put(160, packet); //WEIRD_WALKING_PACKET 562
		INCOMING_PACKETS.put(163, packet); //MINI_WALKING_PACKET 562
		INCOMING_PACKETS.put(244, packet); //AFK_PACKET 562
		INCOMING_PACKETS.put(216, packet); //ACTION_BUTTON1_PACKET 562
		INCOMING_PACKETS.put(205, packet); //ACTION_BUTTON2_PACKET 562
		INCOMING_PACKETS.put(229, packet); //WEAR_ITEM_PACKET 562
		INCOMING_PACKETS.put(197, packet); //ENTER_LONGSTRING_PACKET 562
		INCOMING_PACKETS.put(3, packet); //ACTION_BUTTON3_PACKET 562
		INCOMING_PACKETS.put(19, packet); //ACTION_BUTTON4_PACKET 562
		INCOMING_PACKETS.put(193, packet); //ACTION_BUTTON5_PACKET 562
		INCOMING_PACKETS.put(76, packet); //ACTION_BUTTON6_PACKET 562
		INCOMING_PACKETS.put(173, packet); //ACTION_BUTTON7_PACKET 562
		INCOMING_PACKETS.put(89, packet); //ACTION_BUTTON8_PACKET 562
		INCOMING_PACKETS.put(221, packet); //ACTION_BUTTON9_PACKET 562
		INCOMING_PACKETS.put(159, packet); //SPELL_ON_OBJECT 562
		INCOMING_PACKETS.put(141, packet); //PLAYER_TRADE_OPTION_PACKET 562
		INCOMING_PACKETS.put(114, packet); //PLAYER_OPTION4_PACKET 562
		INCOMING_PACKETS.put(235, packet); //MOVE_CAMERA_PACKET 562
		INCOMING_PACKETS.put(87, packet); //CLICK_PACKET 562
		INCOMING_PACKETS.put(103, packet); //CLAN_UNKNOWN_PACKET
		INCOMING_PACKETS.put(115, packet);//CLAN_UNKNOWN_PACKET2
		INCOMING_PACKETS.put(82, packet);//CLAN_UNKNOWN_PACKET3
		INCOMING_PACKETS.put(91, packet);//CLOSE_INTERFACE_PACKET
		INCOMING_PACKETS.put(171, packet);//COMMANDS_PACKET
		INCOMING_PACKETS.put(4, packet);//IN_OUT_SCREEN_PACKET
		INCOMING_PACKETS.put(5, packet);//INTER_PACKET_COUNT_CHECKER_PACKET
		INCOMING_PACKETS.put(155, packet);//SWITCH_DETAIL
		INCOMING_PACKETS.put(116, packet);//DONE_LOADING_REGION
		INCOMING_PACKETS.put(225, packet);//PING_PACKET
		INCOMING_PACKETS.put(170, packet);//SCREEN_PACKET
		INCOMING_PACKETS.put(54, packet);//INTERFACE_ON_GROUND_ITEM_PACKET
		INCOMING_PACKETS.put(182, packet);//PUBLIC_CHAT_PACKET
		INCOMING_PACKETS.put(68, packet);//QUICK_CHAT_PACKET
		INCOMING_PACKETS.put(226, packet);//ADD_FRIEND_PACKET
		INCOMING_PACKETS.put(92, packet);//REMOVE_FRIEND_PACKET
		INCOMING_PACKETS.put(123, packet);//SEND_FRIEND_MESSAGE_PACKET
		INCOMING_PACKETS.put(45, packet);//OBJECT_CLICK1_PACKET
		INCOMING_PACKETS.put(190, packet);//OBJECT_CLICK2_PACKET
		INCOMING_PACKETS.put(26, packet);//OBJECT_CLICK3_PACKET
		INCOMING_PACKETS.put(143, packet);//OBJECT_CLICK4_PACKET
		INCOMING_PACKETS.put(181, packet);//OBJECT_CLICK5_PACKET
		INCOMING_PACKETS.put(217, packet);//NPC_CLICK1_PACKET
		INCOMING_PACKETS.put(254, packet);//NPC_CLICK2_PACKET
		INCOMING_PACKETS.put(38, packet);//NPC_CLICK3_PACKET
		INCOMING_PACKETS.put(95, packet);//NPC_CLICK4_PACKET
		INCOMING_PACKETS.put(207, packet);//ATTACK_NPC
		INCOMING_PACKETS.put(152, packet);//ATTACK_PLAYER
		INCOMING_PACKETS.put(140, packet);//PLAYER_OPTION_2_PACKET
		INCOMING_PACKETS.put(248, packet);//ITEM_DROP_PACKET
		INCOMING_PACKETS.put(117, packet);//ITEM_ON_ITEM_PACKET
		INCOMING_PACKETS.put(66, packet);//ITEM_SELECT_PACKET
		INCOMING_PACKETS.put(202, packet);//ITEM_ON_OBJECT_PACKET
		INCOMING_PACKETS.put(29, packet);//ITEM_OPERATE_PACKET
		INCOMING_PACKETS.put(69, packet);//ITEM_OPERATE2_PACKET
		INCOMING_PACKETS.put(189, packet);//ITEM_OPERATE1_PACKET
		INCOMING_PACKETS.put(136, packet);//ITEM_ON_NPC_PACKET
		INCOMING_PACKETS.put(194, packet);//ITEM_TAKE_PACKET
		INCOMING_PACKETS.put(147, packet);//DIALOGUE_CONTINUE_PACKET
		INCOMING_PACKETS.put(206, packet);//ENTER_INTEGER_PACKET
		INCOMING_PACKETS.put(253, packet);//SWITCH_INTERFACE_ITEM_PACKET
		INCOMING_PACKETS.put(112, packet);//SWITCH_BANK_ITEMS
		INCOMING_PACKETS.put(234, packet);//ITEM_OPTION1_PACKET
		INCOMING_PACKETS.put(79, packet);//INTERFACE_ON_PLAYER
		INCOMING_PACKETS.put(84, packet);//INTERFACE_ON_NPC
		INCOMING_PACKETS.put(172, packet);//ENTER_NAME_PACKET
		INCOMING_PACKETS.put(139, packet);//GRAND_EXCHANGE_ITEM_SELECT_PACKET
		INCOMING_PACKETS.put(124, packet);//ITEM_EXAMINE_PACKET
		INCOMING_PACKETS.put(118, packet);//REPORT_ABUSE
		INCOMING_PACKETS.put(41, packet);//UNKNOWN2_PACKET
		INCOMING_PACKETS.put(183, packet);//MUSIC_VOLUME_PACKET
		INCOMING_PACKETS.put(151, packet);//GROUND_ITEM_CLICK_2
		INCOMING_PACKETS.put(105, packet);//CLAN_INFO_PACKET
		INCOMING_PACKETS.put(47, packet);//CLAN_CHAT_SETUP
		INCOMING_PACKETS.put(77, packet);//LEAVE_CLAN_PACKET


		INCOMING_PACKETS.put(99, packet = new ReportAbusePacket());
		INCOMING_PACKETS.put(98, packet = new MapClosedPacket()); // this packet is sent when the world map is closed by the client
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
		p.send(context);
	}

	/**
	 * Gets an incoming packet.
	 * @param opcode The opcode.
	 * @return The incoming packet.
	 */
	public static IncomingPacket getIncoming(int opcode) {
		return INCOMING_PACKETS.get(opcode);
	}
}