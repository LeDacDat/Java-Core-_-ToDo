package itforstudent;

import java.util.Scanner;

public class TimKiem_Mang {
	public static void NhapMang(int M[]) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Moi ban nhap cac gia tri cho mang:");
		for(int i=0;i<M.length;i++) {
			System.out.print("M ["+i+"] :");
			M[i] = sc.nextInt();
		}
		System.out.println();
		
	}
	public static void  XuatMang(int M[]) {
		System.out.println("Mang vua nhap vao la:");
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
				
	}
	public static void FindNumber(int M[],int k) {
			
		boolean timThay = false;
		for(int i = 0; i<M.length;i++) {
			if(M[i] == k) {
				timThay = true;
				break;
			}
		}
		if( timThay == true) {
			System.out.println("Tim thay " +k + " trong mang");
		}
		else {
			System.out.println("khong tim thay "+ k + " trong mang");
		}
	}
	public static void FindNumberTime(int M[],int k) {
		
		String s = "";
		int dem = 0;
		
		for(int i=0;i<M.length;i++) {
			if(M[i]==k) {
				s+=i +";";
				dem++;
			}
		}
		if( s.length()>0) {
			System.out.println("Tim thay "+ k +" trong mang o cac vi tri sau: "+ s);
			System.out.println( k+ " xuat hien "+ dem +" lan trong mang");
			System.out.println();
		}
		else {
			System.out.println("Khong tim thay!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap so phan tu mang:");
		int n = sc.nextInt();
		int []M = new int[n];
		NhapMang(M);
		XuatMang(M);
		System.out.println();
		//System.out.println("Moi ban nhap vao so muon tim:");
		//int k = sc.nextInt();
		//FindNumber(M, k);
		System.out.println("Moi ban nhap vao so muon tim:");
		int x = sc.nextInt();
		FindNumberTime(M, x);
	}

}
