package talk2bot.ustore.com.talk2bot;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alisi on 4/17/2016.
 */
public class ChatScreenViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView message;
    private TextView description;
    private ImageView image;

    public ChatScreenViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView)itemView.findViewById(R.id.cv);
        cardView.setBackgroundColor(Color.WHITE);
        message = (TextView)itemView.findViewById(R.id.name);
        message.setTextColor(Color.BLACK);
        message.setTextSize(10);
        description = (TextView)itemView.findViewById(R.id.description);
        description.setEnabled(false);
        image = (ImageView)itemView.findViewById(R.id.image);
        image.getLayoutParams().width = 50;
        image.getLayoutParams().height = 50;
    }

    public TextView getMessage() {
        return message;
    }

    public void setMessage(TextView message) {
        this.message = message;
    }

    public CardView getCardView() {
        return cardView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
