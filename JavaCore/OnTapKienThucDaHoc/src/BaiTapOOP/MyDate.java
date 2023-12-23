package BaiTapOOP;

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
	
	public void checkTime(int day, int month, int year)
	{
		if(month >=1 && month<=12)
			this.month = month;
		else 
			this.month = 1;
		
		if(year >0)
			this.year = year;
		this.day = checkDay(day);
		
	}
	public int checkDay(int ngayKiemTra)
	{
		
		int ngayTrongThang[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(ngayKiemTra >0 && ngayKiemTra <= ngayTrongThang[this.month]) {
			return ngayKiemTra;
		}
		else if(ngayKiemTra == 29 && this.month ==2 && this.year %400 == 0 || this.year %4 == 0 && this.year %100 == 0)
		{
			return ngayKiemTra;
		}
		else
			return 1;
		
	}
	public void Nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Day :");
		this.day = sc.nextInt();
		System.out.println("Month :");
		this.month = sc.nextInt();
		System.out.println("Year :");
		this.year = sc.nextInt();
		checkTime(day, month, year);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day +"/" +this.month+"/" + this.year;
	}
	
	
	
}
