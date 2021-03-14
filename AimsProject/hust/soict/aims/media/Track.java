package hust.soict.aims.media;

public class Track extends CompactDisc implements Playable, Comparable {
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void play() {
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: "+this.getLength());
	}
	public int compareTo(Object obj) {
		return this.getTitle().compareTo(((Track)obj).getTitle());
	}
}
