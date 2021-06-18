package xyz.spr4y.sona.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.Color;

public class HelpCommand extends Command {
    EmbedBuilder eb = new EmbedBuilder();

    public HelpCommand() {
        super.name = "help";
    }
    @Override
    protected void execute(CommandEvent event) {
            event.reply("Help.");
    }
}
