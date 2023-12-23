package itforstudent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HocChuoi {

	public static void main(String[] args) {
		// Them sua xoa chuoi
		//StringBuilder sb = new StringBuilder();
		/*sb.append("Hello");
		sb.append(" ");
		sb.append("My name is Dat!");
		sb.insert(5, "Bae");
		String s = sb.toString();
		System.out.println(s);
		sb.delete(5, 7);
		s = sb.toString();
		System.out.println(s);
		sb.reverse();
		s= sb.toString();
		System.out.println(s);*/
		// tach chuoi
		/*
		String s = " My name is Dat";
		StringTokenizer token = new StringTokenizer(s);
		while(token.hasMoreTokens()) {
			String value = token.nextToken();
			System.out.println(value);
		}
		String s2 = "alo;hello;adu;kk! lolololo";
		StringTokenizer token2 = new StringTokenizer(s2,";!");
		while(token2.hasMoreTokens()) {
			String value = token2.nextToken();
			System.out.println(value);
		}
		*/
		// trich loc chuoi
		/*
		String s3 = "I miss you so much!";
		System.out.println(s3);
		String s4 = s3.substring(2,6);
		System.out.println(s4);
		String s5 = s3.replace("miss", "love");
		System.out.println(s5);
		String s6 = "I miss you so much, miss you!";
		String s7 = s6.replaceFirst("miss", "love");
			*/	
		// Ham xoa khoang trang
		/*
		String s= "    Le Dac Dat    ";
		System.out.println(s);
		System.out.println("chieu dai ban dau:"+s.length());
		s= s.trim();
		System.out.println("chieu dai sau xoa:" + s.length());
		System.out.println(s);
		// Xoa ben trai
		
		String s1 = "   I love you !   ";
		int vtLeft=0;
		int i=0;
		for (i=0;i<=s1.length();i++) {
			char c = s1.charAt(i);
			if(c == ' ') 
				vtLeft=i;
			else
				break;
			
		}
		s1= s1.substring(i+1);
		System.out.println(s1);
		*/
		
		// so sanh chuoi
		String s1 = "Dat";
		String s2 = "dat";
		int kq1 = s1.compareTo(s2);
		System.out.println(kq1);
		
		int kq2 = s2.compareToIgnoreCase(s2);
		System.out.println(kq2);
		
		if(s1.equals(s2))
			System.out.println(" s1 = s2");
		else
			System.out.println(" s1 !=s2");
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("s1 = s2");
		else
			System.out.println(s1 !=s2);
		
		// Noi va chen chuoi
		
		int a ,b , kq;
		BufferedReader inp;
		try {
			inp = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Nhap a =");
			a = Integer.parseInt(inp.readLine());
			System.out.print("Nhap b =");
			b = Integer.parseInt(inp.readLine());
			kq = a+b;
			System.out.println("Tong  = " +kq);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
			
}
