package communityuni.com.javsbase;

import java.util.Scanner;

public class FindMaxChar_String {
	
	public static char FindMostChar(String str)  {
		
		if(str == null || str.isEmpty())
			throw new IllegalArgumentException("Chuoi khong hop le!");
		
		int[] charCounts = new int [256];
		
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			charCounts[ch]++;
		}
		
		char maxChars = 0;
		int maxCounts = 0;
		
		for(int i = 0;i<charCounts.length;i++) {
			if(charCounts[i] > maxCounts) {
				maxCounts = charCounts[i];
				maxChars = (char) i;
			}		
		}
		return maxChars;
	}
	
	

	public static void main(String[] args) throws IllegalAccessException  {
		
		String str ;
		System.out.println("Nhap vao chuoi bat ki:");
		str = new Scanner(System.in).nextLine();
		
		char kq = FindMostChar(str);
		
		System.out.println("ki tu xuat hien nhieu nhat trong chuoi " + str + " la:" +kq);
		
		
	}

}
