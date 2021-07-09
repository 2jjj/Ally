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
        eb.setColor(Color.red);
        eb.setColor(new Color(0xF40C0C));
        eb.setColor(new Color(255, 0, 54));
        eb.setDescription("Meus comandos:\n\n `s!ping\ns!help\ns!botinfo`");
        eb.setAuthor("Ally - ajuda", null, event.getAuthor().getAvatarUrl());
        eb.setFooter("Requisitado por " + event.getAuthor().getName() + "#" + event.getAuthor().getDiscriminator(), event.getAuthor().getAvatarUrl());
        //eb.setImage("https://wi.wallpapertip.com/wsimgs/10-105111_darling-in-the-franxx-zero-two.jpg");
        //eb.setThumbnail("IMG-LINK");
        event.reply(eb.build());
    }
}
