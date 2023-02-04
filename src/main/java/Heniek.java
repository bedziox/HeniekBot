import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;


public class Heniek {
    public static void main(String[] args) throws LoginException {
        Dotenv dotenv = Dotenv.configure().load();
        JDABuilder jdaBuilder = JDABuilder.createDefault(dotenv.get("BOT_TOKEN"));
        try{
            jdaBuilder.build();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
