package OOP_LAB3.Aimsproject.hust.soict.cs.aims;


import OOP_LAB3.Aimsproject.hust.soict.cs.aims.cart.Cart;
import OOP_LAB3.Aimsproject.hust.soict.cs.aims.disc.DVD;

public class Aims {
    public static void main(String args[]){
        DVD s=new DVD("Doctor strange",null,"gg",4,7.1f);
        DVD s1=new DVD("Doctor strange","ok","gg",4,7.1f);
        Cart cart1=new Cart();
        cart1.addItem(new DVD[]{s, s1});
        cart1.addItem(s1);
        System.out.println(cart1.totalCost);

    }
}
