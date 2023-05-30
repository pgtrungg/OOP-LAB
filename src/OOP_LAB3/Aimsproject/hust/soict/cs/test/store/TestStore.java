package OOP_LAB3.Aimsproject.hust.soict.cs.test.store;

import OOP_LAB3.Aimsproject.hust.soict.cs.aims.disc.DVD;
import OOP_LAB3.Aimsproject.hust.soict.cs.aims.store.Store;

public class TestStore {
    public static void main(String[] args){
        Store store=new Store();
        DVD dvd1= new DVD("The Lion King","Animation","Roger Allers",87,19.95f);
        store.addDVD(dvd1);
        DVD dvd2=new DVD("Star Wars","Science Fiction","George Lucas",87,24.95f);
        store.addDVD((dvd2));
        DVD dvd3=new DVD("Aladin","Animation",18.99f);
        store.addDVD(dvd3);
        store.removeDVD(dvd2);
        for(DVD dvd : store.itemInStore){
            System.out.println(dvd.getTitle());
        }
    }
}
