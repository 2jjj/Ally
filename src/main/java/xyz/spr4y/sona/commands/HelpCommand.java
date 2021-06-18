package xyz.spr4y.sona.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;

import java.awt.Color;

public class HelpCommand extends Command {

    EmbedBuilder eb = new EmbedBuilder();

    public HelpCommand() {
        super.name = "ajuda";
    }
    @Override
    protected void execute(CommandEvent event) {
        eb.setTitle("Precisa de ajuda?\nAqui embaixo estão meus comandos!\n", null);
        eb.setColor(Color.red);
        eb.setColor(new Color(0xF40C0C));
        eb.setColor(new Color(255, 0, 54));
        eb.setDescription("s!ping\ns!help");
        //eb.addField("field", "field", false);
        //eb.addBlankField(false);
        eb.setAuthor("Sona - ajuda", null, event.getAuthor().getAvatarUrl());
        eb.setFooter("Comando de ajuda usado por" + event.getAuthor().getName() + "#" + event.getAuthor().getDiscriminator(), event.getAuthor().getAvatarUrl());
        eb.setImage("http://www.fapcom.edu.br/wp-content/uploads/2017/04/estudando.gif");
        //eb.setThumbnail("IMG-LINK");

        event.reply(eb.build());
    }
}
