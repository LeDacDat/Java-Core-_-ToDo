package itforstudent;

import java.util.Scanner;

public class LuyenToanhoc {
	
	Scanner sc= new Scanner(System.in);
	
	public static double PhepTinh(int n, double x){
		
		double s = 0;
		double mau = 0;
		for( int i=1;i<=n;i++) {
			
			double tu = Math.pow(x, i);
			mau+=i;		
			s=s+ tu/mau;
		}	
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap vao x");
		double x = sc.nextDouble();
		System.out.println("Moi ban nhap vao n");
		int n= sc.nextInt();
		double st = PhepTinh(n, x);
		System.out.println("Tong S ("+x+","+n+")="+st);
	}

}
