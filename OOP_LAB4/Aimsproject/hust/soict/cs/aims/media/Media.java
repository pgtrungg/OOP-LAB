package OOP_LAB4.Aimsproject.hust.soict.cs.aims.media;

import OOP_LAB4.Aimsproject.hust.soict.cs.aims.disc.DVD;
import OOP_LAB4.Book;
import OOP_LAB4.MediaComparatorByCostTitle;
import OOP_LAB4.MediaComparatorByTitleCost;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Media {
    public static final Comparator<Media> COMPARE_BY_COST_TITLE= new MediaComparatorByCostTitle() ;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST= new MediaComparatorByTitleCost() ;
    public Media(){

    }
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Media media = (Media) o;
        return title != null ? title.equals(media.title) : media.title == null;
    }


    @Override
    public String toString(){
        return this.getId()+" - "+this.getTitle()+" - "+this.category+" - "+this.cost;
    }
    public static void main(String[] args){
        ArrayList<Media> mediaList=new ArrayList<Media>();
        DVD dvd0=new DVD("a","2",3);
        DVD dvd1=new DVD("d","2",3);
        DVD dvd2=new DVD("c","2",3);
        DVD dvd3=new DVD("c","2",4);
        mediaList.add(dvd0);
        mediaList.add(dvd1);
        mediaList.add(dvd2);
        mediaList.add(dvd3);
        Collections.sort(mediaList,Media.COMPARE_BY_TITLE_COST);
        for(Media media:mediaList){
            System.out.println(media);
        }
    }

}
