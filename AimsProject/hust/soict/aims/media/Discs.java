package hust.soict.aims.media;

public class Discs extends Media {
	private int length;
	private String director;
	public Discs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Discs(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
}
