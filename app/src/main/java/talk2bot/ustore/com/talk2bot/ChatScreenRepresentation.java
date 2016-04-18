package talk2bot.ustore.com.talk2bot;

/**
 * Created by alisi on 4/18/2016.
 */
public class ChatScreenRepresentation {

    private String message;
    private int photoID;

    public ChatScreenRepresentation(String message, int photoID)
    {
        this.message = message;
        this.photoID = photoID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}