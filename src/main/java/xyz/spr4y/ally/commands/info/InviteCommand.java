package xyz.spr4y.ally.commands.info;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

import java.awt.*;

public class InviteCommand extends Command {

    public InviteCommand() {
        super.name = "invite";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("Olá eu sou a **"+event.getJDA().getSelfUser().getName()+"**, uma simples bot para o discord!\nMe convide: https://ally.spr4y.xyz");
    }
}

