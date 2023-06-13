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
    public  Track(String title,int length){
        this.title=title;
        this.length=length;
    }
    public void play(){
        System.out.println(getTitle()+" - "+getLength());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Track track = (Track) o;
        return length == track.length;
    }
}
