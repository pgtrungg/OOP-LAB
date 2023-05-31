package OOP_LAB2;
import java.util.ArrayList;
public class Cart {
    int quantityOrdered = 0;
    float totalCost = 0;
    final int MAX_QUANTITY=20;
    ArrayList<DVD> itemsOrdered = new ArrayList<DVD>();

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

    public void removeItem(DVD oldDvd) {
        quantityOrdered -= 1;
        totalCost -= oldDvd.getCost();
        itemsOrdered.remove(oldDvd);
        System.out.println("Removed successfully");
    }
    public  float totalCost(){
        return totalCost;
    }


}

