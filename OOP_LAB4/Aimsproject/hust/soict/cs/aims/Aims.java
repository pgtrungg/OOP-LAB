package OOP_LAB4.Aimsproject.hust.soict.cs.aims;


import OOP_LAB4.Aimsproject.hust.soict.cs.aims.cart.Cart;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.disc.DVD;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.media.Media;
import OOP_LAB4.Aimsproject.hust.soict.cs.aims.store.Store;
import OOP_LAB4.Book;
import OOP_LAB4.CompactDisc;
import OOP_LAB4.Disc;
import OOP_LAB4.Track;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.exit;


public class Aims {
    public static Media enterTitleInCart(Cart cart,Store store) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the media's title:");
        String title = sc.next();
        Media media1=new DVD();
        boolean check = false;
        while (!check) {
            for (Media media : cart.itemsOrdered) {
                if (media.getTitle().equals(title)) {
                    check = true;
                    System.out.println(media);
                }
            }
            if (!check) {
                System.out.print("Invalid, please enter again :");
                title = sc.next();
            }
        }
        return media1;
    }
    public static Media enterIdInCart(Cart cart,Store store) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the media's id:");
        int id = sc.nextInt();
        boolean check = false;
        Media media1=new DVD();
        while (!check) {
            for (Media media : store.itemInStore) {
                if (media.getId()==id) {
                    media1=media;
                    check = true;
                }
            }
            if (!check) {
                System.out.print("Invalid, please enter again :");
                id = sc.nextInt();
            }
        }
        return media1;
    }
    public static Media enterTitle(Cart cart,Store store) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the media's title:");
        String title = sc.next();
        boolean check = false;
        Media media1 = new DVD();
        while (!check) {
            for (Media media : store.itemInStore) {
                if (media.getTitle().equals(title)) {
                    check = true;
                    media1=media;
                }
            }
            if (!check) {
                System.out.print("Invalid, please enter again :");
                title = sc.next();
            }
        }
        return media1;
    }
    public static  void  addMedia(Cart cart,Store store) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type (DVD,Book,CD) :");
        String type = sc.next();
        System.out.print("Id: ");
        int id = sc.nextInt();
        System.out.print("Title: ");
        String title = sc.next();
        System.out.print("Category: ");
        String category = sc.next();
        System.out.print("Cost: ");
        float cost = sc.nextFloat();
        if (type.equals("DVD")) {
            System.out.print("Length: ");
            int length = sc.nextInt();
            System.out.print("Director: ");
            String director = sc.next();
            if (type.equals("DVD")) {
                store.addMedia(new DVD(id, title, category, director, length, cost));
            }
            if (type.equals("Disc")) {
                store.addMedia(new Disc(id, title, category, director, length, cost));
            }
        }
        if (type.equals("Book")) {
            ArrayList<String> authors = new ArrayList<String>();
            System.out.print("Number of authors: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("   +Author " + (i + 1) + ": ");
                authors.add(sc.next());
            }
            store.addMedia(new Book(id, title, category,cost,authors));
        }
        if(type.equals("CD")){
            System.out.print("Director: ");
            String director = sc.next();
            System.out.print("Artist: ");
            String artist = sc.next();
            ArrayList<Track> tracks = new ArrayList<Track>();
            System.out.print("Number of tracks: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Track " + (i + 1) + ": ");
                System.out.print("   +Title: ");
                String title1= sc.next();
                System.out.print("   +Length: ");
                int length1= sc.nextInt();
                tracks.add(new Track(title1,length1));
            }

            store.addMedia(new CompactDisc(id, title, category,director,artist,tracks,cost));
        }
        System.out.println("Added successfully!");
    }
    public static  void removeMedia(Cart cart , Store store){
        store.storeDisplay();
        System.out.print("Type the index of media will be removed: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        store.itemInStore.remove(store.itemInStore.get(n - 1));
        System.out.println("Removed successfully!");
    }
    public static void showMenu(Cart cart,Store store) {
        System.out.println("AIMS:");
        System.out.println("--------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------");
        System.out.println("Please choose a number : 0-1-2-3");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        while (true) {
            if (option == 1) {
                storeMenu(cart,store);
                option = sc.nextInt();
            }
            if (option == 2) {
                storeUpdate(cart,store);
                option = sc.nextInt();
            }
            if (option == 3) {
                cartMenu(cart,store);
                option = sc.nextInt();
            }
            if (option == 0) {
                exit(0);
            }

        }
    }
    public static void storeUpdate(Cart cart,Store store){
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. Add a media");
        System.out.println("2. Remove a media");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        while (true) {
            if (option == 1) {
                addMedia(cart,store);
                storeUpdate(cart,store);
                option = sc.nextInt();
            }
            if (option == 2) {
                removeMedia(cart,store);
                storeUpdate(cart,store);
                option = sc.nextInt();
            }
            if (option == 0) {
                showMenu(cart,store);
                break;
            }
        }
    }
    public static  void storeMenu(Cart cart,Store store) {
        store.storeDisplay();
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        while (true) {
            if (option == 1) {
                mediaDetailsMenu(cart, store);
                storeMenu(cart, store);
                option = sc.nextInt();
            }
            if (option == 2) {
                cart.addMedia(enterTitle(cart, store));
                storeMenu(cart, store);
                option = sc.nextInt();
            }
            if (option == 3) {
                Media media=enterTitle(cart,store);
                if (media instanceof DVD) {
                    ((DVD) media).play();
                } else if (media instanceof CompactDisc)
                    ((CompactDisc) media).play();
                else if (media instanceof Book)
                    System.out.print("Can't play");
                storeMenu(cart, store);
                option = sc.nextInt();
            }


            if (option == 4) {
                cart.cartDisplay();
                cartMenu(cart,store);
                option = sc.nextInt();
            }
            if (option == 0) {
                showMenu(cart, store);
                option = sc.nextInt();
            }
        }
    }
    public static void mediaDetailsMenu(Cart cart,Store store) {
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        while (true) {
            if (option == 1) {
                cart.addMedia(enterTitle(cart,store));
                mediaDetailsMenu(cart, store);
                option = sc.nextInt();
            }

            else if (option == 2) {
                Media media=enterTitle(cart,store);
                if (media instanceof DVD) {
                    ((DVD) media).play();
                } else if (media instanceof CompactDisc)
                    ((CompactDisc) media).play();
                else if (media instanceof Book)
                    System.out.print("Can't play a book");
                mediaDetailsMenu(cart,store);
                option = sc.nextInt();
            }
            else if (option == 0) {
                    storeMenu(cart,store);
                option = sc.nextInt();
            }
        }
    }
    public static void filter(Cart cart,Store store) {
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. Filter by id");
        System.out.println("2. Filter by title");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println(enterIdInCart(cart,store));
            filter(cart,store);
        } else if (option == 2) {
            System.out.println(enterTitleInCart(cart,store));
            filter(cart,store);
        } else if (option == 0) {
            cartMenu(cart,store);
        }
    }
    public static void sort(Cart cart,Store store) {
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. Sort by cost");
        System.out.println("2. Sort by title");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            Collections.sort(cart.itemsOrdered,Media.COMPARE_BY_COST_TITLE);
            cartMenu(cart,store);
        } else if (option == 2) {
            Collections.sort(cart.itemsOrdered,Media.COMPARE_BY_TITLE_COST);
            cartMenu(cart,store);
        }
    }
    public static void cartMenu(Cart cart,Store store){
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
        Scanner sc=new Scanner(System.in);
        int option= sc.nextInt();
        if(option==1){
                filter(cart,store);
        } else if (option==2) {
                sort(cart,store);
        }else if (option==3) {
                cart.removeMedia(enterTitleInCart(cart,store));
        }else if (option==4) {
                Media media =enterIdInCart(cart,store);
            if (media instanceof DVD) {
                ((DVD) media).play();
            } else if (media instanceof CompactDisc)
                ((CompactDisc) media).play();
            else if (media instanceof Book)
                System.out.print("Can't play a book");
        }else if (option==5) {
                System.out.println("Order successfully!");
                exit(0);
        }else if (option==0) {
            storeMenu(cart,store);
        }

    }

    public static void main(String args[]){
        Store store=new Store();
        DVD dvd1=new DVD(1,"abc","sgss","hyth",3,5.5f);
        DVD dvd2=new DVD(2,"def","ssgs","htth",6,5f);
        DVD dvd3=new DVD(6,"abc","ssss","hthr",33,6.5f);
        DVD dvd4=new DVD(3,"abcs","ssas","hthv",43,9.5f);
        DVD dvd5=new DVD(4,"abbc","ssfbs","hthn",23,5.6f);
        DVD dvd6=new DVD(5,"abcd","ssyts","hth",3,5.7f);
        DVD dvd7=new DVD(7,"abcg","ssnhs","hthl",31,7.5f);
        DVD dvd8=new DVD(8,"abck","ssbgs","hthn",32,8.5f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(dvd6);
        store.addMedia(dvd7);
        store.addMedia(dvd8);
        Scanner sc=new Scanner(System.in);
        Cart cart=new Cart();
        showMenu(cart,store);

    }
}
