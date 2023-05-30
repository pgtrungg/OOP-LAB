package OOP_LAB1;

import  java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.next();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("How tall are you?");
        float height=sc.nextFloat();
        System.out.print("Mr/Mrs."+name+" ,"+age+" years old"+". Your height is "+height);
    }
}
