package xyz.spr4y.ally.commands.info;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class PingCommand extends Command {

    public PingCommand() {
        super.name = "ping";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply(":ping_pong: **|** **Pong!**\n**:stopwatch: **|** Gateway Ping:** `" + event.getJDA().getGatewayPing() + "ms`");
    }
}
