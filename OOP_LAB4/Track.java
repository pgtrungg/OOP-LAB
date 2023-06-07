package OOP_LAB4;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    Track(String title,int length){
        this.title=title;
        this.length=length;
    }
    public void play(){
        System.out.println("Title:"+this.getTitle());
        System.out.println("Length:"+this.getLength());
    }
}
