package week2;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		int n;
		float sum = 0;
		Scanner sc = new Scanner(System.in);		
		do {
            System.out.println("Mời bạn nhập vào số n: ");
            n = sc.nextInt();
        }while(n <1) ;
		for(int i = 1; i <= n; i++) {
			sum = sum +(float)1/i;
		}
		System.out.printf("Tong: %f" ,sum);
		sc.close();
	}
}
