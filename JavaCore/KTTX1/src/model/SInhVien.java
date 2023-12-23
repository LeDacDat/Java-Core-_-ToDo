package model;

import java.util.Scanner;

public class SInhVien extends Nguoi implements TaiKhoan{
	
	private String maSinVien;
	private String nganhNghe,tenTaiKhoan,matKhau;
	public String getMaSinVien() {
		return maSinVien;
	}
	public void setMaSinVien(String maSinVien) {
		this.maSinVien = maSinVien;
	}
	public String getNganhNghe() {
		return nganhNghe;
	}
	public void setNganhNghe(String nganhNghe) {
		this.nganhNghe = nganhNghe;
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	
	public SInhVien(String maSinVien, String nganhNghe, String tenTaiKhoan, String matKhau, Scanner sc) {
		super();
		this.maSinVien = maSinVien;
		this.nganhNghe = nganhNghe;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.sc = sc;
	}
	public SInhVien() {
		
	}
	private Scanner sc = new Scanner(System.in);
	public  void Nhap() {
		
		try {
			System.out.println("Nhap ma sinh vien:");
			this.maSinVien = sc.nextLine();
			System.out.println("Nhap ho va ten:");
			this.hoTen = sc.nextLine();
			System.out.println("Nhap ngay sinh:");
			this.ngaySinh = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhap gioi tinh:");
			this.gioiTinh = sc.nextLine();
			System.out.println("Nhap so cccd:");
			this.cccd = sc.nextLine();
			System.out.println("Nhap nganh nghe:");
			this.nganhNghe = sc.nextLine();
			this.NhaptaiKhoan();
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public void NhaptaiKhoan() {
		System.out.println("Nhap ten tai khoan:");
		this.tenTaiKhoan = sc.nextLine();
		System.out.println("Nhap mat khau:");
		this.matKhau = sc.nextLine();
		
	}
	@Override
	public void returnTaiKhoan() {
		System.out.println("Ten Tai Khoan:" +this.tenTaiKhoan);
		System.out.println("Mat khau:" + this.matKhau);
		
	}
	public void HienThiThongTin() {
		System.out.println("ma sinh vien:" +this.maSinVien);
		System.out.println("Ho va ten:" + this.hoTen);
		System.out.println("Ngay sinh:"+this.ngaySinh);
		System.out.println("Gioi tinh:" + this.gioiTinh);
		System.out.println("so cccd:" + this.cccd);
		System.out.println("Nganh nghe:" + this.nganhNghe);
		this.returnTaiKhoan();
	}
	
	
	
	

}
