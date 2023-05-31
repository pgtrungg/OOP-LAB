package OOP_LAB1;

import java.util.Scanner;
public class NumbersOfDayOfMonth {
    public static boolean checkLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month : ");
        String month = sc.next();
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        String[] month_have_31_days = {"1", "Jan.", "Jan", "January", "3", "March", "Mar.", "Mar", "5", "May", "May.", "7", "July", "Jul", "Jul.", "8", "August", "Aug.", "Aug", "10", "October", "Oct", "Oct.", "12", "December", "Dec", "Dec."};
        String[] feb = {"2", "February", "Feb", "Feb."};
        boolean check = false;
        for (String i : month_have_31_days) {
            if (i.equals(month)) {
                System.out.println(31);
                check = true;
                break;
            }
        }
        if (!check) {
            for (String i : feb) {
                if (i.equals(month) && checkLeap(year)) {
                    System.out.println(29);
                    check = true;
                    break;
                }
                if (i.equals(month) && !checkLeap(year)) {
                    System.out.println(28);
                    check = true;
                    break;


                }


            }

        }
        if (!check) {
            System.out.print(30);
        }


    }
}