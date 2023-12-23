package itforstudent;

import java.util.Scanner;

public class Xoa_ChenMang {
	static int M[];
	
	public static void NhapMang(int M[],int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<M.length;i++) {
			System.out.println("M ["+i+"] :");
			M[i] = sc.nextInt();
		}
	}
	
	public static void XuatMang(int M[],int n) {
		for(int i = 0;i<M.length;i++) {
			System.out.print(M[i] + "\t");
		}
	}
	
	public static void XoaMang(int M[],int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vi tri can xoa:");
		int k = sc.nextInt();
		for(int i = k;i<n-1;i++) {
			M[i] = M[i+1];
		}
		n--;
	}
	
	public static void ChenMang(int M[],int n) {
		System.out.println("Nhap vao vi tri can chen:");
		int index = new Scanner(System.in).nextInt();
		System.out.println("Nhap vao gia tri can chen:");
		int x = new Scanner(System.in).nextInt();
		
		for(int i = M.length-1;i>index;i--) {
			M[i] = M[i-1];
			M[index] = x;
		}
		n++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu mang:");
		int n = sc.nextInt();
		int []M = new int[n];	
		NhapMang(M,n);
		XuatMang(M,n);
		
		//XoaMang(M,n);
		//System.out.println("Mang sau khi xoa la:");
		//XuatMang(M,n);
		ChenMang(M, n);
		System.out.println("Mang sau khi chen la:");
		XuatMang(M, n);
	}

}
