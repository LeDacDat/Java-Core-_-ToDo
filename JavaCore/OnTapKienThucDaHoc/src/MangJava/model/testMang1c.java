package MangJava.model;

import java.util.Random;
import java.util.Scanner;

public class testMang1c {
	
	static int []M;
	static int n;
	
	public static void Nhap() {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu mang:");
		n= sc.nextInt();
		M = new int[n];
		for(int i=0; i<n;i++) {
			M[i] = rd.nextInt(101);
			
		}
		
	}
	public static void Xuat() {
		
		System.out.println("Danh sach ngau nhien vua tao la:");
		for(int i = 0; i<n;i++) {
			System.out.print(M[i] +"\t");
		}
	}
	
	public static void TimKiem(int k) {
		
		
		String s ="";
		int dem = 0;
		
		for(int i = 0;i<M.length;i++) {
			
			if(M[i] == k) {
				s+=i+";";
				dem++;
			}
		
		}
		if(s.length()>0) {
			System.out.println("Tim thay " + k + " o cac vi tri:" +s);
			System.out.println( k+" xuat hien " +dem+ " lan");
			System.out.println();
		}
		else {
			System.out.println("Khong tim thay " + k+ " trong mang:");
			System.out.println();
		}
	}
	
	public static int TimKiemNhiPhan(int M[],int x,int l,int r) {
		
		if(l <= r) {
			int mid = (l+r)/2;
			if( M[mid] == x)
				return mid;
			else if(M[mid] > x)
				return TimKiemNhiPhan(M,x,mid+1,r);
			else 
				return TimKiemNhiPhan(M,x,l,mid -1);
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k;
		Nhap();
		Xuat();
		System.out.println();
		//System.out.println("Nhap vao so ban muon tim kiem:");
		//k = new Scanner(System.in).nextInt();
		//TimKiem(k);
		
		System.out.println("Nhap vao so ban muon tim kiem:");
		int x = new Scanner(System.in).nextInt();
		
		int kq = TimKiemNhiPhan(M, x, 0, n-1);
		if(kq == -1)
			System.out.println("Khong tim thay " +x+" trong mang");
		else
			System.out.println("Tim thay " +x+ " o  vi tri:" +kq);
		
	}

}
