package br.com.weavenmc.commons.bukkit.command;

import java.util.Set;
import java.util.UUID;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

import br.com.weavenmc.commons.core.command.CommandSender;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BukkitCommandSender implements CommandSender, org.bukkit.command.CommandSender {

	@NonNull
	private org.bukkit.command.CommandSender commandSender;

	@Override
	public UUID getUniqueId() {
		if (commandSender instanceof Player)
			return ((Player) commandSender).getUniqueId();
		return UUID.randomUUID();
	}

	public Player getPlayer() {
		return (Player) commandSender;
	}

	@Override
	public boolean isPlayer() {
		return commandSender instanceof Player;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0) {
		return commandSender.addAttachment(arg0);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, int arg1) {
		return commandSender.addAttachment(arg0);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2) {
		return commandSender.addAttachment(arg0, arg1, arg2);
	}

	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2, int arg3) {
		return commandSender.addAttachment(arg0, arg1, arg2, arg3);
	}

	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		return commandSender.getEffectivePermissions();
	}

	@Override
	public boolean hasPermission(String arg0) {
		return commandSender.hasPermission(arg0);
	}

	@Override
	public boolean hasPermission(Permission arg0) {
		return commandSender.hasPermission(arg0);
	}

	@Override
	public boolean isPermissionSet(String arg0) {
		return commandSender.isPermissionSet(arg0);
	}

	@Override
	public boolean isPermissionSet(Permission arg0) {
		return commandSender.isPermissionSet(arg0);
	}

	@Override
	public void recalculatePermissions() {
		commandSender.recalculatePermissions();
	}

	@Override
	public void removeAttachment(PermissionAttachment arg0) {
		commandSender.removeAttachment(arg0);
	}

	@Override
	public boolean isOp() {
		return commandSender.isOp();
	}

	@Override
	public void setOp(boolean arg0) {
		commandSender.setOp(arg0);
	}

	@Override
	public String getName() {
		return commandSender.getName();
	}

	@Override
	public Server getServer() {
		return commandSender.getServer();
	}

	@Override
	public void sendMessage(String arg0) {
		commandSender.sendMessage(arg0);
	}

	@Override
	public void sendMessage(String[] arg0) {
		commandSender.sendMessage(arg0);
	}
}
