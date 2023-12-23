package javaOOP.model;

import java.util.Scanner;

public class DonDatHang {
	
	private int maDonHang;
	private MyDate ngayDat = new MyDate();
	private String tenSanPham;
	private double donGia;
	private int soLuong;
	private double thanhTien;
	private String ghichu;
	
	private Scanner sc = new Scanner(System.in);
	
	
	public DonDatHang() {
		
		System.out.println("Nhap vao ma don hang:");
		this.maDonHang = sc.nextInt();
		this.ngayDat.Nhap();
		sc.nextLine();
		System.out.println("Nhap vao ten san pham:");
		this.tenSanPham = sc.nextLine();
		System.out.println("Nhap vao don gia:");
		this.donGia = sc.nextDouble();
		System.out.println("Nhap vao so luong:");
		this.soLuong = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao ghi chu:");
		this.ghichu = sc.nextLine();
	}


	public DonDatHang(int maDonHang, MyDate ngayDat, String tenSanPham, double donGia, int soLuong, 
			String ghichu) {
		this.maDonHang = maDonHang;
		this.ngayDat = ngayDat;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.ghichu = ghichu;
	}


	public int getMaDonHang() {
		return maDonHang;
	}


	public void setMaDonHang(int maDonHang) {
		this.maDonHang = maDonHang;
	}


	public MyDate getNgayDat() {
		return ngayDat;
	}


	public void setNgayDat(MyDate ngayDat) {
		this.ngayDat = ngayDat;
	}


	public String getTenSanPham() {
		return tenSanPham;
	}


	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}


	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}


	public int getSoLuong() {
		return soLuong;
	}


	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}


	public double getThanhTien() {
		return this.donGia * this.soLuong;
	}


	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}


	public String getGhichu() {
		return ghichu;
	}


	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	
	
	public void inThongTin()
	{
		System.out.println( this.tenSanPham+" "+" co ma so don hang la " + this.maDonHang+ " dat ngay "+ this.ngayDat +" co tong tien la :" + this.getThanhTien());
	}
	
	public static void main(String[] args) {
		DonDatHang donHang = new DonDatHang();
		donHang.inThongTin();
	}

}
