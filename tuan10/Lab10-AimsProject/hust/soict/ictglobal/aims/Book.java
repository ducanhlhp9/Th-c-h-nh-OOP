package hust.soict.ictglobal.aims;

public class Book extends Media implements Comparable {

	private java.util.ArrayList authors 
		= new java.util.ArrayList();
	
	/**
	 *  
	 */
	public Book() {
		super();
	}
	public void addAuthor(String authorName) {
		// ensure that the author is not already in
		// the ArrayList before adding
		if (!(authors.contains(authorName))) {
			authors.add(authorName);
		}
	}

	public void removeAuthor(String authorName) {
		// ensure that the author is present in the
		// ArrayList before removing
		if ((authors.contains(authorName))) {
			authors.remove(authorName);
		}
	}
	
	public int compareTo(Object obj) {
		Media media = (Media)obj;
		return(this.getTitle()).compareTo(media.getTitle());
	}
}