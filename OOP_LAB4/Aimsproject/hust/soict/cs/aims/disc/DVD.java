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
        this.title = title;
        nbDigitalVideoDiscs++;
    }

    public DVD(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
    }

    public DVD(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
    }
    public DVD(String title,String category,String director,int length,float cost){
        super();
        this.title=title;
        this.category=category;
        this.director=director;
        this.length=length;
        this.cost=cost;
        nbDigitalVideoDiscs++;
    }
    public DVD(int id,String title,String category,String director,int length,float cost) {
        this.id=id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
    }

    public DVD() {

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
        System.out.println("Playing DVD: "+this.getTitle());
        System.out.println("DVD length: "+this.getLength());

    }
    @Override
    public String toString() {
        return "DVD - "+this.getId()+" - "+this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+" - "+this.getLength()+" - "+this.getCost();
    }
}
