package OOP_LAB3.Aimsproject.hust.soict.cs.aims.store;
import OOP_LAB3.Aimsproject.hust.soict.cs.aims.disc.DVD;

import java.util.ArrayList;

public class Store {
    public ArrayList<DVD> itemInStore = new ArrayList<DVD>();
    // Add a new DVD to the store
    public void addDVD(DVD newDVD) {
        itemInStore.add(newDVD);
    }

    //Remove an old DVD from the store
    public void removeDVD(DVD oldDVD) {
        if (itemInStore.contains(oldDVD)) {
            itemInStore.remove(oldDVD);
        }
    }
}
