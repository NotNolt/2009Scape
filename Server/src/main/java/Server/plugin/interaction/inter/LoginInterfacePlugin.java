package plugin.interaction.inter;

import core.game.component.Component;
import core.game.component.ComponentDefinition;
import core.game.component.ComponentPlugin;
import core.game.node.entity.player.Player;
import core.game.node.entity.player.info.login.LoginConfiguration;
import core.game.system.task.Pulse;
import core.plugin.InitializablePlugin;
import core.plugin.Plugin;

/**
 * Represents the plugin used for the login interface.
 * @author 'Vexia
 * @version 1.0
 */
@InitializablePlugin
public final class LoginInterfacePlugin extends ComponentPlugin {

	@Override
	public Plugin<Object> newInstance(Object arg) throws Throwable {
		ComponentDefinition.put(378, this);
		return null;
	}

	@Override
	public boolean handle(final Player player, Component component, int opcode, int button, int slot, int itemId) {
		switch (button) {
		case 138:
			if (player.getLocks().isLocked("login")) {
				return true;
			}
			player.getLocks().lock("login", 2);
			System.out.println("Attempting to close interface... || LoginInterfacePlugin.java");
			player.getInterfaceManager().close();
			player.getPulseManager().run(new Pulse(1) {
				@Override
				public boolean pulse() {
					System.out.println("Pulsing Configure Gameworld || LoginInterfacePlugin.java");
					LoginConfiguration.configureGameWorld(player);
					return true;
				}
			});
			break;
		case 157://credits
			break;
		case 266://message centre
			break;
		}
		return true;
	}

}
