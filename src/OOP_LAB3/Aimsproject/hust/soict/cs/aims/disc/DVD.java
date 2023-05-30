package OOP_LAB3.Aimsproject.hust.soict.cs.aims.disc;

public class DVD {
    private static int nbDigitalVideoDiscs = 0;
    int id;
    String title;
    String category;
    String director;
    int length;
    float cost;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
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
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost= cost;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DVD.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
