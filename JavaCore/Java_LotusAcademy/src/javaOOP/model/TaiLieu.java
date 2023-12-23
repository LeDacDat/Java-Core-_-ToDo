package javaOOP.model;

import java.util.Scanner;

public class TaiLieu {
	
	protected int maTaiLieu, soBanPhatHanh;
	public int getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}
	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}
	protected String tenNhaXuatBan;
	
	private Scanner sc= new Scanner(System.in);
	
	protected void Nhap() {
		System.out.println("Nhap ma tai lieu :");
		setMaTaiLieu(sc.nextInt());
		System.out.println("Nhap so ban phat hanh:");
		setSoBanPhatHanh(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap nha xuat ban:");
		setTenNhaXuatBan(sc.nextLine());
		
	}
	protected void inThongTin() {
		System.out.println("Ma Tai lieu:" + this.maTaiLieu);
		System.out.println("So ban phat hanh:" + this.soBanPhatHanh);
		System.out.println("Ten Nha Xuat Ban:" +this.tenNhaXuatBan);
	}
	
}
