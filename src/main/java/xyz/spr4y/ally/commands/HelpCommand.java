package xyz.spr4y.ally.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.Color;

public class HelpCommand extends Command {

    EmbedBuilder eb = new EmbedBuilder();

    public HelpCommand() {
        super.name = "ajuda";
    }

    @Override
    protected void execute(CommandEvent event) {
        eb.setColor(new Color(19, 220, 175));
        eb.setDescription("Meus comandos:\n\n `a!ping\na!help\na!botinfo`");
        eb.setAuthor("Ajuda", null, event.getAuthor().getAvatarUrl());
        eb.setFooter("Requisitado por " + event.getAuthor().getName() + "#" + event.getAuthor().getDiscriminator(), event.getAuthor().getAvatarUrl());
        event.reply(eb.build());
    }
}
