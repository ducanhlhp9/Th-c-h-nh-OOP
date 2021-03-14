package week1;
import java.util.*;

public class helloWorld{
public static void  main(String[] args) {
	System.out.println("abac");
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap vao so a:");
	int a= sc.nextInt();
	System.out.println("nhap vao so b:");
	int b = sc.nextInt();
	int tong = a+b;
	System.out.println("tong 2 so la "+ tong);
	sc.close();
	}
}