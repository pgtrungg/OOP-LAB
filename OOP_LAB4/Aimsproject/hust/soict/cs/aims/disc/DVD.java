package OOP_LAB4.Aimsproject.hust.soict.cs.aims.disc;

import OOP_LAB4.Aimsproject.hust.soict.cs.aims.media.Media;
import OOP_LAB4.Disc;
import OOP_LAB4.Playable;

public class DVD extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;
    String director;
    int length;
    public DVD(String title)
    {
        super(title);
        nbDigitalVideoDiscs++;
    }

    public DVD(String title, String category, float cost) {
        super(title,category,cost);
        nbDigitalVideoDiscs++;
    }

    public DVD(String title, String category, String director, float cost) {
        super(title,category,director,cost);
        nbDigitalVideoDiscs++;
    }
    public DVD(String title,String category,String director,int length,float cost){
        super(title,category,director,length,cost);
        nbDigitalVideoDiscs++;
    }
    public DVD(int id,String title,String category,String director,int length,float cost) {
        super(id,title,category,director,length,cost);
        nbDigitalVideoDiscs++;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DVD.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }

    public void play(){
        System.out.println("Id:"+this.getId());
        System.out.println("Title:"+this.getTitle());
        System.out.println("Category:"+this.getCategory());
        System.out.println("Director:"+this.getDirector());
        System.out.println("Length:"+this.getLength());
        System.out.println("Cost:"+this.getCost());

    }
}
