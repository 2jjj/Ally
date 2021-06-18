package xyz.spr4y.sona.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class BotinfoCommand extends Command {

    EmbedBuilder eb = new EmbedBuilder();

    public BotinfoCommand() {
        super.name = "botinfo";
    }
    @Override
    protected void execute(CommandEvent event) {
        eb.setColor(Color.red);
        eb.setColor(new Color(0xF40C0C));
        eb.setColor(new Color(255, 0, 54));
        eb.setDescription("Me chamo Sona e fui criado pelo Spray#0007 em **JDA** com a linguagem **Java**, espero que goste de mim!\n\n**Algumas informações:**\N\n<:early_developer_badge:854716150076538901> **| Developer: Spray#0007**");
        eb.setAuthor("Minhas informações!", null, event.getAuthor().getAvatarUrl());
        eb.setFooter("Requisitado por " + event.getAuthor().getName() + "#" + event.getAuthor().getDiscriminator(), event.getAuthor().getAvatarUrl());
        eb.setThumbnail(event.getAuthor().getAvatarUrl());
        event.reply(eb.build());
    }
}