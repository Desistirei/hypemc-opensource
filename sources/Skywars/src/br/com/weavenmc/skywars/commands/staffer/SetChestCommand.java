package br.com.weavenmc.skywars.commands.staffer;

import java.util.Arrays;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.com.weavenmc.commons.core.permission.Group;
import br.com.weavenmc.skywars.WeavenSkywars;
import br.com.weavenmc.skywars.commands.BaseCommand;
import br.com.weavenmc.skywars.utils.ChestManager.typeChest;

public class SetChestCommand extends BaseCommand {

	public SetChestCommand() {
		super("setminifeast", "Set minifeast of map", Arrays.asList("minifeastset"));
	}

	@Override
	public boolean execute(CommandSender commandSender, String label, String[] args) {
		if (isPlayer(commandSender)) {
			Player player = getPlayer(commandSender);
			if (!isPermission(player, Group.DIRETOR)) {
				sendError(player, "�fVoc� n�o tem permiss�o para usar esse comando.");
				return true;
			}
			if (args.length < 2) {
				player.sendMessage("�3�lMINIFEAST �fUtilize o comando: /setchest (type) (1/...)");
				return true;
			}
			if (args.length == 2) {
				if (!isInteger(args[1])) {
					player.sendMessage("�c�lMINIFEAST �fUtilize somente n�meros para setar!");
					return true;
				}
				typeChest type = typeChest.NORMAL;
				try {
					type = typeChest.valueOf(args[0].toUpperCase());
				} catch (Exception e) {
					player.sendMessage("�c�lCHEST �fEsse tipo de ba� n�o existe!");
					return true;
				}
				int i = Integer.valueOf(args[1]);
				Block targetBlock = player.getTargetBlock((Set<Material>) null, 200);
				if (targetBlock.getType() != Material.CHEST) {
					player.sendMessage("�c�lCHEST �fEsse bloco n�o � um ba�!");
					return true;
					
				}
				WeavenSkywars.getChestManager().addChest(targetBlock, i, type);
				player.sendMessage("�a�lCHEST �fBa� " + i + " do tipo " + type.name() + " setado com sucesso!");
				return true;
			}
		} else {
			return true;
		}
		return false;
	}

}
