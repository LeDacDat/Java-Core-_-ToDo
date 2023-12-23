package communityuni.com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import communityuni.com.io.KhachHang;
import communityuni.com.io.textFileFactory;
import communityuni.com.io.textFileFactory2;

public class testKhachHang {
	
	static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
	
	public static void Menu() {
		
		System.out.println("1. Nhap");
		System.out.println("2. Xuat");
		System.out.println("3. Luu");
		System.out.println("4. Mo");
		System.out.println("5. Thoat");
		System.out.println("Ban chon gi?");
		
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1 :
			nhap();
			break;
		case 2: 
			xuat();
			break;
		case 3:
			luu();
			break;
		case 4:
			mo();
			break;
		case 5:
			System.err.println("Cam on ban da dung phan mem!");
			System.exit(0);
			break;
			default :
				System.out.println("So ban nhap ko hop le!Chon lai.");
				break;
		}
		
	}

	private static void mo() {
		// TODO Auto-generated method stub
		dsKH = textFileFactory2.readFile("D:/Ltcb_Java/dulieukh.txt");
		
	}

	private static void luu() {
		// TODO Auto-generated method stub
		textFileFactory2.saveFile(dsKH, "D:/Ltcb_Java/dulieukh.txt");
		System.out.println("Luu thanh cong!");		
	}

	private static void xuat() {
		// TODO Auto-generated method stub
		for(KhachHang kh : dsKH) {
			System.out.println(kh);
		}
		
	}

	private static void nhap() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap ma:");
		int ma = sc.nextInt();
		System.out.println("Moi ban nhap ten:");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao nam sinh (dd/MM/yyyy):");
		Date ns = DateConverter.fromString(new Scanner(System.in).nextLine());
		
		KhachHang kh = new KhachHang(ma, ten, ns);
		dsKH.add(kh);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Menu();
		}
	}

}
