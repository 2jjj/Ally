package xyz.spr4y.sona.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class PingCommand extends Command {

    public PingCommand() {
        super.name = "ping";
    }
    @Override
    protected void execute(CommandEvent event) {
        event.reply("Pong! **|** " + event.getJDA().getGatewayPing() + "!");
    }
}
