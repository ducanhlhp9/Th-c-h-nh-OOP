package AIms;

import java.util.Random;
import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		String title ="Harry Potter va chiec coc lua";
		//xử dụng phương thức contrain để kiểm tra xem xâu kí tự có chưa xâu trong contain không
		System.out.println(title.contains("Harry"));
		System.out.println(title.contains("Hello"));
		//Tách các xâu kí tự: có thể sử dụng đối tượng
		//StringTokenizer
		//Dấu hiệu phân tách chuỗi là gì ?--> dấu" "
		StringTokenizer strToken = new StringTokenizer(title," ");
		//xu ly
		// so luong token tra ve
		System.out.println(strToken.countTokens());
		//Dung vong lap de in ra tung token
		while(strToken.hasMoreTokens()) {
			System.out.println(strToken.nextToken());
		}
		
		//cach khac de tach xau ->> phuong thuc split
		
		String[] strArr;
		strArr = title.split(" ");
		for(int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		//sinh giá trị ngẫu nhiên trong java
		// cách 1: sử dụng phương thức Math.random()
		//-->trả về giá trị ngẫu nhiên trong khoảng từ 0-1
		System.out.println(Math.random());
		
		//cach 2:Sử dụng lớp RandomL nằm trong package
		//tạo đối tượng random
		Random rd = new Random();
		// sử dụng phương thức nextX()--> để sinh giá trị ngẫu nhiên 
		int x= rd.nextInt(10);
		System.out.println(x);
		
	}
}
