package com.brqdford.help;

import com.google.inject.Inject;
import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.CommandInvocation;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.command.SimpleCommand;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.event.HoverEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.slf4j.Logger;
import org.w3c.dom.Text;

@Plugin(id = "help", name = "Help", version = "1.0", description = "help", authors = {"Brqdford"})
public class helpmain {
    private final ProxyServer server;

    @Inject
    public helpmain(ProxyServer server, Logger logger) {
        this.server = server;
    }


    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {


        this.server.getCommandManager().register("help", (Command)new SimpleCommand() {
            public String serverName(CommandSource source) {
                if (source instanceof Player)
                    return ((Player)source).getCurrentServer().get().getServerInfo().getName();
                return "proxy";
            }
            public void execute(Invocation invocation) {

                if (serverName(invocation.source()).equals("build")) {
                    invocation.source().sendMessage(Component.text("        ---------- (Creative Server Help) ----------").color((TextColor) NamedTextColor.AQUA));
                    invocation.source().sendMessage(Component.text("Default player commands").color((TextColor) NamedTextColor.GOLD).clickEvent(ClickEvent.runCommand("/help1")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.GOLD)));
                    invocation.source().sendMessage(Component.text("Plot commands").color((TextColor) NamedTextColor.GREEN).clickEvent(ClickEvent.runCommand("/claiminghelp")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.GREEN)));
                    invocation.source().sendMessage(Component.text("Roleplay commands").color((TextColor) NamedTextColor.DARK_PURPLE).clickEvent(ClickEvent.runCommand("/roleplayhelp")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.DARK_PURPLE)));
                    invocation.source().sendMessage(Component.text("Groupchat Help").color((TextColor) NamedTextColor.AQUA).clickEvent(ClickEvent.runCommand("/group help")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.AQUA)));
                    invocation.source().sendMessage(Component.text("Player warp commands").color((TextColor) NamedTextColor.DARK_RED).clickEvent(ClickEvent.runCommand("/playerwarp help")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.DARK_RED)));
                    invocation.source().sendMessage(Component.text("Voting Help").color((TextColor) NamedTextColor.YELLOW).clickEvent(ClickEvent.runCommand("/votehelp")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.YELLOW)));
                    invocation.source().sendMessage(Component.text("Server links and contact").color((TextColor) NamedTextColor.LIGHT_PURPLE).clickEvent(ClickEvent.runCommand("/serverlinks")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.LIGHT_PURPLE)));
                    invocation.source().sendMessage(Component.text("Party Help").color((TextColor) NamedTextColor.DARK_PURPLE).clickEvent(ClickEvent.runCommand("/party")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.DARK_PURPLE)));
                    invocation.source().sendMessage(Component.text("Friend help").color((TextColor) NamedTextColor.DARK_AQUA).clickEvent(ClickEvent.runCommand("/friend")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.DARK_AQUA)));
                    invocation.source().sendMessage(Component.text("Rules").color((TextColor) NamedTextColor.RED).clickEvent(ClickEvent.runCommand("/rules")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.RED)));
                    invocation.source().sendMessage(Component.text("Click on text to see menus.").color((TextColor) NamedTextColor.RED));
                } else {
                    invocation.source().sendMessage(Component.text("        ---------- (Help) ----------").color((TextColor) NamedTextColor.RED));
                    invocation.source().sendMessage(Component.text("Default player commands").color((TextColor) NamedTextColor.GOLD).clickEvent(ClickEvent.runCommand("/help1")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.GOLD)));
                    invocation.source().sendMessage(Component.text("Claiming commands").color((TextColor) NamedTextColor.GREEN).clickEvent(ClickEvent.runCommand("/claiminghelp")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.GREEN)));
                    invocation.source().sendMessage(Component.text("Chunk Loading commands").color((TextColor) NamedTextColor.AQUA).clickEvent(ClickEvent.runCommand("/chunkloadinghelp")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.AQUA)));
                    invocation.source().sendMessage(Component.text("Player warp commands").color((TextColor) NamedTextColor.DARK_RED).clickEvent(ClickEvent.runCommand("/playerwarp help")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.DARK_RED)));
                    invocation.source().sendMessage(Component.text("Voting Help").color((TextColor) NamedTextColor.YELLOW).clickEvent(ClickEvent.runCommand("/votehelp")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.YELLOW)));
                    invocation.source().sendMessage(Component.text("Player Shop commands").color((TextColor) NamedTextColor.DARK_GREEN).clickEvent(ClickEvent.runCommand("/shophelp")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.DARK_GREEN)));
                    invocation.source().sendMessage(Component.text("Server links and contact").color((TextColor) NamedTextColor.LIGHT_PURPLE).clickEvent(ClickEvent.runCommand("/serverlinks")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.LIGHT_PURPLE)));
                    invocation.source().sendMessage(Component.text("Party Help").color((TextColor) NamedTextColor.DARK_PURPLE).clickEvent(ClickEvent.runCommand("/party")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.DARK_PURPLE)));
                    invocation.source().sendMessage(Component.text("Friend help").color((TextColor) NamedTextColor.DARK_AQUA).clickEvent(ClickEvent.runCommand("/friend")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.DARK_AQUA)));
                    invocation.source().sendMessage(Component.text("Rules").color((TextColor) NamedTextColor.RED).clickEvent(ClickEvent.runCommand("/rules")).hoverEvent(Component.text("Click me.").color((TextColor) NamedTextColor.RED)));
                    invocation.source().sendMessage(Component.text("Click on text to see menus.").color((TextColor) NamedTextColor.RED));
                }
            }
        },  new String[] { "helpme" });
        this.server.getCommandManager().register("help1", (Command)new SimpleCommand() {
            public String serverName(CommandSource source) {
                if (source instanceof Player)
                    return ((Player)source).getCurrentServer().get().getServerInfo().getName();
                return "proxy";
            }
            public void execute(Invocation invocation) {
                if (serverName(invocation.source()).equals("build")) {
                    invocation.source().sendMessage(Component.text("        ---------- (Default Player Commands) ----------").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/help (Player help.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/list (Shows online players.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/report (Report an online player.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/msg /r (Message other players.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/vmsg /vr (Message players on any server.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/gamemode (Ability to change your gamemode into survival or creative.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/skychanger (Change colors/weather of your sky More info: https://github.com/dscalzi/SkyChanger/wiki#commands.)").color((TextColor) NamedTextColor.GOLD).clickEvent(ClickEvent.openUrl("https://github.com/dscalzi/SkyChanger/wiki#commands")));
                    invocation.source().sendMessage(Component.text("/sethome /delhome /home (Home commands. (Defaults have 1 home.))").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/tpa /tpahere (Teleporting to another player.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/tpaccept /tpdeny (Accept or deny teleport requests.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/back (Teleport back to your last location.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/ignore (Ignore another player.)").color((TextColor) NamedTextColor.GOLD));
                } else {
                    invocation.source().sendMessage(Component.text("        ---------- (Default Player Commands) ----------").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/help (Player help.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/list (Shows online players.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/report (Report an online player.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/msg /r (Message other players.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/vmsg /vr (Message players on any server.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/pointshop (Opens points shop menu.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/bal /pay (Check balance/pay another player.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/sethome /delhome /home (Home commands. (Defaults have 1 home.))").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/tpa /tpahere (Teleporting to another player.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/tpaccept /tpdeny (Accept or deny teleport requests.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/spawn (Teleport to server spawn.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/back (Teleport back to your last location.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/rtp (Teleport to a random spot on the server.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/trash (Opens trash can.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/seen (See when a player was last online.)").color((TextColor) NamedTextColor.GOLD));
                    invocation.source().sendMessage(Component.text("/ignore (Ignore another player.)").color((TextColor) NamedTextColor.GOLD));
                }
            }
        },  new String[] { "commandshelp"});
        this.server.getCommandManager().register("claiminghelp", (Command)new SimpleCommand() {
            public String serverName(CommandSource source) {
                if (source instanceof Player)
                    return ((Player)source).getCurrentServer().get().getServerInfo().getName();
                return "proxy";
            }
            public void execute(Invocation invocation) {
                if (serverName(invocation.source()).equals("build")) {
                    invocation.source().sendMessage(Component.text("        ---------- (Plot Commands) ----------").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot claim (Claim a plot you are standing on.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot auto (Automatically claim a random plot.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot home (Teleport to your plot.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot delete (Delete a plot you are standing on.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot add  (Allows a user to build in your plot while you are online.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot trust (Allows a player to build in your plot when you are offline..)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot remove /plot untrust (Remove a player from building from your plot.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot merge <all|n|e|s|w> (Merge multiple plots together.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot kick (Kick a player from your plot.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot deny (Deny a player from entering your plot.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/plot help (Other commands not listed here.)").color((TextColor) NamedTextColor.GREEN));
                } else {
                    invocation.source().sendMessage(Component.text("        ---------- (Claiming Commands) ----------").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("https://youtu.be/SbSbO2_bpgo").color((TextColor) NamedTextColor.GREEN).clickEvent(ClickEvent.openUrl("https://youtu.be/SbSbO2_bpgo")));
                    invocation.source().sendMessage(Component.text("(Default members have a total of 5000 claim blocks.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("(Buy more claim blocks with /pointshop.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("(Use a gold shovel to right/left click two opposite corners.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("(Buy more claim blocks with /pointshop.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/rp claim <claimname> (Claims a region that is selected.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/rp delete (Deletes a region.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/rp flag (Opens GUI to change your regions flags.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/rp addmember /rp removemember (Add/remove a member to your region.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/rp redefine <claimname> (Redefine a current region.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/rp welcome (Set welcome message in your region.)").color((TextColor) NamedTextColor.GREEN));
                    invocation.source().sendMessage(Component.text("/rp rename (Rename a current region.)").color((TextColor) NamedTextColor.GREEN));
                }
            }
        },  new String[] { "help2"});
        this.server.getCommandManager().register("roleplayhelp", (Command)new SimpleCommand() {
            public void execute(Invocation invocation) {
                invocation.source().sendMessage(Component.text("        ---------- (Roleplay commands) ----------").color((TextColor)NamedTextColor.DARK_PURPLE));
                invocation.source().sendMessage(Component.text("/role <Rolename> or /role clear (Change your current role or clear your role.(Roles appear above your head, and in Group Chat messages.))").color((TextColor) NamedTextColor.DARK_PURPLE));
                invocation.source().sendMessage(Component.text("/marry help (Shows commands to marry another player.)").color((TextColor) NamedTextColor.DARK_PURPLE));
                invocation.source().sendMessage(Component.text("/blue or /pink or /nameclear (Change your names color to blue or pink or back to normal.)").color((TextColor) NamedTextColor.DARK_PURPLE));
                invocation.source().sendMessage(Component.text("/cry /laugh /hug <player> /kiss <player> /slap <player> /poke <player> (Emotion commands.)").color((TextColor) NamedTextColor.DARK_PURPLE));
            }
        },  new String[] { "rphelp"});
        this.server.getCommandManager().register("chunkloadinghelp", (Command)new SimpleCommand() {
            public void execute(Invocation invocation) {
                invocation.source().sendMessage(Component.text("        ---------- (Chunk Loading Commands) ----------").color((TextColor)NamedTextColor.AQUA));
                invocation.source().sendMessage(Component.text("(Place iron block or diamond block and right click with a blazerod to chunkload.)").color((TextColor)NamedTextColor.AQUA));
                invocation.source().sendMessage(Component.text("(Buy more chunk loaders with /pointshop.)").color((TextColor)NamedTextColor.AQUA));
                invocation.source().sendMessage(Component.text("/bcl list (Lists your current chunkloaders.)").color((TextColor)NamedTextColor.AQUA));
                invocation.source().sendMessage(Component.text("/bcl chunks or /bcl bal (Shows how many chunks you can load.)").color((TextColor)NamedTextColor.AQUA));
            }
        },  new String[] { "help3"});
        this.server.getCommandManager().register("votehelp", (Command)new SimpleCommand() {
            public String serverName(CommandSource source) {
                if (source instanceof Player)
                    return ((Player)source).getCurrentServer().get().getServerInfo().getName();
                return "proxy";
            }
            public void execute(Invocation invocation) {
                if (serverName(invocation.source()).equals("build")) {
                    invocation.source().sendMessage(Component.text("        ---------- (Vote Help) ----------").color((TextColor) NamedTextColor.YELLOW));
                    invocation.source().sendMessage(Component.text("(Voting will give you 60 minutes of worldedit.)").color((TextColor) NamedTextColor.YELLOW));
                    invocation.source().sendMessage(Component.text("/vote (Shows links to vote.)").color((TextColor) NamedTextColor.YELLOW));
                } else {
                    invocation.source().sendMessage(Component.text("        ---------- (Vote Help) ----------").color((TextColor) NamedTextColor.YELLOW));
                    invocation.source().sendMessage(Component.text("(Voting will give you 1 crate key and $10.)").color((TextColor) NamedTextColor.YELLOW));
                    invocation.source().sendMessage(Component.text("/vote (Shows links to vote.)").color((TextColor) NamedTextColor.YELLOW));
                }
            }
        },  new String[] { "help5" });
        this.server.getCommandManager().register("serverlinks", (Command)new SimpleCommand() {
            public void execute(Invocation invocation) {
                invocation.source().sendMessage(Component.text("        ---------- (Server Links and Contact) ----------").color((TextColor)NamedTextColor.LIGHT_PURPLE));
                invocation.source().sendMessage(Component.text("/discord (Link to server discord.)").color((TextColor)NamedTextColor.LIGHT_PURPLE));
                invocation.source().sendMessage(Component.text("/website (Link to forums website.)").color((TextColor)NamedTextColor.LIGHT_PURPLE));
                invocation.source().sendMessage(Component.text("/store (Link to our server store.)").color((TextColor)NamedTextColor.LIGHT_PURPLE));
                invocation.source().sendMessage(Component.text("/server (Teleport to another server.)").color((TextColor)NamedTextColor.LIGHT_PURPLE));
                invocation.source().sendMessage(Component.text("/staff (Show online staff.)").color((TextColor)NamedTextColor.LIGHT_PURPLE));
                invocation.source().sendMessage(Component.text("/banneditems (List of current banned items on server.)").color((TextColor)NamedTextColor.LIGHT_PURPLE));
            }
        },  new String[] { "help7" });
        this.server.getCommandManager().register("shophelp", (Command)new SimpleCommand() {
            public void execute(Invocation invocation) {
                invocation.source().sendMessage(Component.text("        ---------- (Player Shop Commands) ----------").color((TextColor)NamedTextColor.DARK_GREEN));
                invocation.source().sendMessage(Component.text("(You gain money by voting.)").color((TextColor)NamedTextColor.DARK_GREEN));
                invocation.source().sendMessage(Component.text("(You can create a player warp by doing /playerwarp)").color((TextColor)NamedTextColor.DARK_GREEN));
                invocation.source().sendMessage(Component.text("1.12.2 Shop Help (https://imgur.com/gallery/VNF4kly)").color((TextColor)NamedTextColor.DARK_GREEN).clickEvent(ClickEvent.openUrl("https://imgur.com/gallery/VNF4kly")).hoverEvent(Component.text("https://imgur.com/gallery/VNF4kly").color((TextColor)NamedTextColor.DARK_GREEN)));
                invocation.source().sendMessage(Component.text("1.7.10 Shop Help (https://imgur.com/H0g3pa9)").color((TextColor)NamedTextColor.DARK_GREEN).clickEvent(ClickEvent.openUrl("https://imgur.com/H0g3pa9")).hoverEvent(Component.text("https://imgur.com/H0g3pa9").color((TextColor)NamedTextColor.DARK_GREEN)));
            }
        },  new String[] { "help6" });
    }
}
