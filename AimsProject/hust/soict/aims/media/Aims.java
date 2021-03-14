package hust.soict.aims.media;

import java.util.*;

public class Aims {

	public static void main(String[] args) {
		// Create a new Order object

		Order anOrder = new Order();

		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc();
		dvd1.setTitle("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);

		// add the dvd to the order
	

		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd2 = new DigitalVideoDisc();
		dvd2.setTitle("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);

		//add the dvd to the order

		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd3 = new DigitalVideoDisc();
		dvd3.setTitle("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);

		// add the dvd to the order
		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		Collection collection = new ArrayList();
		collection.add(dvd2);
		collection.add(dvd1);
		collection.add(dvd3);
		java.util.Iterator iterator = collection.iterator();
		System.out.println("=============================");
		System.out.println("the DVDs currently in the order are:");
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		Collections.sort((java.util.List)collection);
		
		iterator = collection.iterator();
		System.out.println("-------------------------------------");
		System.out.println("the DVDs in sorted order are:");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		System.out.println("--------------------------------");
	}
}