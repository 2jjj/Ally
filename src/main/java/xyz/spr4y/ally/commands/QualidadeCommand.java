package xyz.spr4y.ally.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import xyz.spr4y.ally.utils.VaporwaveUtils;

public class QualidadeCommand extends Command {

    public QualidadeCommand() {
        super.name = "qualidade";
    }

    @Override
    protected void execute(CommandEvent event) {
        if (event.getArgs().length() >= 1) {
            String qualidade = VaporwaveUtils.vaporwave(String.join(" ", event.getArgs()));

            StringBuilder sb = new StringBuilder();
            for (char ch : qualidade.toCharArray()) {
                if (Character.isLetterOrDigit(ch)) {
                    sb.append(Character.toUpperCase(ch));
                    sb.append(" ");
                } else {
                    sb.append(ch);
                }
            }
            event.reply(sb.toString());
        }
    }
}
