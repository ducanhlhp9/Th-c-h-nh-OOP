package bookstore1;

import java.util.Scanner;

public class bookstore {
	private static store storeObj = new store();
	private static Book bookObj = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int functionID = 0;
		boolean flag = true;
		do {
			showMenu();
			functionID = sc.nextInt();
			sc.nextLine();
			switch (functionID) {
			case 1:
				ListBook();				
				break;
			case 2:
				AddBook();
				break;
			case 3:
				FindBook();
				break;
			case 4:
			default:
				flag = false;
				break;
			}
		} while (flag == true);
		sc.close();
	}

	public static void showMenu() {
		myPrint("---------------------------------");
		myPrint("           BookStore             ");
		myPrint("1. Show libarary information");
		myPrint("2. Add new book");
		myPrint("3. Find book");
		myPrint("4. Exit");
		myPrint("==================================");
		myPrint("Enter menu ID (1-4): ");
	}


	public static void AddBook() {
		if (storeObj.checkFull() == false) {
			Scanner sc = new Scanner(System.in);
			String bookName = "";
			String bookID = "";
			double bookPrice = 0;

			myPrint("ID: ");
			bookID = sc.nextLine();

			myPrint("Name: ");
			bookName = sc.nextLine();

			myPrint("Price: ");
			bookPrice = sc.nextDouble();
			myPrint("Name: ");
			bookName = sc.nextLine();
			bookObj = new Book(bookID, bookName, bookPrice);
			storeObj.add(bookObj);
			sc.close();
		} else {
			System.out.println("store is FUll!!");
		}
		
	}

	public static void myPrint(String content) {
		System.out.println(content);
	}
	public static void FindBook() {
		Scanner sc = new Scanner(System.in);
		String bookID = "";
		myPrint("ID: ");
		bookID = sc.nextLine();
		storeObj.find(bookID);
		sc.close();
	}

	public static void ListBook() {
		storeObj.list();
	}
}
