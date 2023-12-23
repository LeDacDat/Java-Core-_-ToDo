package BaiTapOOP;

import java.util.Scanner;

public class NhanVienCTY {

	private String hoDem;
	private String ten;
	private MyDate ngaySinh = new MyDate();
	private MyDate ngayVaoLam = new MyDate();
	
	public NhanVienCTY() {
		
	}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho dem: ");
		this.hoDem = sc.nextLine();
		System.out.println("Nhap Ten:");
		this.ten = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh:");
		ngaySinh.Nhap();
		System.out.println("Nhap ngay vao lam:");
		ngayVaoLam.Nhap();
		
	}
	
	static void xuatTieuDe()
	{
		System.out.printf("%-15s %-10s %15s %15s %n","Ho dem", "Ten","Ngay Sinh", "Ngay vao lam");
	}
	public void xuatDL() {
		System.out.printf("%-15s %-10s %15s %15s %n",this.hoDem, this.ten,this.ngaySinh, this.ngayVaoLam);
	}
	
}
