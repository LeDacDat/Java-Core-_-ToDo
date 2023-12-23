package itforstudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LuyenTap_Arr2 {
	static HashMap<Integer, String> map = new HashMap<Integer,String>();
	
	public static void Menu() {
		System.out.println("1. Them");
		System.out.println("2. Xuat");
		System.out.println("3. Sua");
		System.out.println("4. Xoa");
		System.out.println("5. Tim Kiem");
		System.out.println("0. Thoat");
		System.out.println("Moi ban chon cong viec:");
		
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
			TimKiem();
			break;
		case 0:
			System.err.println("Cam on ban da dung phan mem!");
			System.exit(0);
		default:
			System.out.println("Ban chon so khong hop le! Chon lai");
			break;
		}
	}

	private static void TimKiem() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao ten muon tim:");
		String ten = new Scanner(System.in).nextLine();
		
		for(Map.Entry<Integer, String> item : map.entrySet()) {
			if(item.getValue().contains(ten)) {
				System.out.println(item.getKey() + "-" + item.getValue());
			}
			else {
				System.out.println("khong tim thay ten sach!");
			}
			break;
		}
	}

	private static void Xoa() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao ma muon xoa:");
		int ma = new Scanner(System.in).nextInt();
		
		if(map.containsKey(ma)== false) {
			
			System.out.println("Ma " + ma + " khong ton tai!");
			
		}
		else {
			map.remove(ma);
			System.out.println("Xoa thanh cong!");
		}
		
	}

	private static void Sua() {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao ma muon sua:");
		int ma = new Scanner(System.in).nextInt();
		
		if(map.containsKey(ma) == false) {
			
			System.out.println("Ma " + ma + " khong ton tai!");
		}
		else {
			System.out.println("Nhap ten sach moi :");
			String ten = new Scanner(System.in).nextLine();
			
			map.put(ma, ten);
			System.out.println("Sua thanh cong!");
		}
		
	}

	private static void Xuat() {
		// TODO Auto-generated method stub
		System.out.println("Ma\t Ten Sach ");
		for(Map.Entry<Integer, String> item : map.entrySet()) {
			
			System.out.println(item.getKey() + "\t" + item.getValue());
		}
		
	}

	private static void Them() {
		// TODO Auto-generated method stub
		System.out.println("Moi ban nhap vao ma sach:");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("Moi ban nhap vao ten sach:");
		String ten = new Scanner(System.in).nextLine();
		
		if(map.containsKey(ma) == false) {
			map.put(ma, ten);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Menu();
		}
	}

}
