package OOP_LAB4.Aimsproject.hust.soict.cs.test.store;

import OOP_LAB4.Aimsproject.hust.soict.cs.aims.disc.DVD;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.media.Media;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.store.Store;

public class TestStore {
    public static void main(String[] args){
        Store store=new Store();
        DVD dvd1= new DVD("The Lion King","Animation","Roger Allers",87,19.95f);
        store.addMedia(dvd1);
        DVD dvd2=new DVD("Star Wars","Science Fiction","George Lucas",87,24.95f);
        store.addMedia((dvd2));
        DVD dvd3=new DVD("Aladin","Animation",18.99f);
        store.addMedia(dvd3);
        store.removeMedia(dvd2);
        for(Media dvd : store.itemInStore){
            System.out.println(dvd.getTitle());
        }
    }
}