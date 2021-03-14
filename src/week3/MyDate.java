package week3;

import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MyDate {
	private int year;
	private int month;
	private int date;
	
	public MyDate() {
		Calendar cal = Calendar.getInstance();
		setDate(cal.get(Calendar.DAY_OF_MONTH));
		setMonth(cal.get(Calendar.MONTH) +1);
		setYear(cal.get(Calendar.YEAR));
	}
	
	public MyDate(int date, int month, int year) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public void Input() {
		Scanner sc = new Scanner(System.in);
		String strDate, strMonth, strYear;
		int date, month, year;
		do {
			strDate = JOptionPane.showInputDialog(null,"nhập ngày",JOptionPane.INFORMATION_MESSAGE);
			date = Integer.parseInt(strDate);
			setDate(date);
		}while(date <0 || date >31);
		do {
			strMonth = JOptionPane.showInputDialog(null,"nhập tháng",JOptionPane.INFORMATION_MESSAGE);
			month = Integer.parseInt(strMonth);
			setMonth(month);
		}while(month <0 || month>12);
		do {
			strYear = JOptionPane.showInputDialog(null,"nhập năm",JOptionPane.INFORMATION_MESSAGE);
			year = Integer.parseInt(strYear);
			setYear(year);
		}while(year < 0);
		sc.close();
	}
	public void Show() {
		JOptionPane.showMessageDialog(null,"ngày/tháng/năm :"+ getDate() +"/"+ getMonth()+"/"+ getYear());
	}
	public static void main(String[] args) {
		MyDate ex1 = new MyDate();
		ex1.Show();
		MyDate ex2 = new MyDate(12,1,1);
		ex2.Show();
		
		MyDate ex3 = new MyDate();
		ex3.Input();
		ex3.Show();
	}
}
