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
        eb.setTitle("Sona - Help", null);
        eb.setColor(Color.red);
        eb.setColor(new Color(0xF40C0C));
        eb.setColor(new Color(255, 0, 54));
        eb.setDescription("Meus comandos");
        eb.addField("field", "field", false);
        eb.addBlankField(false);
        //eb.setAuthor("SONA", null, "http://www.fapcom.edu.br/wp-content/uploads/2017/04/estudando.gif");
        eb.setFooter("Comando de ajuda", "https://cdn.discordapp.com/embed/avatars/3.png?size=2048");
        eb.setImage("http://www.fapcom.edu.br/wp-content/uploads/2017/04/estudando.gif");
        //eb.setThumbnail("http://www.fapcom.edu.br/wp-content/uploads/2017/04/estudando.gif");

        event.reply(eb.build());
    }
}
