package MangJava.model;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Xoa_ChenMang {
	
	static int M[];
	static int n;
	
	public static void Nhap() {
		System.out.println("Nhap so luong phan tu mang:");
		n = new Scanner(System.in).nextInt();
		
		M = new int[n];
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<M.length;i++) {
			System.out.println("M["+i+"]:");
			M[i] = sc.nextInt();
		}
	}
	public static void Xuat() {
		for(int i = 0;i<M.length;i++) {
			System.out.println(M[i] +"\t");
		}
	}
	
	public static void Menu() {
		System.out.println("1. Nhap mang");
		System.out.println("2. Xuat Mang");
		System.out.println("3. Xoa mang");
		System.out.println("4. Chen mang");
		System.out.println("0. Thoat");
		System.out.println("Ban chon gi?");
		
		int chon = new Scanner(System.in).nextInt();
		switch(chon) {
		case 1:
			Nhap();
			break;
		case 2:
			Xuat();
			break;
		case 3:
			XoaMang();
			break;
		case 4:
			ChenMang();
			break;
		case 0:
			System.err.println("Cam on ban da dung phan mem!");
			System.exit(0);
			default:
				System.out.println("So ban chon khong hop le! Chon lai.");
				break;
		}
	}

	private static void ChenMang() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao vi tri muon chen:");
		int pos = new Scanner(System.in).nextInt();
		System.out.println("Nhap vao gia tri muon chen:");
		int value = new Scanner(System.in).nextInt();
		
		int N = M.length;
		M = Arrays.copyOf(M, N +1);
		
		for(int i = M.length;i>pos;i++) {
			M[i] = M[i-1];
			M[pos] = value;
			n++;
		}
		
		
	}
	private static void XoaMang() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao vi tri muon xoa:");
		int pos = new Scanner(System.in).nextInt();
		
		for(int i = pos;i<M.length-1;i++) {
			M[i] = M[i+1];
		}
		n--;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Menu();
		}
	}

}
