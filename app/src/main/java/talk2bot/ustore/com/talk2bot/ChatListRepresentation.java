package talk2bot.ustore.com.talk2bot;

import java.util.LinkedList;

/**
 * Created by alisi on 4/17/2016.
 */
public class ChatListRepresentation {

    private String name;
    private String description;
    private int photoID;

    public ChatListRepresentation(String name, String description, int photoID)
    {
        this.name = name;
        this.description = description;
        this.photoID = photoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
