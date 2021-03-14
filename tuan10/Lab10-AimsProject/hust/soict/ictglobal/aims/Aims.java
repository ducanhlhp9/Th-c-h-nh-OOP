package hust.soict.ictglobal.aims;

public class Aims {

	public Aims() {
		super();
	}

	public static void main(String[] args) throws PlayerException {
		 
		Thread memDaemon = new Thread(new MemoryDaemon());
		memDaemon.setDaemon(true);
		memDaemon.start();

		// Create a new order object
		Order anOrder = new Order();

		// Create a new dvd object and set the
		// appropriate fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc();
		dvd1.setTitle("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);

		dvd1.play();
		// add the dvd to the order's Media collection
		anOrder.addMedia(dvd1);

		// Create a new dvd object and set the //appropriate fields
		DigitalVideoDisc dvd2 = new DigitalVideoDisc();
		dvd2.setTitle("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);

		dvd2.play();
		// add the dvd to the order's Media collection
		anOrder.addMedia(dvd2);

		// Create a new dvd object and set the //appropriate fields
		DigitalVideoDisc dvd3 = new DigitalVideoDisc();
		dvd3.setTitle("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);

		dvd3.play();
		// add the dvd to the order's Media collection
		anOrder.addMedia(dvd3);

		// Create a new Book object and set the //appropriate fields
		Book book = new Book();
		book.setTitle("Java Programming");
		book.setCategory("Java");
		book.setCost(69.99f);
		book.addAuthor("Joe Wigglesworth");
		book.addAuthor("Paula Lumby");
		// add the book to the order's media collection
		anOrder.addMedia(book);

		// Create a new CompactDisc object and set the
		// appropriate fields
		CompactDisc cd1 = new CompactDisc();
		cd1.setTitle("IBM Symphony");
		cd1.setCategory("Instrumental");
		cd1.setCost(29.95f);
		cd1.setArtist("IBM Band");

		// Create a few tracks to add to the CD
		Track t1 = new Track();
		t1.setTitle("Warmup");
		t1.setLength(3);
		cd1.addTrack(t1);

		Track t2 = new Track();
		t2.setTitle("Scales");
		t2.setLength(4);
		cd1.addTrack(t2);

		Track t3 = new Track();
		t3.setTitle("Introduction");
		t3.setLength(6);
		cd1.addTrack(t3);
		System.out.print("The total length of the CD to add is: ");
		System.out.println(cd1.getLength());

		cd1.play();
		// Add the CD to the order's media collection
		anOrder.addMedia(cd1);

		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());

		java.util.Collection collection = new java.util.ArrayList();

		// Add the DVD objects to the ArrayList
		collection.add(dvd2);
		collection.add(dvd1);
		collection.add(dvd3);

		// Iterate through the ArrayList and output their titles
		// (unsorted order)
		java.util.Iterator iterator = collection.iterator();

		System.out.println("------------------------------------");
		System.out.println("The DVDs currently in the order are: ");

		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}

		// Sort the collection of DVDs - based on the compareTo()
		// method
		java.util.Collections.sort((java.util.List) collection);

		// Iterate through the ArrayList and output their titles -
		// in sorted order
		iterator = collection.iterator();

		System.out.println("------------------------------------");
		System.out.println("The DVDs in sorted order are: ");

		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}

		System.out.println("------------------------------------");
	}
}