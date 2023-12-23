package communityuni.com.javsbase;

import java.util.Scanner;

public class check_SNT {
	
	public static boolean kiemTra(int n) {
		if(n <2)
			return false;
		for(int i =2; i<=Math.sqrt(n);i++) {
			if(n % i ==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao n:");
		int n = sc.nextInt();
		
		boolean kq = kiemTra(n);
		if(kq==true) {
			System.out.println( n + " la so nguyen to");
		}
		else
			System.out.println(n + " khong la so nguyen to");
	}

}
