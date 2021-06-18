package xyz.spr4y.sona;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import xyz.spr4y.sona.listeners.test;

import javax.security.auth.login.LoginException;

public class Bot {

    public static JDABuilder builder;
    public static String prefix;

    public static void main(String[] args) throws LoginException {
        String token = Config.get("TOKEN");
        prefix = "s!";
        builder = JDABuilder.createDefault(token);
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setCompression(Compression.NONE);
        builder.setActivity(Activity.playing("Sona - s!help"));
        //builder.enableCache(GatewayIntent.GUILD_MEMBERS);
        registerListeners();

        builder.build();
    }
    public static void registerListeners() {
        builder.addEventListeners(new test());
    }

}

