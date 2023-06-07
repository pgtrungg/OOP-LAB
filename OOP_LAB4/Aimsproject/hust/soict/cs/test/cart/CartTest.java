package OOP_LAB4.Aimsproject.hust.soict.cs.test.cart;

import OOP_LAB3.Aimsproject.hust.soict.cs.aims.cart.Cart;
import OOP_LAB3.Aimsproject.hust.soict.cs.aims.disc.DVD;

public class CartTest {
    public static void main(String[] args){
        Cart cart=new Cart();
        DVD dvd1= new DVD("The Lion King","Animation","Roger Allers",87,19.95f);
        cart.addItem(dvd1);
        DVD dvd2=new DVD("Star Wars","Science Fiction","George Lucas",87,24.95f);
        cart.addItem((dvd2));
        DVD dvd3=new DVD("Aladin","Animation",18.99f);
        cart.addItem(dvd3);
        cart.print();

    }
}
