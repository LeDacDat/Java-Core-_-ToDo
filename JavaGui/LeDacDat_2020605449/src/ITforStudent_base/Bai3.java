package ITforStudent_base;

import java.util.Scanner;

public class Bai3 {
	static int a,b;
	public static void Nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a:");
		a= sc.nextInt();
		System.out.println("Nhap b:");
		b = sc.nextInt();
	}
	
	public static void Menu() {
		
		System.out.println("1. Tong");
		System.out.println("2. Hieu");
		System.out.println("3. Tich ");
		System.out.println("4. Thuong");
		System.out.println("5. Thoat");
		System.out.println("Ban chon gi?");
		
		int chon = new Scanner(System.in).nextInt();
		
		switch(chon) {
		case 1:
			Tong();
			break;
		case 2:
			Hieu();
			break;
		case 3:
			Tich();
		case 4:
			Thuong();
			break;
		case 5:
			System.err.println("Thoat phan mem!");
			System.exit(0);
		default:
			System.out.println("So ban chon khong hop le , Chon lai!");
			break;
		}
		
	}

	private static void Thuong() {
		// TODO Auto-generated method stub
		
		while(b!=0) {
			float div = a/b;
			System.out.println("Thuong 2 so " +a+ " va " + b+ " la:"+div);
			if(b == 0)
				System.err.println("Loi Chia 0!");
			break;		
		}
		
	}

	private static void Tich() {
		// TODO Auto-generated method stub
		int mul = a*b;
		System.out.println("Tich 2 so " +a+ " va " + b+ " la:"+mul);
		
	}

	private static void Hieu() {
		// TODO Auto-generated method stub
		int sub = a-b;
		System.out.println("Hieu 2 so " +a+ " va " + b+ " la:"+sub);
		
	}

	private static void Tong() {
		// TODO Auto-generated method stub
		int sum = a+b;
		System.out.println("Tong 2 so " +a+ " va " + b+ " la:"+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhap();
		while(true) {
			Menu();
		}
	}

}
