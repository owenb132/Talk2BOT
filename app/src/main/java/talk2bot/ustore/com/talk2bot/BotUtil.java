package talk2bot.ustore.com.talk2bot;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.ustore.bot.ChatterBot;
import com.ustore.bot.ChatterBotFactory;
import com.ustore.bot.ChatterBotSession;
import com.ustore.bot.ChatterBotType;

/**
 * Created by alisi on 4/18/2016.
 */
public class BotUtil extends AsyncTask<String, String, String> {

    private ChatterBotFactory factory;
    private ChatterBot bot;
    private ChatterBotSession botSession;

    @Override
    protected String doInBackground(String... msg) {

        String result = null;

        try {
            factory = new ChatterBotFactory();

            try {
                bot = factory.create(ChatterBotType.CLEVERBOT);
            } catch (Exception e) {
                e.printStackTrace();
            }
            botSession = bot.createSession();
            result =  botSession.think(msg[0]);

            Log.e("oi",result);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


    @Override
    protected void onPostExecute(String result) {

        ChatScreen.getContext().insertMessage(result,R.drawable.bola);
    }

}
