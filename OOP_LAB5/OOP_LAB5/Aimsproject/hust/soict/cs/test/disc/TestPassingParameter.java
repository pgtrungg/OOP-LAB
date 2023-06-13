package OOP_LAB4.Aimsproject.hust.soict.cs.test.disc;


import OOP_LAB4.Aimsproject.hust.soict.cs.aims.disc.DVD;

public class TestPassingParameter {
    public  static void main(String[] args){
        DVD jungleDVD= new  DVD("jungle");
        DVD cinderellaDVD = new DVD("Cinderella");
        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());
        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());


    }
    public  static void swap(Object obj1,Object obj2){
        Object tmp=obj1;
        obj1=obj2;
        obj2=tmp;
    }
    public static void changeTitle(DVD dvd,String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd=new DVD(oldTitle);
    }
}
