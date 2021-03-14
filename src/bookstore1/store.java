package bookstore1;

public class store {
	private  int totalItems	=	0;
	private final int MAX_ITEMS		=	50;
	private Book[] listItems		= 	null;
	
	public store() {
		listItems = new Book[MAX_ITEMS];
	}
	public int getItemPosition(String bookID) {
		for (int i = 0; i < totalItems; i++) {
			if(bookID.equals(listItems[i].getID()) == true) return i;
		}
		return -1;
	}
	public boolean checkEmpty() {
		if(totalItems == 0) return true;	
		return false;
	}
	public boolean checkFull() {
		if(totalItems == MAX_ITEMS) return true;
		else return false;
	}
	public void add(Book bookObj) {
		
			this.listItems[totalItems] = bookObj;
			this.totalItems++;
			System.out.println("add successful!!");
	}
	public void find(String bookID) {
		int bookPositon = this.getItemPosition(bookID);
		if(bookPositon == -1) {
			System.out.println("book is not exist!!");
		}
		else {
			listItems[bookPositon].showInfor();
		}
	}
	public void list() {
		if (this.checkEmpty() == false) { 
			for (int i = 0; i < totalItems; i++) {
				this.listItems[i].showInfor();
			}
		}
		else {
			System.out.println("store is Empty!!");
		}
	}
}
