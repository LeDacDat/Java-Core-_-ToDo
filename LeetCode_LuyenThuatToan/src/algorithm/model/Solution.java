package algorithm.model;

import java.util.Scanner;

public class Solution {
	
	public static int romanToInt(String s) {
		
		String sys = "MDLCXVI";
		int[] value = {1000,500,100,50,10,5,1};
		
		int prev = 0;
		int num = 0;
		
		for(int i = s.length()-1;i>=0;i--) {
			int cur = value[sys.indexOf(s.charAt(i))];
			if(prev <cur)
				num+=cur;
			else 
				num-=cur;
			prev = num;
		}
		
		return num;
		
	}

	public static void main(String[] args) {
		System.out.println("Nhap vao ki tu la ma:");
		String src = new Scanner(System.in).nextLine();
		System.out.println("So la ma do la:" + romanToInt(src));

	}

}
