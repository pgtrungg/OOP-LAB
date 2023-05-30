package OOP_LAB3.Aimsproject.hust.soict.cs.aims.cart;
import OOP_LAB3.Aimsproject.hust.soict.cs.aims.disc.DVD;

import java.util.ArrayList;
public class Cart {
    int quantityOrdered = 0;
    public float totalCost = 0;
    final int MAX_QUANTITY=20;
    ArrayList<DVD> itemsOrdered = new ArrayList<DVD>();

    // Add an item to the cart
    public void addItem(DVD newDvd) {
        if (quantityOrdered == MAX_QUANTITY) {
            System.out.println("The cart is almost full" );
        }
        else  {
            quantityOrdered += 1;
            totalCost += newDvd.getCost();
            itemsOrdered.add(newDvd);
            System.out.println("Added successfully");
        }
    }

    //Remove an item from the cart
    public void removeItem(DVD oldDvd) {
        quantityOrdered -= 1;
        totalCost -= oldDvd.getCost();
        itemsOrdered.remove(oldDvd);
        System.out.println("Removed successfully");
    }

    // Return total cost of the cart
    public  float totalCost(){
        return totalCost;
    }

    // Add list of items to the cart
    public  void addItem(DVD[] dvdList){
        for (DVD dvd : dvdList){
            if (quantityOrdered == MAX_QUANTITY) {
                System.out.println("The cart is almost full" );
            }
            else  {
                quantityOrdered += 1;
                totalCost += dvd.getCost();
                itemsOrdered.add(dvd);
                System.out.println("Added successfully");
            }
        }
    }

    // Add a pair of item to the cart
    public void addItem(DVD dvd1,DVD dvd2){
        itemsOrdered.add(dvd1);
        itemsOrdered.add(dvd2);
    }
    // Display all items in the cart
    public void print(){
        System.out.println("***********************CART***********************");
        int i=1;
        for(DVD dvd:itemsOrdered){
            System.out.println((i)+". DVD-"+dvd.getTitle()+"-"+dvd.getCategory()+"-"+dvd.getDirector()+"-"+dvd.getLength()+":"+ dvd.getCost()+"$");
            i+=1;
        }
        System.out.println("Total cost :" +this.totalCost() +"$");
        System.out.print("***************************************************");
    }

}

