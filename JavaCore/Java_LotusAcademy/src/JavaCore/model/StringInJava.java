package JavaCore.model;

import java.util.Calendar;
import java.util.Scanner;

public class StringInJava {
	
	public static void DemKiTu(String str)
	{
		int countChar[] = new int [256];
		for(int i = 0;i<str.length();i++)
			countChar[str.charAt(i)]++;
		
		char Array[] = new char[str.length()];
		
		for(int i = 0;i<str.length();i++)
		{
			Array[i] = str.charAt(i);
			int flag = 0;
			for(int j = 0;j<str.length();j++) {
				if(str.charAt(i) == Array[j])
					flag++;
			}
			if(flag == 1)
				System.out.println("So lan xuat hien cua " +str.charAt(i) + " trong chuoi la:" +countChar[str.charAt(i)]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten:");
		String name = sc.nextLine();
		
		/*ile(name.contains("  ")) {
			name = name.replace("  ", " ");
		}*/
		
		String[] nameArr = name.split("\\s+");
		String firstName = "";
		
		for(int i = 0;i<nameArr.length;i++)
		{
			firstName += nameArr[i].toLowerCase();
		}
		String email = firstName + "@hvitclan.vn";
		System.out.println(email);
		
		//DemKiTu(str);*/
		
		
	}

}
