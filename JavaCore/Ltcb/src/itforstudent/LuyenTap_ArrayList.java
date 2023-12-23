package itforstudent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class LuyenTap_ArrayList {
	static ArrayList<Integer> dsData = new ArrayList<Integer>();

	public static void Menu() {
		
		System.out.println("1. Them");
		System.out.println("2. Xuat");
		System.out.println("3. Sua");
		System.out.println("4. Xoa");
		System.out.println("5. Tim");
		System.out.println("6. Sap Xep");
		System.out.println("0. Thoat");
		
		System.out.println("Ban muon chon gi?");
		int chon = new Scanner(System.in).nextInt();
		
		switch(chon) {
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
				System.out.println("So ban lua chon khong hop le! Chon lai.");
				break;
		
		}
		
	}
	private static void SapXep() {
		// TODO Auto-generated method stub
		Collections.sort(dsData);
		
	}
	private static void Tim() {
		// TODO Auto-generated method stub
		System.out.println("Ban muon tim so nao?");
		int k = new Scanner(System.in).nextInt();
		if(dsData.contains(k)) {
			System.out.println(" Co " + k + " trong danh sach");
		}
		else {
			System.out.println("Khong tim thay " + k + " trong ds!");
		}
		
	}
	private static void Xoa() {
		// TODO Auto-generated method stub
		System.out.println("Ban muon xoa vi tri nao:");
		int pos = new Scanner(System.in).nextInt();
		dsData.remove(pos);
		
	}
	private static void Sua() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vi tri muon sua:");
		int pos = new Scanner(System.in).nextInt();
		System.out.println("Gia tri muon sua:");
		int newValue = new Scanner(System.in).nextInt();
		dsData.set(pos, newValue);
		
	}
	private static void Xuat() {
		// TODO Auto-generated method stub
		for(int i =0 ; i<dsData.size();i++) {
			System.out.print(dsData.get(i) + "\t");
		}
		System.out.println();
		
	}
	private static void Them() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao gia tri ban muon them:");
		int value = new Scanner(System.in).nextInt();
		dsData.add(value);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Menu();
		}
	}

}
