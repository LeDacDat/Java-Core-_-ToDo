package JavaCore.model;

import java.io.DataInputStream;
import java.util.Scanner;

public class CheckTime {

	public static void main(String[] args) {
		
		int month, year;
		
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Nhap thang:");
			month = sc.nextInt();
			System.out.println("Nhap Nam:");
			year = sc.nextInt();
			
			if(year<100||year>2022)
				System.out.println("Khong hop le!");
			
		}while(year<100||year>2022);
		
		if(year %4 == 0 && year %100 !=0 || year%400 == 0)
		{
			if(month == 2)
				System.out.println(month +" - "+year +" co 29 ngay");
			else if(month == 1||month == 3|| month == 5|| month ==7|| month == 8||month==10|| month == 12)
				System.out.println(month +" - "+year +" co 31 ngay");
			else if(month == 4||month == 6|| month == 9|| month ==11)
				System.out.println(month +" - "+year +" co 30 ngay");
			else
				System.out.println("Khong phai thang trong nam");
		}
		else
		{
			if(month == 2)
				System.out.println(month +" - "+year +" co 28 ngay");
			else if(month == 1||month == 3|| month == 5|| month ==7|| month == 8||month==10|| month == 12)
				System.out.println(month +" - "+year +" co 31 ngay");
			else if(month == 4||month == 6|| month == 9|| month ==11)
				System.out.println(month +" - "+year +" co 30 ngay");
			else
				System.out.println("Khong phai thang trong nam");
		}
	}

}
