package OOP_LAB4.Aimsproject.hust.soict.cs.aims.store;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.disc.DVD;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public ArrayList<Media> itemInStore = new ArrayList<Media>();

    // Add a new DVD to the store
    public void addMedia(Media media) {
        if (!itemInStore.contains(media))
            itemInStore.add(media);
    }

    //Remove an old DVD from the store
    public void removeMedia(Media media) {
        if (itemInStore.contains(media)) {
            itemInStore.remove(media);
        }
    }

    public void storeDisplay() {
        System.out.println("Store:");
        System.out.println("-----------------------------");
        int i = 1;
        for (Media media : itemInStore) {
            System.out.print(i+". ");
            System.out.println(media);
            i+=1;
        }
        System.out.println("-----------------------------");
    }
}
