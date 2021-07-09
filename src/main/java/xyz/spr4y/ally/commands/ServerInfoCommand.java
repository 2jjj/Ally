package xyz.spr4y.ally.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Role;

import java.util.stream.Collectors;

public class ServerInfoCommand extends Command {

    EmbedBuilder eb = new EmbedBuilder();

    public ServerInfoCommand() {
        super.name = "serverinfo";
    }

    @Override
    protected void execute(CommandEvent event) {
        EmbedBuilder embed = new EmbedBuilder();

        embed.setThumbnail(event.getGuild().getIconUrl());
        embed.setTitle(event.getGuild().getName(), null);
        embed.addField("ID", event.getGuild().getId(), true);
        embed.addField("Nome", event.getGuild().getName(), true);
        embed.addField("Dono", event.getGuild().getOwner().getUser().getName() + "#" + event.getGuild().getOwner().getUser().getDiscriminator(), true);
        embed.addField("Região", event.getGuild().getRegion().getName(), true);
        embed.addField("Canais", String.valueOf(event.getGuild().getTextChannels().size()), true);
        embed.addField("Membros", String.valueOf(event.getGuild().getMembers().size()), true);
        embed.addField("Pessoas", String.valueOf(event.getGuild().getMembers().stream().filter((member) -> !member.getUser().isBot()).collect(Collectors.toList()).size()), true);
        embed.addField("Bots", String.valueOf(event.getGuild().getMembers().stream().filter((member) -> member.getUser().isBot()).collect(Collectors.toList()).size()), true);
        embed.addField("Online", String.valueOf(event.getGuild().getMembers().stream().filter((member) -> member.getOnlineStatus() != OnlineStatus.OFFLINE).collect(Collectors.toList()).size()), true);

        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Role r : event.getGuild().getRoles()) {
            if (first) {
                sb.append(r.getName());
                first = false;
            } else {
                sb.append(", ");
                sb.append(r.getName());
            }
        }
        embed.addField("Cargos", sb.toString(), true);
        embed.setFooter("Serverinfo - Ally", null);
        event.reply(embed.build());
    }
}
