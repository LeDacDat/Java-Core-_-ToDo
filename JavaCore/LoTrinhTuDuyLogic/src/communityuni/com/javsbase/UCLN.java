package communityuni.com.javsbase;

import java.util.Scanner;

public class UCLN {
	
	public static int ucln_eucid(int a,int b) {
		while(b!=0) {
			int t = b;
			b = a%b;
			a = t;
		}
		return a;
	}
	
	public static int ucln(int a,int b) {
		while(a !=b) {
			if(a>b)
				a-=b;
			else
				b-=a;
		}
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Nhap a:");
		a= new Scanner(System.in).nextInt();
		System.out.println("Nhap b:");
		b = new Scanner(System.in).nextInt();
		System.out.println("Uoc chung lon nhat cua 2 so "+ a +" va " + b +" la:" +ucln_eucid(a, b));
	}

}
