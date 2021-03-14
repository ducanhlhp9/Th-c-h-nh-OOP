package hust.soict.ictglobal.aims;

import java.util.*;

public class Order {

	private ArrayList itemsOrdered = new ArrayList(3);

	/**
	 *  
	 */
	public Order() {
		super();
	}

	public void addMedia(Media mediaItem) {
		// ensure that the Media item is not already
		// in the ArrayList before adding
		if (!(itemsOrdered.contains(mediaItem))) {
			itemsOrdered.add(mediaItem);
		}
	}

	public void removeMedia(Media mediaItem) {
		// ensure that the Media item is present
		// in the ArrayList before removing
		if (itemsOrdered.contains(mediaItem)) {
			itemsOrdered.remove(mediaItem);
		}
	}

	public float totalCost() {
		// store the running total of the items in the
		// order
		float total = 0;
		Media mediaItem;
		java.util.Iterator iter = itemsOrdered.iterator();
		while (iter.hasNext()) {
			mediaItem = (Media) (iter.next());
			total += mediaItem.getCost();
		}
		return total;
	}
}