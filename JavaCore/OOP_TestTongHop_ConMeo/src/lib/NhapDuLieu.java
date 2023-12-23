package lib;

import java.util.Scanner;

public class NhapDuLieu {
	
	private static Scanner sc= new Scanner(System.in);
	
	public static int Nhap_soNguyen(String mes, String err) {
		System.out.println(mes);
		int value = 0;
		try {
			value = Integer.parseInt(sc.nextLine());
			return value;
			
		}catch(Exception e) {
			System.out.println(err);
			sc.nextLine();
			return Nhap_soNguyen(mes, err);
		}
		
	}
	
	public static String Nhap_Chuoi(String mes, String err) {
		System.out.println(mes);
		String input = sc.nextLine();
		return input;
	}

}
