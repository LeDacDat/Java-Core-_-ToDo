package communityuni.com.model;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap vao 1 chuoi bat ki:");
		 String s1 = sc.nextLine();
		 /* su dung vong lap
		 String reverse = "";
		 for(int i = s1.length()-1;i>=0;i--) {
			 
			 reverse += s1.charAt(i);
		 }
		 System.out.println("After Reverse s1 is:" + reverse);
		*/
		  StringBuffer sb = new StringBuffer(s1);
		  String reverse = "";
		  System.out.println("After Reverse s1 is:" + sb.reverse());
	}

}
