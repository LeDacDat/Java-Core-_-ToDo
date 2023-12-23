package MangJava.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class testMang1c_SapXep {
	
	static int M[];
	static int n;
		
	
	public static void Nhap() {
		System.out.println("Nhap vao so phan tu mang:");
		n= new Scanner(System.in).nextInt();
		
		M = new int[n];
		Random rd = new Random();
		for(int i = 0;i<n;i++) {
			M[i] = rd.nextInt(101);
		}
	}
	
	public static void Xuat() {
		
		for(int i=0;i<n;i++) {
			System.out.print(M[i]+ "\t");
		}
	}
	
	public static void SapXepTang() {
		for(int i = 0;i<n-1;i++) {
			for(int j = n-1;j>i;j--) {
				if(M[j]<M[j-1]) {
					int tg = M[j];
					M[j] = M[j-1];
					M[j-1] = tg;
				}						
			}
		}
		System.out.println("Mang sau khi sap xep tang:");
		Xuat();
	}
	public static void SapXepTang_LuaChon() {
		for(int i = 0;i<n;i++) {
			int m = i;
			for (int j = i+1; j<n;j++) {
				if(M[j] <M[m])
					m = j;
			int tg = M[m];
			M[m] = M[i];
			M[i] = tg;
			}
		}
		System.out.println("Mang sau khi sap xep tang la:");
		Xuat();
	}
	
	public static void SapXepCollections() {
		
		
		Arrays.sort(M);
		System.out.println("Mang sau khi sap xep la:");
		System.out.println(Arrays.toString(M));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhap();
		System.out.println("mang ngau nhien duoc tao ra la:");
		Xuat();
		System.out.println();
		//SapXepTang();
		//SapXepTang_LuaChon();
		SapXepCollections();
	
	}

}
