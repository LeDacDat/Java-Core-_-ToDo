package itforstudent;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ontap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao diem toan:");
		float a = sc.nextFloat();
		System.out.println("Nhap vao diem ly:");
		float b = sc.nextFloat();
		System.out.println("Nhap vao diem hoa:");
		float c = sc.nextFloat();
		
		float dtb = (a+b+c)/3;
		
		DecimalFormat dcf = new DecimalFormat("#,###");
		System.out.println("Diem trung binh :"+dcf.format(dtb));
		
		int x = 123456789;
		
		DecimalFormatSymbols dcfs = new DecimalFormatSymbols(Locale.getDefault());
		dcfs.setGroupingSeparator(',');
		dcf.setDecimalFormatSymbols(dcfs);
		
		System.out.println(dcf.format(x));*/
		
		Calendar cal = Calendar.getInstance();
		int YearNow = cal.get(Calendar.YEAR);
		/*int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);*/
		 System.out.println("Moi ban nhap nam sinh (dd/MM/yyyy) :");
		 String ns = new Scanner(System.in).nextLine();
		 
		 Date t = cal.getTime();
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 System.out.println(sdf.format(t));
		 SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		 System.out.println(sdf1.format(t));
		 
		 //LocalDateTime x = LocalDateTime.now();
		 //System.out.println(x);
				
		 
		try {
			Date bir = sdf.parse(ns);
			cal.setTime(bir);
			int YearNs = cal.get(Calendar.YEAR);
			
			int Age = YearNow - YearNs;
			System.out.println("Age of you :"+ Age);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
