package xyz.spr4y.sona.listeners;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static xyz.spr4y.sona.Bot.prefix;

public class test extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if(messageSent.equalsIgnoreCase("hello")) {
            event.getMessage().delete().queue();
            event.getChannel().sendMessage("Hello!").queue();
            return;
        }
        if(messageSent.equalsIgnoreCase(prefix + "help")) {
            event.getMessage().delete().queue();
            event.getChannel().sendMessage("Commands:").queue();
            event.getChannel().sendMessage("- help").queue();
            event.getChannel().sendMessage("- announce").queue();
        }
        if(messageSent.equalsIgnoreCase(prefix+ "announce")) {
            event.getMessage().delete().queue();
            event.getChannel().sendMessage("Sending announcement").queue();
            event.getGuild().getTextChannelById("802766597184815124").sendMessage("Annoucement Test").queue();

        }
    }
}
