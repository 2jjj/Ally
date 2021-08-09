package xyz.spr4y.ally.commands.info;

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
        eb.setColor(new Color(0xE26F6F));
        eb.setColor(new Color(255, 0, 54));
        eb.setDescription("Me chamo Ally e fui criada pelo Spray#7725 em **Java(JDA)**, espero que goste de mim!\n\n**Algumas informações:**\n<:early_developer_badge:854716150076538901> **| Developer: Spray#0007**");
        eb.setAuthor("Minhas informações!", null, event.getAuthor().getAvatarUrl());
        eb.setFooter("Requisitado por " + event.getAuthor().getName() + "#" + event.getAuthor().getDiscriminator(), event.getAuthor().getAvatarUrl());
        eb.setThumbnail(event.getAuthor().getAvatarUrl());
        event.reply(eb.build());
    }
}