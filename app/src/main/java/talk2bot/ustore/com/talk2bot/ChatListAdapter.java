package talk2bot.ustore.com.talk2bot;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.Timer;

/**
 * Created by alisi on 4/17/2016.
 */
public class ChatListAdapter extends RecyclerView.Adapter<ChatListViewHolder>{

    private LinkedList<ChatListRepresentation> chats;

    public ChatListAdapter(LinkedList<ChatListRepresentation> chats){
        this.chats = chats;
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    @Override
    public ChatListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_chatlist, viewGroup, false);
        ChatListViewHolder pvh = new ChatListViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ChatListViewHolder chatListView, final int i) {
        chatListView.getName().setText(chats.get(i).getName());
        chatListView.getDescription().setText(chats.get(i).getDescription());
        chatListView.getImage().setImageResource(chats.get(i).getPhotoID());

        chatListView.getCardView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(ChatListActivity.getContext(), android.R.anim.slide_out_right);
                v.startAnimation(animation);

                if(i == 0) {
                    changeActivity(v, v.getAnimation().getDuration());
                }

            }
        });
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    private void changeActivity(final View v, long time)
    {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                /*Intent intent = new Intent(ChatListActivity.getContext(), ChatScreen.class);

                ChatListActivity.getContext().startActivity(intent);*/

                ChatListActivity.getContext().getWindow().setExitTransition(new Slide());
                Intent intent = new Intent(ChatListActivity.getContext(), ChatScreen.class);
                ChatListActivity.getContext().startActivity(intent,
                        ActivityOptions
                                .makeSceneTransitionAnimation(ChatListActivity.getContext()).toBundle());
            }
        }, time - 100);

    }
}
