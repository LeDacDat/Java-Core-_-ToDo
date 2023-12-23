package communityuni.com.model;

import java.util.HashSet;
import java.util.Scanner;

public class uniqueChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao chuoi bat ki:");
		String s1 = sc.nextLine();
		
		boolean kq = hasAllUniqueChar(s1);
		if(kq == false )
			System.out.println(s1 + " khong co ki tu duy nhat ");
		else
			System.out.println(s1 +" la chuoi co ki tu duy nhat ");
		
	}
	public static boolean hasAllUniqueChar (String s1) {
			HashSet alphaSet = new HashSet<>();
			for(int i = 0; i<s1.length();i++) {
				char c = s1.charAt(i);
				
				if(!alphaSet.add(c))
					return false;
			}
			return true;
	}

}
