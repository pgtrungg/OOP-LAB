package OOP_LAB4;

import OOP_LAB4.Aimsproject.hust.soict.cs.aims.media.Media;

public class Disc extends Media {
    protected int length;
    protected String director;
    public Disc(String title)
    {
        this.title = title;
    }

    public Disc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Disc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public Disc(String title,String category,String director,int length,float cost){
        super();
        this.title=title;
        this.category=category;
        this.director=director;
        this.length=length;
        this.cost=cost;
    }
    public Disc(int id,String title,String category,String director,int length,float cost) {
        super();
        this.id=id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public Disc() {

    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

}
