package hust.soict.ictglobal.aims;

public class DigitalVideoDisc extends Media implements Playable, Comparable {

	private String director;

	private int length;

	/**
	 * Constructor for DigitalVideoDisc
	 */
	public DigitalVideoDisc() {
		super();
	}

	/**
	 * @return Returns the director.
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director
	 *            The director to set.
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return Returns the length.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            The length to set.
	 */
	public void setLength(int length) {
		this.length = length;
	}

	public void play() throws PlayerException{
		if(this.getLength() <= 0) {
			System.err.println("ERROR: DVD length is 0");
			throw (new PlayerException());
		}
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
		
	}

	public int compareTo(Object obj) {
		DigitalVideoDisc dvd = (DigitalVideoDisc) obj;
		return (this.getTitle()).compareTo(dvd.getTitle());
	}
}