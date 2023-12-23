package itforstudent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NgayThangNam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		
		System.out.println("Moi ban nhap vao nam sinh (dd/MM/yyyy):");
		String ns = new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		try {
			Date birthday =  sdf.parse(ns);
			cal.setTime(birthday);
			int yearNs = cal.get(Calendar.YEAR);
			int Age = yearNow - yearNs;
			System.out.println("Tuoi hien tai cua ban la:" +Age);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
