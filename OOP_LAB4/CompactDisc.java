package OOP_LAB4;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
     private String artist;
     private ArrayList<Track> tracks=new ArrayList<Track>();
     CompactDisc(int length,String director,String artist,ArrayList<Track> tracks){
         this.length=length;
         this.director=director;
         this.artist=artist;
         this.tracks=tracks;
     }

    public String getArtist() {
        return artist;
    }
    public void addTrack(Track newTrack){
        if(!tracks.contains(newTrack)){
            tracks.add(newTrack);
        }
    }
    public void removeTrack(String oldTrack){
        if(tracks.contains(oldTrack)){
            tracks.remove(oldTrack);
        }
    }
    public int getLength(){
         int sum=0;
         for(Track track:tracks)
             sum+= track.getLength();
         return sum;
    }
    public void play(){
        System.out.println("Artist:"+this.getArtist());
        System.out.println("Length:"+this.getLength());
        int i=1;
        for(Track track:tracks){
            System.out.println("Track "+(i)+": ");
            track.play();
        }
    }
}

