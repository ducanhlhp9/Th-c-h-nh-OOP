package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.*;
import java.util.List;


public class Order extends Media {

	private List<String> media = new ArrayList<String>();
	public Order() {
		super();
	}
	public List<String> getMedia() {
		return media;
	}

	public void setMedia(List<String> media) {
		this.media = media;
	}

	public void addMedia(String mediaName) {
		if(!(media.contains(mediaName))) {
			media.add(mediaName);
		}
	}
	public void removeMedia(String mediaName) {
		if((media.contains(mediaName))) {
			media.remove(mediaName);
		}
	}

	public float totalCost() {
		float total = 0;
		Media mediaItem;
		Iterator iter = media.iterator();
		while(iter.hasNext()) {
			mediaItem =(Media)(iter.next());
			total += mediaItem.getCost();
		}
		return total;
	}
}