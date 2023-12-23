package javaOOP.model;

import java.util.Scanner;

public class Sach {
	
	private String tenSach;
	private String theLoaiSach;
	private double giaSach;
	private MyDate ngayXuatBan = new MyDate();
	private String tacGia;
	
	
	public Sach() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten sach:");
		this.tenSach = sc.nextLine();
		System.out.println("Nhap the loai sach:");
		this.theLoaiSach = sc.nextLine();
		System.out.println("Nhap gia sach:");
		this.giaSach = sc.nextDouble();
		this.ngayXuatBan.Nhap();
		sc.nextLine();
		System.out.println("Nhap tac gia:");
		this.tacGia = sc.nextLine();
	}


	public Sach(String tenSach, String theLoaiSach, double giaSach, MyDate ngayXuatBan, String tacGia) {
		this.tenSach = tenSach;
		this.theLoaiSach = theLoaiSach;
		this.giaSach = giaSach;
		this.ngayXuatBan = ngayXuatBan;
		this.tacGia = tacGia;
	}


	public String getTenSach() {
		return tenSach;
	}


	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}


	public String getTheLoaiSach() {
		return theLoaiSach;
	}


	public void setTheLoaiSach(String theLoaiSach) {
		this.theLoaiSach = theLoaiSach;
	}


	public double getGiaSach() {
		return giaSach;
	}


	public void setGiaSach(double giaSach) {
		this.giaSach = giaSach;
	}


	public MyDate getNgayXuatBan() {
		return ngayXuatBan;
	}


	public void setNgayXuatBan(MyDate ngayXuatBan) {
		this.ngayXuatBan = ngayXuatBan;
	}


	public String getTacGia() {
		return tacGia;
	}


	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	
	public void inThongTinSach() {
		System.out.format("%-15s %-15s %15s %15s  %15s %n","Ten Sach","The Loai Sach","Gia Sach","Ngay Xuat Ban","Tac Gia");
		System.out.printf("%-15s %-15s %15.2f  %15s %15s %n",this.tenSach,this.theLoaiSach,this.giaSach,this.ngayXuatBan, this.tacGia);
	}

	public static void main(String[] args) {
		Sach sach = new Sach();
		sach.inThongTinSach();
	}
}
