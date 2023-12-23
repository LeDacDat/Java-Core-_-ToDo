package BaiTapOOP;

import java.util.Scanner;

public class NhanVienDeMo {
	
	static NhanVienCTY[] dsNV;
	static int n;
	
	public static void nhapDSNV()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong nhan vien:");
		n= sc.nextInt();
		dsNV = new NhanVienCTY[n];
		
		for(int i = 0;i<n;i++)
		{
			System.out.println("Nhap thong tin nhan vien thu " +(i+1)+" : ");
			dsNV[i] = new NhanVienCTY();
			dsNV[i].Nhap();
		}
		
	}
	
	public static void inDSNV()
	{
		System.out.println("Danh sach nhan vien ");
		
		NhanVienCTY.xuatTieuDe();
		for (NhanVienCTY nv : dsNV) {
			nv.xuatDL();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapDSNV();
		inDSNV();
	}

}
