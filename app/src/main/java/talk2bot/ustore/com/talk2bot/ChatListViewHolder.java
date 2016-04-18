package talk2bot.ustore.com.talk2bot;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alisi on 4/17/2016.
 */
public class ChatListViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView name;
    private TextView description;
    private ImageView image;

    public ChatListViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView)itemView.findViewById(R.id.cv);
        cardView.setBackgroundColor(Color.WHITE);
        name = (TextView)itemView.findViewById(R.id.name);
        name.setTextColor(Color.BLACK);
        description = (TextView)itemView.findViewById(R.id.description);
        description.setTextColor(Color.GRAY);
        image = (ImageView)itemView.findViewById(R.id.image);
    }

    public CardView getCardView() {
        return cardView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getDescription() {
        return description;
    }

    public void setDescription(TextView description) {
        this.description = description;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
