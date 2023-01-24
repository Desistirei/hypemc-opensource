package br.com.weavenmc.commons.bungee.command.register;

import java.util.ArrayList;
import java.util.List;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import br.com.weavenmc.commons.WeavenMC;
import br.com.weavenmc.commons.bungee.BungeeMain;
import br.com.weavenmc.commons.bungee.account.ProxyPlayer;
import br.com.weavenmc.commons.bungee.command.BungeeCommandSender;
import br.com.weavenmc.commons.core.command.CommandClass;
import br.com.weavenmc.commons.core.command.CommandFramework.Command;
import br.com.weavenmc.commons.core.command.CommandFramework.Completer;
import br.com.weavenmc.commons.core.data.player.category.DataCategory;
import br.com.weavenmc.commons.core.permission.Group;
import br.com.weavenmc.commons.core.server.ServerType;
import br.com.weavenmc.commons.util.string.StringUtils;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class ServerCommand implements CommandClass {



	@Command(name = "regras")
	public void regras(BungeeCommandSender sender, String label, String[] args) {
		sender.sendMessage("�4�lDiretrizes do servidor:");
		sender.sendMessage("");
		sender.sendMessage("Banimentos permanentes:");
		sender.sendMessage("");
		sender.sendMessage("1. Admitir o uso de hack;");
		sender.sendMessage("2. Amea�a;");
		sender.sendMessage("3. Ass�dio;");
		sender.sendMessage("4. Bullying;");
		sender.sendMessage("5. Calunia;");
		sender.sendMessage("6. Chantagem;");
		sender.sendMessage("7. Chargeback;");
		sender.sendMessage("8. Conta alternativa;");
		sender.sendMessage("9. C�mplice de FreeKill;");
		sender.sendMessage("10. Deslogar em ScreenShare;");
		sender.sendMessage("11. Difama��o;");
		sender.sendMessage("12. Discrimina��o;");
		sender.sendMessage("13. Divulga��o de outros servidores;");
		sender.sendMessage("14. Estelionato;");
		sender.sendMessage("15. Extors�o;");
		sender.sendMessage("16. Falsidade ideol�gica (Blacklist);");
		sender.sendMessage("17. Falsifica��o de provas;");
		sender.sendMessage("18. Forjar o uso de hack;");
		sender.sendMessage("19. Fraude;");
		sender.sendMessage("20. FreeKill;");
		sender.sendMessage("21. Gravar ScreenShare;");
		sender.sendMessage("22. Griffing (Blacklist);");
		sender.sendMessage("23. Homofobia;");
		sender.sendMessage("24. Justa causa;");
		sender.sendMessage("25. Negar ScreenShare;");
		sender.sendMessage("26. Nick impr�prio;");
		sender.sendMessage("27. Racismo;");
		sender.sendMessage("28. Tentativa de Suborno;");
		sender.sendMessage("29. Testar staff;");
		sender.sendMessage("30. Trollar ScreenShare;");
		sender.sendMessage("31. Uso de hack (vantagens injustas)/Cheating.");
		sender.sendMessage("");
		sender.sendMessage("Banimentos tempor�rios:");
		sender.sendMessage("");
		sender.sendMessage("1. Abuso de bugs (3 dias);");
		sender.sendMessage("2. Anti-Jogo (10 minutos);");
		sender.sendMessage("3. Flood no /tell (30 minutos);");
		sender.sendMessage("4. Mal uso do /report (15 minutos);");
		sender.sendMessage(
				"5. Rastro de programas il�citos (programa que possa te dar alguma vantagem injusta) (7 dias);");
		sender.sendMessage("6. Spam no /tell (30 minutos);");
		sender.sendMessage("7. Uso de nick impr�prio no /fake (15 minutos).");
		sender.sendMessage("Silenciamentos permanentes:");
		sender.sendMessage("1. Divulga��o de v�deos em outros servidores;");
		sender.sendMessage("2. Ofensa ao servidor;");
		sender.sendMessage("3. Xenofobia.");
		sender.sendMessage("");
		sender.sendMessage("Silenciamentos tempor�rios:");
		sender.sendMessage("");
		sender.sendMessage("1. Cita��o de outros servidores (20 minutos);");
		sender.sendMessage("2. Com�rcio (30 minutos);");
		sender.sendMessage("3. Divulga��o de fake (30 minutos);");
		sender.sendMessage("4. Divulga��o de links pornogr�ficos (1 hora);");
		sender.sendMessage("5. Flood (assim que come�ar) (30 minutos);");
	}

	@Command(name = "rg")
	public void rg(BungeeCommandSender sender, String label, String[] args) {
		sender.sendMessage("�e�lREGRAS DE EVENTOS:");
		sender.sendMessage("");
		sender.sendMessage(" � proibido fechamento de cxc sem permiss�o de um Event Manager.");
		sender.sendMessage("Eventos fora de hor�rio devem ser informados para um Event Manager.");
		sender.sendMessage("");
		sender.sendMessage("Sistema de Eventos: Recebera Kick o jogador que:");
		sender.sendMessage("");
		sender.sendMessage("Fizer panela durante um evento.");
		sender.sendMessage("Quebrar as regras do evento.");
		sender.sendMessage("Perturbar ou atrapalhar o desempenho do evento.");
		sender.sendMessage("");
		sender.sendMessage("Realiza��o de Eventos:");
		sender.sendMessage("");
		sender.sendMessage("Estar presente no IP de eventos com anteced�ncia de 10 minutos para organiza��o do mesmo.");
		sender.sendMessage("Avisar com anteced�ncia outro Promotor caso n�o puder realizar seu evento.");
		sender.sendMessage("");
		sender.sendMessage("Abuso:");
		sender.sendMessage("");
		sender.sendMessage("� permanentemente proibido qualquer tipo de abuso ou vantagem para qualquer jogador.");
	}

	@Command(name = "evento", aliases = { "minihype", "event" })
	public void evento(BungeeCommandSender sender, String label, String[] args) {
		if (sender.isPlayer()) {
			ProxiedPlayer player = sender.getPlayer();
			ServerInfo serverInfo = BungeeMain.getInstance().getProxy().getServerInfo("evento");

			if (serverInfo == null) {
				sender.sendMessage("�e�lEVENTO �fN�o foi possivel conectar ao servidor de eventos!");
				return;
			}

			player.connect(serverInfo);

		}

	}

	@Command(name = "winner")
	public void winner(BungeeCommandSender sender, String label, String[] args) {
		sender.sendMessage("�2�lWINNER�f O HypeHG � o unico servidor de HG que possui sistema de tag �2�lWINNER�f,"
				+ " onde voc� recebe um �d�lVIP�f ap�s vencer uma �6�lPARTIDA�f. Voc� poder� escolher qualquer kit e a tag �2�lWINNER�f ir� sobrepor sua tag atual."
				+ ". Mas �c�lTOME CUIDADO�f, a tag �2�lWINNER�f ficar� somente no pr�ximo servidor de HG que voc� entrar ap�s vencer, n�o importa se a partida iniciar ou n�o.");
	}

	@Command(name = "maintenance", aliases = "manu", groupToUse = Group.DONO)
	public void maintenance(BungeeCommandSender sender, String label, String[] args) {
		BungeeMain.maintenance = !BungeeMain.maintenance;
		sender.sendMessage("�c�lMAINTENANCE �fA manuten��o agora est� "
				+ (BungeeMain.maintenance ? "�a�lATIVADO" : "�c�lDESATIVADA") + "�f!");
	}

	@Command(name = "perfil", aliases = { "perfilset" })
	public void perfil(BungeeCommandSender sender, String label, String[] args) {
		if (sender.isPlayer()) {
			ProxiedPlayer p = sender.getPlayer();
			ProxyPlayer pP = ProxyPlayer.getPlayer(p.getUniqueId());
			if (args.length <= 1) {
				sender.sendMessage("�6�lPERFIL�f Utilize: �6�l/perfil�f <yt, twitter, skype, discord, twitch> [...]");
			} else {
				if (args[0].equalsIgnoreCase("yt") || args[0].equalsIgnoreCase("youtube")) {
					String ytChannel = StringUtils.createArgs(1, args, "", false);
					pP.setYoutubeChannel(ytChannel);
					pP.save(DataCategory.PERSONAL_DATA);
					sender.sendMessage("�6�lPERFIL�f O seu canal do �4�lYOUTUBE�f foi alterado para �c�l" + ytChannel);
					if (p.getServer() != null) {
						ByteArrayDataOutput out = ByteStreams.newDataOutput();
						out.writeUTF("PersonalStatus");
						out.writeUTF("YoutubeChannel");
						out.writeUTF(ytChannel);
						p.getServer().sendData("Commons", out.toByteArray());
					}
				} else if (args[0].equalsIgnoreCase("twitter") || args[0].equalsIgnoreCase("tt")) {
					String tt = StringUtils.createArgs(1, args, "", false);
					pP.setTwitter(tt);
					pP.save(DataCategory.PERSONAL_DATA);
					sender.sendMessage("�6�lPERFIL�f O seu �b�lTWITTER�f foi alterado para �3�l" + tt);
					if (p.getServer() != null) {
						ByteArrayDataOutput out = ByteStreams.newDataOutput();
						out.writeUTF("PersonalStatus");
						out.writeUTF("Twitter");
						out.writeUTF(tt);
						p.getServer().sendData("Commons", out.toByteArray());
					}
				} else if (args[0].equalsIgnoreCase("skype")) {
					String skype = StringUtils.createArgs(1, args, "", false);
					pP.setSkype(skype);
					pP.save(DataCategory.PERSONAL_DATA);
					sender.sendMessage("�6�lPERFIL�f O seu �b�lSKYPE�f foi alterado para �3�l" + skype);
					if (p.getServer() != null) {
						ByteArrayDataOutput out = ByteStreams.newDataOutput();
						out.writeUTF("PersonalStatus");
						out.writeUTF("Skype");
						out.writeUTF(skype);
						p.getServer().sendData("Commons", out.toByteArray());
					}
				} else if (args[0].equalsIgnoreCase("discord") || args[0].equalsIgnoreCase("dc")) {
					String dc = StringUtils.createArgs(1, args, "", false);
					pP.setDiscord(dc);
					pP.save(DataCategory.PERSONAL_DATA);
					sender.sendMessage("�6�lPERFIL�f O seu �9�lDISCORD�f foi alterado para �1�l" + dc);
					if (p.getServer() != null) {
						ByteArrayDataOutput out = ByteStreams.newDataOutput();
						out.writeUTF("PersonalStatus");
						out.writeUTF("Discord");
						out.writeUTF(dc);
						p.getServer().sendData("Commons", out.toByteArray());
					}
				} else if (args[0].equalsIgnoreCase("twitch")) {
					String tt = StringUtils.createArgs(1, args, "", false);
					pP.setTwitch(tt);
					pP.save(DataCategory.PERSONAL_DATA);
					sender.sendMessage("�6�lPERFIL�f O seu �3�lTWITCH�f foi alterado para �b�l" + tt);
					if (p.getServer() != null) {
						ByteArrayDataOutput out = ByteStreams.newDataOutput();
						out.writeUTF("PersonalStatus");
						out.writeUTF("Twitch");
						out.writeUTF(tt);
						p.getServer().sendData("Commons", out.toByteArray());
					}
				} else {
					sender.sendMessage(
							"�6�lPERFIL�f Utilize: �6�l/perfil�f <yt, twitter, skype, discord, twitch> [...]");
				}
			}
		} else {
			sender.sendMessage("�4�lERRO�f Comando disponivel apenas �c�lin-game");
		}
	}

	@Command(name = "hungergames", aliases = { "hg", "dk", "doublekit" })
	public void hg(BungeeCommandSender sender, String label, String[] args) {
		if (sender.isPlayer()) {
			ProxiedPlayer p = sender.getPlayer();
			ServerInfo serverInfo = BungeeMain.getInstance().getServerManager()
					.getAvailableServer(ServerType.DOUBLEKITHG);
			if (serverInfo != null) {
				p.connect(serverInfo);
				serverInfo = null;
			} else {
				sender.sendMessage("�4�lERRO �fNenhum servidor disponivel de �c�lDOUBLEKITHG�f foi encontrado!");
			}
			p = null;
		} else {
			sender.sendMessage("�4�lERRO�f Comando disponivel apenas �c�lin-game");
		}
	}

	@Command(name = "teamhg", aliases = { "team" })
	public void teamhg(BungeeCommandSender sender, String label, String[] args) {
		if (sender.isPlayer()) {
			ProxiedPlayer p = sender.getPlayer();
			ServerInfo serverInfo = BungeeMain.getInstance().getServerManager().getAvailableServer(ServerType.TEAMHG);
			if (serverInfo != null) {
				p.connect(serverInfo);
				serverInfo = null;
			} else {
				sender.sendMessage("�4�lERRO �fNenhum servidor disponivel de �c�lTEAMHG�f foi encontrado!");
			}
			p = null;
		} else {
			sender.sendMessage("�4�lERRO�f Comando disponivel apenas �c�lin-game");
		}
	}

	@Command(name = "lobby", aliases = { "hub", "l" })
	public void lobby(BungeeCommandSender sender, String label, String[] args) {
		if (sender.isPlayer()) {
			ProxiedPlayer p = sender.getPlayer();
			ServerInfo serverInfo = BungeeMain.getInstance().getProxy().getServerInfo("lobby");
			if (serverInfo != null) {
				p.connect(serverInfo);
				serverInfo = null;
			} else {
				sender.sendMessage("�4�lERRO �fNenhum servidor disponivel de �c�lLOBBY�f foi encontrado!");
			}
			p = null;
		} else {
			sender.sendMessage("�4�lERRO�f Comando disponivel apenas �c�lin-game");
		}
	}

	@Command(name = "record", aliases = { "gravar", "rec" }, groupToUse = Group.YOUTUBER)
	public void record(BungeeCommandSender sender, String label, String[] args) {
		if (sender.isPlayer()) {
			ProxiedPlayer p = sender.getPlayer();
			ProxyPlayer player = ProxyPlayer.getPlayer(p.getUniqueId());
			String format = (player.hasGroupPermission(Group.YOUTUBERPLUS) ? "�3�lYOUTUBER+ �3" + player.getName()
					: "�b�lYOUTUBER �b" + player.getName());
			TextComponent message = new TextComponent(
					"�4�lYOUTUBE�f O youtuber " + format + "�f esta gravando no servidor �c�l"
							+ player.getServerConnected().toUpperCase() + ".\n�6�lClique para se conectar");
			message.setClickEvent(
					new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/connect " + player.getServerConnected()));
			message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
					new TextComponent[] { new TextComponent("Clique para conectar") }));
			BungeeCord.getInstance().broadcast(TextComponent.fromLegacyText(""));
			BungeeCord.getInstance().broadcast(message);
			BungeeCord.getInstance().broadcast(TextComponent.fromLegacyText(""));
		} else {
			sender.sendMessage("�4�lERRO�f Comando disponivel apenas �c�lin-game");
		}
	}

	@Command(name = "connect", aliases = { "server", "con", "play", "jogar" })
	public void connect(BungeeCommandSender sender, String label, String[] args) {
		if (sender.isPlayer()) {
			ProxiedPlayer p = sender.getPlayer();
			ProxyPlayer player = ProxyPlayer.getPlayer(p.getUniqueId());
			if (args.length == 0) {
				sender.sendMessage(
						"�b�lCONNECT �fUtilize �b�l/connect <server>");
			} else {
				ServerInfo serverInfo = BungeeCord.getInstance().getServerInfo(args[0]);
				if (serverInfo != null) {
					if (!serverInfo.getName().toLowerCase().equals("screenshare")) {
						sender.sendMessage("�aConectando voc� ao servidor...");
						p.connect(serverInfo);
					} else if (player.isStaffer()) {
						p.connect(serverInfo);
					} else {
						sender.sendMessage("�a�lSCREENSHARE�f Este servidor � �c�lRESTRITO");
					}
					serverInfo = null;
				} else {
					sender.sendMessage(
							"�4�lERRO �fNenhum servidor disponivel de �c�l" + args[0] + "�f foi encontrado!");
				}
			}
			player = null;
			p = null;
		} else {
			sender.sendMessage("�4�lERRO�f Comando disponivel apenas �c�lin-game");
		}
	}

	@Completer(name = "connect", aliases = { "server", "con", "play", "jogar" })
	public List<String> connectcompleter(ProxiedPlayer p, String label, String[] args) {
		ArrayList<String> list = new ArrayList<>();
		if (args.length == 1) {
			for (ServerInfo info : BungeeCord.getInstance().getServers().values()) {
				if (info.getName().toLowerCase().startsWith(args[0].toLowerCase())) {
					list.add(info.getName());
				}
			}
		}
		return list;
	}

	@Command(name = "broadcast", aliases = { "bc", "aviso", "alert" }, groupToUse = Group.ADMIN)
	public void broadcast(BungeeCommandSender sender, String label, String[] args) {
		if (sender.isPlayer()) {
			ProxyPlayer proxyPlayer = (ProxyPlayer) WeavenMC.getAccountCommon()
					.getWeavenPlayer(sender.getPlayer().getUniqueId());
			if (proxyPlayer.getGroup() == Group.MODGC) {

				sender.sendMessage("�c�lPERMISSAO�f Voc� n�o tem �c�lPERMISSAO�f para executar este comando!");
				return;
			}
		}
		if (args.length == 0) {
			sender.sendMessage("�4�lBROADCAST�f Utilize: �c�l/broadcast�f <mensagem>");
		} else {
			String message = StringUtils.createArgs(0, args, "", true);
			BungeeCord.getInstance().broadcast(TextComponent.fromLegacyText("�6�lHYPE�f�lMC �F" + message));
			message = null;
			for (ProxiedPlayer o : BungeeCord.getInstance().getPlayers()) {
				ProxyPlayer pP = ProxyPlayer.getPlayer(o.getUniqueId());

				if (pP == null)
					continue;

				if (!pP.hasGroupPermission(Group.DONO))
					continue;

				o.sendMessage(TextComponent.fromLegacyText("�7�o(" + sender.getName() + " enviou um aviso)"));
			}
		}
	}
}
