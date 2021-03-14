package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompactDisc extends Discs implements Playable, Comparable{
	private String artist;
	private int length;
	private List<String> tracks = new ArrayList<String>();
	public int getLength() {
		int total_length =0;
		Track trackItem;
		Iterator iter = tracks.iterator();
		
		while(iter.hasNext()) {
			trackItem =(Track)(iter.next());
			total_length+= trackItem.getLength();
		}
		return  total_length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	

	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public List<String> getTracks() {
		return tracks;
	}
	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	public void addTrack(String Track) {
		if(!(tracks.contains(Track))) {
			tracks.add(Track);
		}
	}
	public void removeTrack(String Track) {
		if((tracks.contains(Track))) {
			tracks.remove(Track);
		}
	}
	@Override
	public void play() {
		System.out.println("Playing CD: "+this.getTitle());
		System.out.println("CD length: "+this.getLength());
		
	}
	public int compareTo(Object obj) {
		int returnNumber = this.getTitle().compareTo(((CompactDisc)obj).getTitle());
		return returnNumber !=0 ?returnNumber : Integer.compare(this.getLength(), ((CompactDisc)obj).getLength());
	}
	
}
