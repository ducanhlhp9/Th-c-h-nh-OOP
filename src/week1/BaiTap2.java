package week1;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao thang:");
		int month= sc.nextInt();
		if(month<=0 || month >12) {
			System.out.println("Thang tu 1->12, moi nhap lai");
			month = sc.nextInt();
		}
		System.out.println("nhap vao nam:");
		int year = sc.nextInt();
		if(year <= 0) {
			System.out.println("Nam > 0, moi nhap lai");
			year = sc.nextInt();
		}
		while ((month <= 12) && (month >=1) && (year > 0))        
	    {                                                                             
			if(month == 1 ||month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12) {
				System.out.printf("Nam: %d, thang:%d co 31 ngay",year,month);
			}
			else if(month == 4 ||month == 6 ||month == 9 ||month == 11 ){
				System.out.printf("Nam: %d, thang:%d co 30 ngay",year,month);
			}
			else if(month == 2) {
				if(year %4==0) {
					System.out.printf("Nam: %d, thang:%d co 29 ngay",year,month);
				}
				else System.out.printf("Nam: %d, thang:%d co 28 ngay",year,month);break;
					
			}
	    };
	    sc.close();
	}
}
