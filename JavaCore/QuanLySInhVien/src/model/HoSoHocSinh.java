package model;

import java.util.Scanner;

public class HoSoHocSinh {
	
	private HocSinh hs = new HocSinh();
	private String lop,khoaHoc;
	private int kyHoc;
	public HocSinh getHs() {
		return hs;
	}
	public void setHs(HocSinh hs) {
		this.hs = hs;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(String khoaHoc) {
		this.khoaHoc = khoaHoc;
	}
	public int getKyHoc() {
		return kyHoc;
	}
	public void setKyHoc(int kyHoc) {
		this.kyHoc = kyHoc;
	}
	public HoSoHocSinh(HocSinh hs, String lop, String khoaHoc, int kyHoc) {
		
		this.hs = hs;
		this.lop = lop;
		this.khoaHoc = khoaHoc;
		this.kyHoc = kyHoc;
	}
	public HoSoHocSinh() {
		
	}
	private Scanner sc = new Scanner(System.in);
	public void Nhap() {
		try {
			hs.Nhap();
			System.out.println("Nhap ten lop:");
			this.lop = sc.nextLine();
			System.out.println("Nhap khoa hoc:");
			this.khoaHoc = sc.nextLine();
			System.out.println("Nhap ki hoc:");
			this.kyHoc = sc.nextInt();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	
	}
	public void HienThiThongTin() {
		System.out.println("------------------------------- Danh Sach Hoc Sinh --------------------------------");
		System.out.printf("%15s %5s %15s %20s %15s %10s %10s",
				"Ho Va Ten","Tuoi","Ngay Sinh","Dia Chi","Ten Lop","Khoa hoc","Ki hoc"
				);
		System.out.println();
		System.out.printf("%15s %5d %15s %20s %15s %10s %10d",
				this.hs.getName(),this.hs.getAge(),this.hs.getNgaySinh(),this.hs.getDiaChi(),this.lop,this.khoaHoc,this.kyHoc
				);
	}

}
