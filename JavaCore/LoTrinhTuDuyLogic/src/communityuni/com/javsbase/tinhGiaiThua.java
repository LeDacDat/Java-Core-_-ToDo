package communityuni.com.javsbase;

import java.util.Scanner;

public class tinhGiaiThua {
	
	public static long giaiThua(int n) {
		
		if(n<=1)
			return 1;
			return n* giaiThua(n-1);
		
	}
	public static long giaiThua_For(int n) {
		
		
		long gt = 0;
		
		if(n ==0 || n ==1)
			return giaiThua_For(n);
		
		for(int i =2;i<n;i++ ) {
			gt *=i;
		}
			return giaiThua_For(n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Giai thua cua so "+ n + " la:" +giaiThua_For(n));
		System.out.println();
	}

}
