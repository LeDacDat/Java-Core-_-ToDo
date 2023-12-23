package javaOOP.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocVien {
	
	private int maHocVien;
	private String hoTen;
	private MyDate ngaySinh = new MyDate();
	private String ho;
	private double hocPhi;
	private String email;
	
	private Scanner sc = new Scanner(System.in);
	public HocVien() {
		
		System.out.println("Nhap vao ma hoc vien:");
		this.maHocVien = sc.nextInt();
		System.out.println("Nhap vao ho va ten:");
		this.hoTen = sc.nextLine();
		sc.nextLine();
		this.ngaySinh.Nhap();
		System.out.println("Nhap vao hoc phi:");
		this.hocPhi = sc.nextDouble();
		
		
	}

	

	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public HocVien(int maHocVien, String hoTen, MyDate ngaySinh, String ho, double hocPhi, String email) {
		this.maHocVien = maHocVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.ho = ho;
		this.hocPhi = hocPhi;
		this.email = email;
	}


	public int getMaHocVien() {
		return maHocVien;
	}


	public void setMaHocVien(int maHocVien) {
		this.maHocVien = maHocVien;
	}


	public MyDate getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(MyDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getHo() {
		
		setHo();
		return ho;
	}


	private void setHo() {
		this.ho = this.hoTen.split(" ")[0];
	}


	public double getHocPhi() {
		if(this.hocPhi>3000000)
			this.hocPhi+= this.hocPhi - this.hocPhi*0.05;
		return hocPhi;
	}


	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}


	public String getEmail() {
		setEmail();
		return email;
	}


	private void setEmail() {
		this.email = this.hoTen.replace(" ", "").toLowerCase() + "@edusolution.com";
	}


	public void inThongTin() {
		
		System.out.println("Ma hoc vien " +this.maHocVien +" co ten la " + this.hoTen +" co email la " + this.getEmail());
	}
	
	public static List<HocVien> timKiemHocVien(List<HocVien> lst)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten hoc vien can tim kiem:");
		String ten = sc.nextLine();
		List<HocVien>  lstKq = new ArrayList<>();
		for (HocVien hocVien : lstKq) {
			if(hocVien.getHoTen().contains(ten))
				lstKq.add(hocVien);
			
		}
		return lstKq;
	}
	public static void main(String[] args) {
		HocVien hv = new HocVien();
		hv.inThongTin();
		
		List<HocVien> lst = new ArrayList<>();
		lst.add(hv);
		lst.add(new HocVien());
		lst.add(new HocVien());
		
		List<HocVien> lstKq = HocVien.timKiemHocVien(lst);
		for (HocVien i : lstKq) {
			i.inThongTin();
		}
		
	}

}
