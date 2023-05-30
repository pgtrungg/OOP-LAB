package OOP_LAB2;

public class Aims {
    public static void main(String args[]){
        DVD s=new  DVD("Doctor strange",null,"gg",4,7.1f);
        DVD s1=new  DVD("Doctor strange","ok","gg",4,7.1f);
        Cart cart1=new Cart();
        cart1.addItem(s);

        System.out.println(cart1.totalCost());

    }
}
