package OOP_LAB4;

import OOP_LAB4.Aimsproject.hust.soict.cs.aims.media.Media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<>();
    public Book(int id,String title,String category,float cost,ArrayList<String> authors){
        this.id=id;
        this.title=title;
        this.category=category;
        this.cost=cost;
        this.authors=authors;
    }
    public ArrayList<String> getAuthors() {
        return authors;
    }
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
    public void addAuthor(String authorName){
        if(!authors.contains(authorName)){
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName){
        if(authors.contains(authorName)){
            authors.remove(authorName);
        }
    }
    public void play(){}
    @Override
    public String toString() {
        return "Book - "+this.getId()+" - "+this.getTitle()+" - "+this.getCategory()+" - "+this.getCost()+" - "+this.getAuthors();
    }

}
