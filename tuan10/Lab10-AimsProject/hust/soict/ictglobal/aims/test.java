package hust.soict.ictglobal.aims;

public class test {
	public static void main(String[] args) {
		int result = new Two().getNext(3);
		System.out.println(result);
		result =  new One().getNext(3);
		System.out.println(result);
	}
}
