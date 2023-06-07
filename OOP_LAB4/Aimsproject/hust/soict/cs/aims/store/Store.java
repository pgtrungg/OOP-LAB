package OOP_LAB4.Aimsproject.hust.soict.cs.aims.store;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.disc.DVD;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public ArrayList<Media> itemInStore = new ArrayList<Media>();
    // Add a new DVD to the store
    public void addMedia(Media media) {
        itemInStore.add(media);
    }

    //Remove an old DVD from the store
    public void removeMedia(Media media) {
        if (itemInStore.contains(media)) {
            itemInStore.remove(media);
        }
    }
}
