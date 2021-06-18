package xyz.spr4y.sona;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import xyz.spr4y.sona.commands.BotinfoCommand;
import xyz.spr4y.sona.commands.HelpCommand;
import xyz.spr4y.sona.commands.PingCommand;

import javax.security.auth.login.LoginException;


public class Bot {

    String token = Config.get("TOKEN");

    private Bot() throws LoginException {
        JDA jda = JDABuilder.createDefault(token).build();

        CommandClientBuilder builder = new CommandClientBuilder();
        builder.setPrefix("s!");
        builder.setOwnerId("836345581424738354");
        //builder.setHelpWord("help");
        builder.setActivity(Activity.watching("s!help"));

        CommandClient client = builder.build();
        client.addCommand(new PingCommand());
        client.addCommand(new HelpCommand());
        client.addCommand(new BotinfoCommand());

        jda.addEventListener(client);

    }

    public static void main(String[] args) throws LoginException {
        long enable = System.currentTimeMillis();
        new Bot();
        System.out.println("[LOGS] O bot foi iniciado em " + (System.currentTimeMillis() - enable) + "ms!");
    }
}