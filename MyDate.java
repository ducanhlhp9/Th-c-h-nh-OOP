package week2;

import java.util.Scanner;
import java.util.Date;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;


public class MyDate {
		private int day;
		private int month;
		private int year;
		public MyDate(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}
		public MyDate(String day, String month, String year) {
			System.out.println(day + month + year);
		}
		public void pirntCurrentDay() {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd yyyy");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now));
		}
		public MyDate(String str) {
			super();
			int count = 0;
			char[] list = str.toCharArray();
			String date= "";
			for(int i = 0; i< list.length; i++) {
				count++;
				date+=list[i];
				if(list[i] == ' '){
					break;
				}
			}
			switch(date.trim()) {
			case "January": case "1": case "Jan":
				this.setMonth(1); 
				break;
			case "February": case "2": case "Feb":
				this.setMonth(2);
				break;
			case "March": case "3": case "Mar":
				this.setMonth(3);
				break;
			case "April": case "4": case "Apr":
				this.setMonth(4); 
				break;
			case "May": case "5": 
				this.setMonth(5); 
				break;
			case "June": case "6": 
				this.setMonth(6); 
				break;
			case "Jully": case "7": case "Jul":
				this.setMonth(7); 
				break;
			case "August": case "8": case "Aug":
				this.setMonth(8); 
				break;
			case "September": case "9": case "Sep":
				this.setMonth(9); break;
			case "October": case "10": case "Oct":
				this.setMonth(10); break;
			case "November": case "11": case "Nov":
				this.setMonth(11); break;
			case "December": case "12": case "Dec":
				this.setMonth(12); break;
			
			}
			if(this.getMonth()!= 0) {
				date ="";
				for(int i = list.length-1; i >= 0; i--) {
					date += list[i];
					if(list[i] == ' '){
					break;
					}
				}
				date = new StringBuilder(date).reverse().toString();
				this.setYear(Integer.parseInt(date.trim()));
				date = " ";
				char[] list1 = str.substring(count).trim().toCharArray();
				String testDate ="";
				for(int i = 0; i< list1.length; i++) {
					if(list1[i] ==' ') {
						break;
					}
					if(list1[i] >= '0' && list1[i] <= '9') {
						date += list1[i];
					}
					else {
						testDate += list1[i];
					}
				}
				this.setDay(Integer.parseInt(date.trim()));
				if(this.getDay() != 0) {
					if(testDate.equals("st")) {
						if(this.getDay() == 1 || this.getDay() == 21 || this.getDay() == 31) {
							print();
						}
						else {
							System.out.println("Định dạng không hợp lệ. mời nhập lại");
							accept();
						}
					}else if(testDate.equals("nd")) {
						if(this.getDay() == 2 || this.getDay() == 22) {
							print();
						}
						else {
							System.out.println("Định dạng ngày không hợp lệ. Mời nhập lại");
							accept();
						}
					}else if(testDate.equals("rd")) {
						if(this.getDay() == 3 || this.getDay() == 23) {
							print();
						}
						else {
							System.out.println("Định dạng ngày không hợp lệ. Mời nhập lại");
							accept();
						}
					}
					else if(testDate.equals("th")) {
						if(this.getDay()!= 1 || this.getDay() != 21 || this.getDay() != 31 || this.getDay() != 2 || this.getDay()!= 22 || this.getDay() != 3 || this.getDay() != 23) {
							print();
						}
						else {
							System.out.println("Định dạng ngày không hợp lê. Mời nhập lại");
							accept();
						}
					}
					else {
						System.out.println("Định dạng ngày không hợp lệ xin mời nhập lại");;
					}
					
				}
			}
		}
		
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			if(day<1 || day >31) {
				System.out.println("Ngày không hợp lệ, mời nhập lại.");
				accept();
			}else {
				if(this.getMonth() == 1|| this.getMonth() == 3|| this.getMonth() == 5
						||	this.getMonth() == 7|| this.getMonth() == 8|| this.getMonth() ==10
						||	this.getMonth() == 12){
						this.day = day;
					}
					if(this.getMonth() == 2) {
						if(day>29) {
							System.out.println("Ngày không hợp lệ, mời nhập lại");
							accept();
						}
						else if(day == 29 && this.getYear()%4!=0) {
							System.out.println("Ngày không hợp lệ, mời nhập lại");
							accept();
						}
						else {
							this.day = day;
						}
					}
					if(this.getMonth() == 4||this.getMonth() == 6|| this.getMonth() == 9||
							this.getMonth() == 11) {
						if(day == 31) {
							System.out.println("Ngày không hợp lệ, mời nhập lại");
							accept();
						}
						else{
							this.day = day;
						}
					}
			}
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			if(month>=1 && month <=12) {
				this.month = month;
			}else {
				System.out.println("Thang khong hop le. Nhap lai");
				accept();
			}
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			if(year >= 0) {
				this.year = year;
			}else {
				System.out.println("Năm không hợp lệ, mời nhập lại");
				accept();
			}
		}
		public static void accept(){
			Scanner sc = new Scanner(System.in);
			System.out.print("nhập ngày: ");
			String str1 = "";
			String str = "\\w+\\s\\d{1,2}[strndh]{2}\\s\\d+";
			do {
				str1 = sc.nextLine();
				if(!str1.matches(str)) {
					System.out.println("Nhập sai, mời nhập lại");
					System.out.print("nhập: ");
				}
			}while(!str1.matches(str));
			sc.close();
		}
		public void print() {
			System.out.print("Ngày hôm nay là ngày: "+this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
		}
		public static void CompareDate (String day1,String day2)throws ParseException{
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		        Date date1 = sdf.parse(day1);
		        Date date2 = sdf.parse(day2);

		        System.out.println("date1 : " + sdf.format(date1));
		        System.out.println("date2 : " + sdf.format(date2));

		        if (date1.compareTo(date2) > 0) {
		            System.out.println(day1+"Sau"+day2);
		        } else if (date1.compareTo(date2) < 0) {
		            System.out.println(day1+"Trước"+day2);
		        } else if (date1.compareTo(date2) == 0) {
		            System.out.println(day1+"Trùng"+day2);
		        } else {
		            System.out.println("???????");
		        }

		    }
		public static void DateSort() throws ParseException
	    {
	        Scanner sc =new Scanner (System.in);
	        Date date[];
	        String str[];
	        System.out.println("Nhập số lượng ngày:");               
	        int i,n = sc.nextInt();                                    
	        str= new String[n];                                    
	        date= new Date[n];                                      
	        sc.nextLine();                              
	         
	        for(i=0;i<n;i++)
	        {                                           
	            str[i]=sc.nextLine();                               
	        }
	        SimpleDateFormat sobj = new SimpleDateFormat("dd-MM-yyyy");
	         
	        for(i=0;i<n;i++)
	        {
	            date[i]=sobj.parse(str[i]);                         
	        }
	 
	        Arrays.sort(date);                                                                            
	         
	        for(Date date1 : date)                                 
	        {                                                       
	            System.out.println(sobj.format(date1));             
	        }
	    sc.close();     
	    }
		
	
	
}
