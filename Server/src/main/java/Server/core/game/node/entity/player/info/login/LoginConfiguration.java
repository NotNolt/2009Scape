package core.game.node.entity.player.info.login;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import core.game.component.CloseEvent;
import core.game.component.Component;
import core.game.node.entity.player.link.HintIconManager;
import core.game.node.item.Item;
import core.game.world.map.Location;
import core.net.packet.context.SkillContext;
import core.net.packet.out.SkillLevel;
import plugin.skill.Skills;
import plugin.tutorial.TutorialSession;
import plugin.tutorial.TutorialStage;
import core.game.node.entity.player.Player;
import core.game.system.SystemManager;
import core.game.world.GameWorld;
import core.game.world.map.RegionManager;
import core.game.world.repository.Repository;
import core.game.world.update.UpdateSequence;
import core.game.world.update.flag.player.AppearanceFlag;
import core.net.amsc.MSPacketRepository;
import core.net.amsc.WorldCommunicator;
import core.net.packet.PacketRepository;
import core.net.packet.context.InterfaceContext;
import core.net.packet.out.Interface;
import core.plugin.Plugin;


/**
 * Sends the login configuration packets.
 *
 * @author Emperor
 */
public final class LoginConfiguration {
    private static final Item[] STARTER_PACK = new Item[] { new Item(1351, 1), new Item(590, 1), new Item(303, 1), new Item(315, 1), new Item(1925, 1), new Item(1931, 1), new Item(2309, 1), new Item(1265, 1), new Item(1205, 1), new Item(1277, 1), new Item(1171, 1), new Item(841, 1), new Item(882, 25), new Item(556, 25), new Item(558, 15), new Item(555, 6), new Item(557, 4), new Item(559, 2) };
    private static final Item[] STARTER_BANK = new Item[] { new Item( 995, 25)};


    /**
     * The login plugins.
     */
    private static final List<Plugin<Object>> LOGIN_PLUGINS = new ArrayList<>();

    /**
     * The lobby pane component.
     */
    private static final Component LOBBY_PANE = new Component(549);

    /**
     * The lobby interface close event.
     */
    private static final Component LOBBY_INTERFACE = new Component(378).setCloseEvent(new CloseEvent() {
        @Override
        public boolean close(Player player, Component c) {
            return player.getLocks().isLocked("login");
        }
    });

    /**
     * Constructs a new {@Code LoginConfiguration} {@Code Object}
     */
    public LoginConfiguration() {
        /*
         * empty.
         */
    }

    /**
     * Configures the lobby login.
     *
     * @param player The player.
     */
    public static void configureLobby(Player player) {
        player.updateSceneGraph(true);
        if (!player.isArtificial() && player.getAttribute("login_type", LoginType.NORMAL_LOGIN) != LoginType.RECONNECT_TYPE) {
            System.out.println("Going to lobby screen");
            sendLobbyScreen(player);
//            configureGameWorld(player);
        } else {
            System.out.println("Configuring Gameworld...");
            configureGameWorld(player);
        }
    }

    /**
     * Sends the lobby interface-related packets.
     *
     * @param player The player.
     */
    public static void sendLobbyScreen(Player player) {
        Repository.getLobbyPlayers().add(player);
        player.getInterfaceManager().openWindowsPane(LOBBY_PANE);
        player.getInterfaceManager().open(LOBBY_INTERFACE);
        PacketRepository.send(Interface.class, new InterfaceContext(player, 549, 2, 378, false));
        PacketRepository.send(Interface.class, new InterfaceContext(player, 549, 3, 22, true));
        player.getPacketDispatch().sendString("Welcome to " + GameWorld.getName(), 378, 113);
        player.getPacketDispatch().sendString(getLastLoginText(player), 378, 114);
        player.getPacketDispatch().sendString(getLastLoginIp(player), 378, 115);
        player.getPacketDispatch().sendString("2009scape 2 the 562 boogaloo", 22, 6);
    }

    /**
     * Configures the game world.
     *
     * @param player The player.
     */
    public static void configureGameWorld(final Player player) {
        player.getInterfaceManager().openWindowsPane(new Component(548));
        System.out.println("Configuring Game World...");
        player.getConfigManager().reset();
        sendGameConfiguration(player);
        System.out.println("Sending game Configuration to player...");
        Repository.getLobbyPlayers().remove(player);
        System.out.println("Removing Player From Lobby");
        Repository.getPlayerNames().putIfAbsent(player.getUsername().toLowerCase(),player);
        System.out.println("Getting player names, setting to lowercase");
        player.setPlaying(true);
        System.out.println("Setting player playing to true");
        UpdateSequence.getRenderablePlayers().add(player);
        System.out.println("Getting Renderable players");
        RegionManager.move(player);
        System.out.println("Passed Region Manager, Move player");
        player.getMusicPlayer().init();
        System.out.println("Initiating Music Player || LoginConfiguration");
        player.getUpdateMasks().register(new AppearanceFlag(player));
        System.out.println("Initiating Appearance Update Mask for Player || LoginConfiguration");
        player.getPlayerFlags().setUpdateSceneGraph(true);
        System.out.println("Initiating Setting Update Scene Graph || LoginConfiguration");
        player.getStateManager().init();
        System.out.println("Initiating State Manager || LoginConfiguration");
        player.getPacketDispatch().sendInterfaceConfig(226, 1, true);
        System.out.println("Sending Interface Configuration to Player || LoginConfiguration");
		/*if (GameWorld.getSettings().isPvp()) {
			player.getPacketDispatch().sendString("", 226, 1);
		}*/
        /*TutorialSession.extend(player);
        if (TutorialSession.getExtension(player).getStage() != 73) {
            TutorialStage.load(player, TutorialSession.getExtension(player).getStage(), true);
        }*/
        if(player.getLocation().equals(Location.create(3094, 3107, 0))) {
            //Removing Tutorial Island properties on the account (?) and sending the jagex.Player to Lumbridge
            player.removeAttribute("tut-island");
            player.getConfigManager().set(1021, 0);
            player.getProperties().setTeleportLocation(new Location(3233, 3230));
            TutorialSession.getExtension(player).setStage(72);
            player.getInterfaceManager().closeOverlay();

            //Clears and Resets the jagex.Player's account and focuses the default interface to their Inventory
            player.getInventory().clear();
            player.getEquipment().clear();
            player.getBank().clear();
            player.getInterfaceManager().restoreTabs(); //This still hides the Attack (double swords) in the player menu until jagex.Player wields a weapon.
            player.getInterfaceManager().setViewedTab(3);
            player.getInventory().add(STARTER_PACK);
            player.getBank().add(STARTER_BANK);

            //This overwrites the stuck dialogue after teleporting to Lumbridge for some reason
            //Dialogue from 2007 or thereabouts
            //Original is five lines, but if the same is done here it will break. Need to find another way of showing all this information.
            player.getDialogueInterpreter().sendDialogue("Welcome to Lumbridge! To get more help, simply click on the", "Lumbridge Guide or one of the Tutors - these can be found by looking", "for the question mark icon on your mini-map. If you find you are", "lost at any time, look for a signpost or use the Lumbridge Home Port Spell.");

            //Appending the welcome message and some other stuff
            player.getPacketDispatch().sendMessage("Welcome to " + GameWorld.getName() + ".");


            player.unlock();
            if (player.getIronmanManager().isIronman() && player.getSettings().isAcceptAid()) {
                player.getSettings().toggleAcceptAid();
            }
            if (WorldCommunicator.isEnabled()) {
                MSPacketRepository.sendInfoUpdate(player);
            }
            int slot = player.getAttribute("tut-island:hi_slot", -1);
            if (slot < 0 || slot >= HintIconManager.MAXIMUM_SIZE) {
                return;
            }

            player.removeAttribute("tut-island:hi_slot");
            HintIconManager.removeHintIcon(player, slot);
        }
    }

    /**
     * Sends the game configuration packets.
     *
     * @param player The player to send to.
     */
    public static void sendGameConfiguration(final Player player) {
        System.out.println("Sending Game Configuration... || LoginConfiguration");
        player.getInterfaceManager().openWindowsPane(new Component(player.getInterfaceManager().isResizable() ? 746 : 548));
        System.out.println("Opening Windows Pane || Login Configuration");
        player.getInterfaceManager().openChatbox(137);
        System.out.println("Opening Chatbox || LoginConfiguration");
        player.getInterfaceManager().openDefaultTabs();
        System.out.println("Opening Default Tabs || LoginConfiguration");
        welcome(player);
        System.out.println("Sending Welcome to player || LoginConfiguration");
        config(player);
        System.out.println("Player configuration initialized || LoginConfiguration");
        for (Plugin<Object> plugin : LOGIN_PLUGINS) {
            try {
                plugin.newInstance(player);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
        player.getCommunication().sync(player);
        if (WorldCommunicator.isEnabled()) {
            MSPacketRepository.sendInfoUpdate(player);
        }
    }

    /**
     * Method used to welcome the player.
     *
     * @param player the player. Fullscreen mode Object id:
     */
    public static final void welcome(final Player player) {
        if (GameWorld.getSettings().isPvp()) {
            player.getPacketDispatch().sendString("", 226, 0);
        }
        if (player.isArtificial()) {

            return;
        }
        player.getPacketDispatch().sendMessage("Welcome to " + GameWorld.getName() + ".");
        //player.getPacketDispatch().sendMessage("You are currently playing in beta version 1.2");
        if (player.getDetails().isMuted()) {
            player.getPacketDispatch().sendMessage("You are muted.");
            player.getPacketDispatch().sendMessage("To prevent further mutes please read the rules.");
        }
//		ResourceAIPManager.get().load(player);
//		ResourceAIPManager.get().save(player);
    }

    /**
     * Method used to configure all possible settings for the player.
     *
     * @param player the player.
     */
    public static final void config(final Player player) {
        System.out.println("Configuring player for login || LoginConfiguration");
        player.getInventory().refresh();
        System.out.println("Refreshing Inventory || LoginConfiguration");
        player.getEquipment().refresh();
        System.out.println("Refreshing Equipment || LoginConfiguration");
        player.getSkills().refresh();
        System.out.println("Refreshing Skills || LoginConfiguration");
        player.getSkills().configure();
        System.out.println("Getting Skills || LoginConfiguration");
        player.getSettings().update();
        System.out.println("Getting Settings || LoginConfiguration");
        player.getInteraction().setDefault();
        System.out.println("Getting Interaction || LoginConfiguration");
        player.getPacketDispatch().sendRunEnergy();
        System.out.println("Sending Run Energy || LoginConfiguration");
        player.getFamiliarManager().login();
        System.out.println("Familiar Manager on login || LoginConfiguration");
        player.getInterfaceManager().openDefaultTabs();
        System.out.println("Opening default tabs || LoginConfiguration");
        player.getGrandExchange().init();
        System.out.println("Initializing Grand Exchange || LoginConfiguration");
        player.getPacketDispatch().sendString("Friends List - World " + GameWorld.getSettings().getWorldId(), 550, 3);
        System.out.println("Sending Friends List string || LoginConfiguration");
        player.getConfigManager().init();
        System.out.println("Initiating config manager || LoginConfiguration");
        player.getAntiMacroHandler().init();
        System.out.println("Initiating anti macro handler || LoginConfiguration");
        player.getQuestRepository().syncronizeTab(player);
        System.out.println("Sync quest repo to player || LoginConfiguration");
        player.getGraveManager().update();
        System.out.println("Updating Grave Manager || LoginConfiguration");
        player.getInterfaceManager().close();
        System.out.println("Closing Interfaces || LoginConfiguration");
        player.getEmoteManager().refresh();
        System.out.println("Getting Emote Manager || LoginConfiguration");
        player.getInterfaceManager().openInfoBars();
        System.out.println("Opening Info Bars || LoginConfiguration");
    }

    /**
     * Gets the message child for the inter id.
     *
     * @param interfaceId The interface id.
     * @return The child id.
     */
    public static int getMessageChild(int interfaceId) {
        //15 = keys & lock
        //16 = fly swat
        //17 = person with question marks
        //18 = wise old man
        //19 = man & woman with mouth closed
        //20 = man & lock & key
        //21 = closed chests
        //22 = same as 15
        //23 = snowmen
        if (interfaceId == 16) {
            return 6;
        } else if (interfaceId == 17 || interfaceId == 15 || interfaceId == 18 || interfaceId == 19 || interfaceId == 21 || interfaceId == 22) {
            return 4;
        } else if (interfaceId == 20) {
            return 5;
        } else if (interfaceId == 23) {
            return 3;
        }
        return 0;
    }

    /**
     * Gets the last login string for the lobby.
     *
     * @param player the player.
     * @return the last login.
     */
    public static String getLastLoginIp(Player player) {
        String lastIp = (String) player.getDetails().getSqlManager().getTable().getColumn("lastGameIp").getValue();
        if (lastIp == null || lastIp == "") {
            lastIp = player.getDetails().getIpAddress();
        }
        String string = lastIp;
        return string;
    }

    public static String getLastLoginText(Player player) {
        String string = "You last logged in @timeAgo from: ";
        long time = player.getDetails().getLastLogin();
        Date lastLogin = new Date(time);
        Date current = new Date();
        long diff = current.getTime() - lastLogin.getTime();
        int days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        if (days < 1) {
            string = string.replace("@timeAgo", "earlier today");
        } else if (days == 1) {
            string = string.replace("@timeAgo", "yesterday");
        } else {
            string = string.replace("@timeAgo", days + " days ago");
        }
        return string;
    }


    /**
     * Gets the loginPlugins.
     *
     * @return The loginPlugins.
     */
    public static List<Plugin<Object>> getLoginPlugins() {
        return LOGIN_PLUGINS;
    }

}