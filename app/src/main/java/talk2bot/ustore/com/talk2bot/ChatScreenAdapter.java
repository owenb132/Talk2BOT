package talk2bot.ustore.com.talk2bot;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.LinkedList;

/**
 * Created by alisi on 4/17/2016.
 */
public class ChatScreenAdapter extends RecyclerView.Adapter<ChatScreenViewHolder>{

    private LinkedList<ChatScreenRepresentation> chats;

    public ChatScreenAdapter(LinkedList<ChatScreenRepresentation> chats){
        this.chats = chats;
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    @Override
    public ChatScreenViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_chatlist, viewGroup, false);
        ChatScreenViewHolder pvh = new ChatScreenViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ChatScreenViewHolder chatListView, final int i) {
        chatListView.getMessage().setText(chats.get(i).getMessage());
        chatListView.getImage().setImageResource(chats.get(i).getPhotoID());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
