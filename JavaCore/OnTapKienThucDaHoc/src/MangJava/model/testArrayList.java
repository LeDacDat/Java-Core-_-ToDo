package MangJava.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class testArrayList {
	static ArrayList<Integer> dsData = new ArrayList<Integer>();
	
	public static void Menu() {
		
		System.out.println("1. Them");
		System.out.println("2. Xuat");
		System.out.println("3. Sua");
		System.out.println("4. Xoa");
		System.out.println("5. Tim");
		System.out.println("6. SapXep");
		System.out.println("0. Thoat");
		
		System.out.println("Ban chon gi?");
		int chon = new Scanner(System.in).nextInt();
		
		switch(chon)
		{
		case 1:
			Them();
			break;
		case 2:
			Xuat();
			break;
		case 3:
			Sua();
			break;
		case 4:
			Xoa();
			break;
		case 5:
			Tim();
			break;
		case 6:
			SapXep();
			break;
		case 0:
			System.err.println("Cam on ban da dung phan mem!");
			System.exit(0);
		default:
			System.out.println("So ban chon khong hop le! Chon lai.");
		}
		
	}

	private static void Tim() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao gia tri muon tim:");
		int value = new Scanner(System.in).nextInt();
		
		if(dsData.contains(value)) {
			System.out.println(" Co " +value + " trong danh sach");
		}
		else {
			System.out.println("Khong tim thay " + value + " trong danh sach");
		}
		
	}

	private static void SapXep() {
		// TODO Auto-generated method stub
		Collections.sort(dsData);
		System.out.println("Danh sach sau khi sap xep la:");
		Xuat();
	}

	private static void Xoa() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao vi tri muon xoa:");
		int pos = new Scanner(System.in).nextInt();
		dsData.remove(pos);
		
	}

	private static void Sua() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao vi tri muon sua:");
		int pos = new Scanner(System.in).nextInt();
		System.out.println("Nhap vao gia tri muon sua:");
		int value = new Scanner(System.in).nextInt();
		dsData.set(pos, value);
		
	}

	private static void Xuat() {
		// TODO Auto-generated method stub
		System.out.println("Danh sach vua nhap:");
		for(int i = 0; i<dsData.size();i++) {
			System.out.print(dsData.get(i)+ "\t");
		}
		
	}

	private static void Them() {
		// TODO Auto-generated method stub
		System.out.println("Nhap gia tri muon them:");
		int value = new Scanner(System.in).nextInt();
		dsData.add(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Menu();
			System.out.println();
		}
	}

}
