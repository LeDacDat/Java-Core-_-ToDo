package itforstudent;

import java.util.Scanner;

public class HocMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []M;
		System.out.println("Moi ban nhap vao so luong phan tu mang:");
		int n = sc.nextInt();
		M = new int [n];
		
		System.out.println("Moi ban nhap vao phan tu mang:");
		for(int i=0;i<M.length;i++) {
			System.out.println("M ["+i+"] :");
			M[i] = sc.nextInt();
		}
		
		System.out.println("Mang vua nhap la:");
		
		for(int i=0;i<M.length;i++) {
			System.out.println(M[i]+" ");
			
		}
		System.out.println();
		System.out.println("Xuat mang theo gia tri:");
		for(int i : M) {
			System.out.println(i + "\t");
		}
		System.out.println();
	}

}
