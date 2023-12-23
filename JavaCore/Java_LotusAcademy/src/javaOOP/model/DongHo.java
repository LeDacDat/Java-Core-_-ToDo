package javaOOP.model;

import java.util.Scanner;

public class DongHo {
	
	private int gio, phut, giay;
	private Boolean laBuoiSang;
	public int getGio() {
		return gio;
	}
	public void setGio(int gio) {
		this.gio = gio;
		if(this.gio <12) laBuoiSang = true;
		else laBuoiSang = false;
	}
	public int getPhut() {
		return phut;
	}
	public void setPhut(int phut) {
		this.phut = phut;
	}
	public int getGiay() {
		return giay;
	}
	public void setGiay(int giay) {
		this.giay = giay;
	}
	public Boolean getLaBuoiSang() {
		return laBuoiSang;
	}
	public DongHo(int gio, int phut, int giay) {
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
	}	
	private Scanner sc= new Scanner(System.in);
	private int NhapSo(String msgNhap, String msgLoi, int min,int max) {
		boolean ok = false;
		int so = 0;
		
		do {
			
			try {
				System.out.println(msgNhap);
				sc.nextInt();
				ok = true;
				ok = ok && so>=min && so<=max;			
			}catch(Exception ex )
			{
				System.out.println(msgLoi);
				sc.nextLine();
			}
			
		}while(!ok);
		return so;
	}
	public DongHo() {
		setGio(NhapSo("Nhap gio:", "Gio nhap vao phai la 1 so nguyen trong khoang [0-24]", 0, 24));
		setPhut(NhapSo("Nhap phut", "Phut Nhap vao phai la mot so nguyen trong khoang tu [0-59]", 0, 59));
		setGiay(NhapSo("Nhap giay:", "Giay nhap vao phai la mot so nguyen trong khoang tu [0-59]", 0, 59));	
	}
	
	public DongHo layKhoangThoiGian( DongHo dh) {
		int a = Math.abs(this.gio*3600+this.phut*60+this.giay - dh.gio*3600+dh.phut*60+dh.giay);
		return new DongHo(a/3600, (a%3600)/60, (a%3600)%60);
	}
	public void inThongTin() {
		
		System.out.println(this.gio +":" + this.phut+":" + this.giay+ laBuoiSang +" la buoi sang");
	}
	
	public static void main(String[] args) {
		DongHo dh = new DongHo();
		dh.layKhoangThoiGian(new DongHo(12, 24, 56)).inThongTin();
	}
	

}
