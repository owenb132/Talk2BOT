package talk2bot.ustore.com.talk2bot;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import java.util.LinkedList;

public class ChatListActivity extends Activity {

    private static ChatListActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);

        instance = this;

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());

        LinkedList<ChatListRepresentation> chats = new LinkedList<ChatListRepresentation>();
        chats.add(new ChatListRepresentation("Alison Carrera", "Click here to chat bot", R.drawable.camera2));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.bola));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.bola));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.camera2));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.bola));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.camera2));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.bola));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.bola));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.camera2));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.bola));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.bola));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.camera2));
        chats.add(new ChatListRepresentation("Lorem Ipsum", "It's an example, I can't do anything here.", R.drawable.bola));


        ChatListAdapter adapter = new ChatListAdapter(chats);
        rv.setAdapter(adapter);


    }

    public static ChatListActivity getContext()
    {
        return instance;
    }
}
