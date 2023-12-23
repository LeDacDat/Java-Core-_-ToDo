package itforstudent;

import java.util.Scanner;

public class Dayso {
	
	static int []M;
	static int n;
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong phan tu:");
		n = sc.nextInt();
		M = new int[n];
		 for(int i=0;i<M.length;i++) {
			 System.out.println("Nhap phan tu thu M["+i+"] :");
			 M[i] = sc.nextInt();
		 }
		 System.out.println("Danh sach vua nhap:");
		 
		 for(int i =0; i< M.length;i++) {
			 System.out.println(M[i] + "\t");
		 }
		
		
		
	}

}
