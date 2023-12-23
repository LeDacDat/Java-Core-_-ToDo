package qlnv.model;

import java.util.Scanner;

public class testNhanVien {

	public static void main(String[] args) {	
		
		DanhSachNhanVien dsNV = new DanhSachNhanVien();
		Scanner sc = new Scanner(System.in);
		int luachon = 0;
		do {
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("MENU:");
			System.out.println("Nhap Lua Chon:");
			System.out.println("1. Them Nhan Vien");
			System.out.println("2. In Danh Sach Nhan Vien");
			System.out.println("0. Thoat Chuong Trinh");
			
			luachon = sc.nextInt();
			sc.nextLine();
			
			if(luachon == 1) {
				NhanVien nv = new NhanVien();
				dsNV.themDanhSachNhanVien(nv);
			}
			else if( luachon == 2)
			{
				dsNV.xuatDanhDachNhanVien();
			}
			
		}while(luachon!=0);

	}

}
