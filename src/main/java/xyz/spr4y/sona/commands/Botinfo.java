package xyz.spr4y.sona.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class Botinfo extends Command {

    public Botinfo() {
        super.name = "botinfo";
    }
    @Override
    protected void execute(CommandEvent event) {
        event.reply("BotInfo.");
    }
}