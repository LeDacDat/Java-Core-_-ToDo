package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
	private int day, month, year;
	
	public MyDate() {
		
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	private Scanner sc = new Scanner(System.in);
	public  String EnterTime() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String birthday = "";
		try {
			System.out.println("Nhap ngay:");
			this.day= sc.nextInt();
			System.out.println("Nhap thang:");
			this.month = sc.nextInt();
			System.out.println("Nhap nam:");
			this.year= sc.nextInt();
			cal.set(year, month, day);
			birthday = sdf.format(cal.getTime());
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return birthday;
		
	}
	@Override
	public String toString() {
		
		return this.day+"/"+this.month+"/"+this.year;
	}

}
