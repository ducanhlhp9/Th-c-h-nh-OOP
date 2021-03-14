package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media implements Comparable{
	
	
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(!(authors.contains(authorName))) {
			authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		if((authors.contains(authorName))) {
			authors.remove(authorName);
		}
	}
	public int compareTo(Object obj) {
		return this.getTitle().compareTo(((Book)obj).getTitle());
	}
	
}
