package javaOOP.model;

import java.util.Scanner;


public class LopHop {

	private int maLop;
	private String tenLop;
	private int siSo;
	private String diaChi;
	private String tenGVCN;
	
	private Scanner sc = new Scanner(System.in);
	
	public LopHop() {
		System.out.println("Nhap ma lop:");
		this.maLop = sc.nextInt();
		System.out.println("Nhap ten lop:");
		sc.nextLine();
		this.tenLop = sc.nextLine();
		System.out.println("Nhap si so lop:");
		this.siSo = sc.nextInt();
		System.out.println("Nhap dia chi:");
		sc.nextLine();
		this.diaChi = sc.nextLine();
		System.out.println("Nhap ten giao vien chu nhiem:");
		this.tenGVCN = sc.nextLine();
	}

	public LopHop(int maLop, String tenLop, int siSo, String diaChi, String tenGVCN) {
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.siSo = siSo;
		this.diaChi = diaChi;
		this.tenGVCN = tenGVCN;
	}

	public int getMaLop() {
		return maLop;
	}

	public void setMaLop(int maLop) {
		this.maLop = maLop;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public int getSiSo() {
		return siSo;
	}

	public void setSiSo(int siSo) {
		this.siSo = siSo;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getTenGVCN() {
		return tenGVCN;
	}

	public void setTenGVCN(String tenGVCN) {
		this.tenGVCN = tenGVCN;
	}
	
	public void inThongTin() {
		System.out.format("%10s %15s %10s %15s %15s %n","Ma Lop","Ten Lop","Si So","Dia Chi"," GVCN");
		System.out.printf("%10d %15s %10d %15s %15s %n",this.maLop,this.tenLop,this.siSo,this.diaChi,this.tenGVCN);
	}
	
	public static void main(String[] args) {
		
		LopHop lp = new LopHop();
		lp.inThongTin();
	}
	
}
