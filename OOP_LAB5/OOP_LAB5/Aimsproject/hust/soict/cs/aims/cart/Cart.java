package OOP_LAB4.Aimsproject.hust.soict.cs.aims.cart;
import OOP_LAB3.Aimsproject.hust.soict.cs.aims.disc.DVD;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.media.Media;

import java.util.ArrayList;
public class Cart {
    int quantityOrdered = 0;
    public float totalCost = 0;
    final int MAX_QUANTITY = 20;
    public ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    // Add an item to the cart
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            if (quantityOrdered == MAX_QUANTITY) {
                System.out.println("The cart is almost full");
            } else {
                quantityOrdered += 1;
                totalCost += media.getCost();
                itemsOrdered.add(media);
                System.out.println("Added successfully");
            }
        }
    }

    //Remove an item from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            quantityOrdered -= 1;
            totalCost -= media.getCost();
            itemsOrdered.remove(media);
            System.out.println("Removed successfully");
        }
    }

    // Return total cost of the cart
    public float totalCost() {
        return totalCost;
    }

    public void cartDisplay() {
        System.out.println("Cart:");
        System.out.println("-----------------------------");
        int i = 1;
        for (Media media : itemsOrdered) {
            System.out.print(i + ". ");
            System.out.println(media);
            i += 1;
        }
        System.out.println("-----------------------------");
    }
}

