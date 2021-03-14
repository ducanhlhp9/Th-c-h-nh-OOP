package hust.soict.ictglobal.aims;

public class Track implements Playable, Comparable {

	private String title;

	private int length;

	/**
	 * Constructor for Track
	 */
	public Track() {
		super();
	}

	/**
	 * Returns the length.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Returns the title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the length.
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * Sets the title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	public int compareTo(Object obj) {
		Media media = (Media) obj;
		return (this.getTitle()).compareTo(media.getTitle());
	}
}