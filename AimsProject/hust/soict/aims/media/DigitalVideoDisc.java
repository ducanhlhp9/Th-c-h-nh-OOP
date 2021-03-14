package hust.soict.aims.media;

public class DigitalVideoDisc extends Discs implements Playable, Comparable{

	public DigitalVideoDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void play() {
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: "+this.getLength());
	}
	public int compareTo(Object obj) {
		int returnNumber = this.getTitle().compareTo(((CompactDisc)obj).getTitle());
		return returnNumber !=0 ?returnNumber : Integer.compare(this.getLength(), ((CompactDisc)obj).getLength());
	}

}