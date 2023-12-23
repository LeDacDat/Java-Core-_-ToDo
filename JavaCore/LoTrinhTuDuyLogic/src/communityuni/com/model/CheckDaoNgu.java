package communityuni.com.model;

import java.util.Arrays;
import java.util.Scanner;

public class CheckDaoNgu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi 1:");
		String s1 = sc.nextLine();
		System.out.println("Nhap chuoi 2:");
		String s2 = sc.nextLine();
		
		boolean kq = isAnagramUsingMethod(s1, s2);
		if(kq == true)
			System.out.println(s1 + " va " + s2 +" la dao ngu");
		else
			System.out.println(s1 + " va " + s2 +" khong la dao ngu");
		
		}	
	/* su dung cac phuong thuc chuoi
	public static boolean isAnagramUsingMethod (String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;
		for( int i = 0 ; i< s1.length(); i++) {
			char c = s1.charAt(i);
			int index = s2.indexOf(c);
			
			if(index != -1) {
				s2 = s2.substring(0, index) + s2.substring(index +1, s2.length());
			}
			else return false;
			
		}
		return s2.isEmpty();
		
		}
		*/
	
	public static boolean isAnagramUsingMethod (String s1, String s2) {
		
		String sortedS1 = sortChar(s1);
		String sortedS2 = sortChar(s2);
		
		return sortedS1.equals(sortedS2);
		
	}
	
	public static String sortChar(String s1) {
		char[] wordArr = s1.toLowerCase().toCharArray();
		Arrays.sort(wordArr);
		return String.valueOf(wordArr);
	}
	}
	
	


