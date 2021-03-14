package hust.soict.ictglobal.aims;

public class CompactDisc extends Media implements Playable, Comparable {

	private String artist;

	private int length;

	private java.util.ArrayList tracks = new java.util.ArrayList();

	/**
	 *  
	 */
	public CompactDisc() {
		super();
	}

	/**
	 * Gets the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * Sets the artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void addTrack(Track track1) {
		// ensure that the track is not already in the
		// ArrayList before adding
		if (!(tracks.contains(track1))) {
			tracks.add(track1);
		}
	}

	public void removeTrack(Track track1) {
		// ensure that the track is present in the
		// ArrayList before removing
		if ((tracks.contains(track1))) {
			tracks.remove(track1);
		}
	}

	public int getLength() {
		int total = 0;
		java.util.Iterator iter = tracks.iterator();
		Track nextTrack;
		while (iter.hasNext()) {
			nextTrack = (Track) iter.next();
			total += nextTrack.getLength();
		}
		return total;
	}

	public void play() throws PlayerException {
		if(this.getLength() <= 0) {
			System.err.println("ERROR: CD length is 0");
			throw (new PlayerException());
		}
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length:" + this.getLength());

		java.util.Iterator iter = tracks.iterator();
		Track nextTrack;
		
		while(iter.hasNext()) {
			nextTrack = (Track) iter.next();
			nextTrack.play();
			
		}
	}

	public int compareTo(Object obj) {
		Media media = (Media)obj;
		return(this.getTitle()).compareTo(media.getTitle());
	}
}