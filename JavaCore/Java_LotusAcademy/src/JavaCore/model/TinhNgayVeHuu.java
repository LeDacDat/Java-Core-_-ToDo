package JavaCore.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TinhNgayVeHuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
		System.out.println("Nhap vao ngay sinh cua ong lao (dd/MM/yyyy):");
		String ns = new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date bir = sdf.parse(ns);
			cal.setTime(bir);
			int yearNs = cal.get(Calendar.YEAR);
			int yearRelax = yearNs+60;
			System.out.println("Nam ve huu cua ong ta la:" + yearRelax);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
