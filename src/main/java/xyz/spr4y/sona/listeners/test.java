package xyz.spr4y.sona.listeners;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static xyz.spr4y.sona.Bot.prefix;

public class test extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();

        if(messageSent.equalsIgnoreCase(prefix + "ping")) {
            event.getChannel().sendMessage("Pong!").queue();
        }

    }
}
