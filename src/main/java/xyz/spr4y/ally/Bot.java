package xyz.spr4y.ally;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import xyz.spr4y.ally.commands.BotinfoCommand;
import xyz.spr4y.ally.commands.HelpCommand;
import xyz.spr4y.ally.commands.PingCommand;
import xyz.spr4y.ally.commands.ServerInfoCommand;

import javax.security.auth.login.LoginException;


public class Bot {

    String token = Config.get("TOKEN");

    private Bot() throws LoginException {
        JDA jda = JDABuilder.createDefault(token).build();

        CommandClientBuilder builder = new CommandClientBuilder();
        builder.setPrefix("a!");
        builder.setOwnerId("836345581424738354");
        builder.setActivity(Activity.watching("Feito pelo Spray!"));

        CommandClient client = builder.build();
        client.addCommand(new PingCommand());
        client.addCommand(new HelpCommand());
        client.addCommand(new BotinfoCommand());
        client.addCommand(new ServerInfoCommand());

        jda.addEventListener(client);

    }

    public static void main(String[] args) throws LoginException {
        long enable = System.currentTimeMillis();
        new Bot();
        System.out.println("[LOGS] O bot foi iniciado em " + (System.currentTimeMillis() - enable) + "ms!");
    }
}