package javaOOP.model;

import java.util.Scanner;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	
	public MyDate() {
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(this.day >=1 && this.day<=31)
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(this.month >=1 && this.month<=12)
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(this.year>0)
			this.year = year;
	}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);		
		this.day = checkDay();
		this.month = checkMonth();
		this.year = checkYear();
			
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day+"/" +this.month+"/"+this.year;
	}
	public int checkYear() {
		Scanner sc = new Scanner(System.in);
		int y = 0;
		do {
			try {
				System.out.println("Nhap vao nam san xuat:");
				y = sc.nextInt();
				
				if(y<0) {
					System.out.println("Nam khong hop le.Nhap lai:");
					y = sc.nextInt();
				}
				
			}catch(Exception ex) {
				System.out.println("Sai kieu du lieu.Nhap lai:");
			}
			
		}while(y<=0);
		return y;
	}
	
	public int checkMonth() {
		Scanner sc = new Scanner(System.in);
		int m = 0;
		do {
			
			try {
				System.out.println("Nhap thang xuat ban:");
				m = sc.nextInt();
				
				if(m<1 || m>12)
				{
					System.out.println("Ngay nhap vao khong hop le.Nhap Lai:");
					m = sc.nextInt();
				}
				
			}catch(Exception e) {
				System.out.println("Sai kieu du lieu.Nhap lai:");
			}
			
		}while(m<1 || m>12);
		return m;
	}
	
	public int checkDay() {
		Scanner sc = new Scanner(System.in);
		int d = 0;
		do {
			
			try {
				System.out.println("Nhap ngay xuat ban:");
				d = sc.nextInt();
				
				if(d<1 || d>31)
				{
					System.out.println("Ngay nhap vao khong hop le.Nhap Lai:");
					d = sc.nextInt();
				}
				
			}catch(Exception e) {
				System.out.println("Sai kieu du lieu.Nhap lai:");
			}
			
		}while(d<1 || d>31);
		return d;
	}
	
}
