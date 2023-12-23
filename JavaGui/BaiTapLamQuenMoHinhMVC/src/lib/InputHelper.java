package lib;

import java.util.Scanner;

public class InputHelper {
	
	/**
	 * @param mes tin nhan cho nguoi dung
	 * @param error loi neu co
	 * @author DacDat
	 * @return tra ve so int
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int intHelper(String mes, String error) {
		System.out.println(mes);
		
		int value = 0;
		
		try {
			value = Integer.parseInt(sc.nextLine());
			return value;
			
		}catch(Exception e) {
			System.out.println(error);
			sc.nextLine();
			return intHelper(mes, error);
		}
		
	}
	
	/**
	 * 
	 * @param mes tin nhan cho nguoi dung	
	 * @param error loi neu co
	 * @param min do dai toi thieu cua chuoi
	 * @param max do dai toi da cua chuoi
	 * @return tra ve mot chuoi
	 */
	public static String stringHelper(String mes, String error, int min,int max) {
			
		System.out.println(mes);
		String output = sc.nextLine();
		if(output.trim().length()<= min) {
			System.out.println(error);
			return stringHelper(mes, error, min, max);
		}
		if(output.trim().length() > max) {
			System.out.println(error);
			return stringHelper(mes, error, min, max);
		}
		return output;
	}


	}

