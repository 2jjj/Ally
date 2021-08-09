package xyz.spr4y.ally.commands.fun;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import xyz.spr4y.ally.utils.VaporwaveUtils;

public class SayCommand extends Command {

    public SayCommand() {
        super.name = "say";
    }

    @Override
    protected void execute(CommandEvent event) {
      if(event.getArgs().length() >= 0) {
          event.reply(event.getArgs() + "\n\n- " + event.getAuthor().getName() + "#" + event.getAuthor().getDiscriminator());
          System.out.println(event.getArgs());
      }
    }
}
