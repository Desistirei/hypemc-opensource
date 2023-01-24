package br.com.weavenmc.ypvp.ability.list;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import br.com.weavenmc.commons.core.permission.Group;
import br.com.weavenmc.ypvp.yPvP;
import br.com.weavenmc.ypvp.ability.Ability;
import br.com.weavenmc.ypvp.yPvP.PvPType;

public class PvPAbility extends Ability {

	public PvPAbility() {
		setName("PvP");
		setHasItem(false);
		setGroupToUse(Group.MEMBRO);
		if (yPvP.getPlugin().getPvpType() == PvPType.FULLIRON) {
			setIcon(Material.DIAMOND_SWORD);
			setDescription(new String[] { "�7Voc� n�o recebe habilidades mas recebe",
					"�7uma espada de diamante com afia��o 1." });
		} else {
			setIcon(Material.STONE_SWORD);
			setDescription(new String[] { "�7Voc� n�o recebe habilidades mas recebe",
			"�7uma espada de pedra com afia��o 1." });
		}
	}

	@Override
	public void eject(Player p) {

	}
}
