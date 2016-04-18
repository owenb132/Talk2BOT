package talk2bot.ustore.com.talk2bot;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.LinkedList;

public class ChatScreen extends Activity {

    private LinkedList<ChatScreenRepresentation> chats;
    private RecyclerView rv;
    private static ChatScreen sc;
    private ImageButton button;
    private EditText msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_screen);
        sc = this;
        chats = new LinkedList<ChatScreenRepresentation>();
        LinearLayoutManager ll = new LinearLayoutManager(this);
        //ll.setReverseLayout(true);
        ll.setStackFromEnd(true);


        button = (ImageButton)findViewById(R.id.send);
        msg = (EditText)findViewById(R.id.message);

        rv = (RecyclerView)findViewById(R.id.rvChat);
        rv.setLayoutManager(ll);
        rv.setItemAnimator(new DefaultItemAnimator());

        ChatScreenAdapter ap = new ChatScreenAdapter(chats);
        rv.setAdapter(ap);

        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg.setText("");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new BotUtil().execute(msg.getText().toString());
                chats.add(new ChatScreenRepresentation(msg.getText().toString(),R.drawable.camera2));
                rv.getAdapter().notifyDataSetChanged();
                msg.setText("");
                rv.scrollToPosition(chats.size() -1);
            }
        });
    }

    public void insertMessage(String msg, int photo)
    {
        Log.e("oi","chamei2");
        chats.add(new ChatScreenRepresentation(msg,photo));
        rv.getAdapter().notifyDataSetChanged();
        rv.scrollToPosition(chats.size() -1);
    }

    public static ChatScreen getContext()
    {
        return  sc;
    }


}
