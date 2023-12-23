package javaOOP.model;

import java.util.Scanner;

public class Nguoi {
	
	private int maSo;
	private String hoTen;
	private MyDate ngaySinh = new MyDate();
	private String ho;
	private String dem;
	private String ten;
	
	private Scanner sc = new Scanner(System.in);
	
	public Nguoi() {
		System.out.println("Nhap vao ma so:");
		this.maSo = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao Ho va Ten:");
		this.hoTen = sc.nextLine();
		this.ngaySinh.Nhap();
		
	}


	public Nguoi(int maSo, String hoTen, MyDate ngaySinh, String ho, String dem, String ten) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.ho = ho;
		this.dem = dem;
		this.ten = ten;
	}


	public int getMaSo() {
		return maSo;
	}


	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}


	public MyDate getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(MyDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getHo() {
		String[] arrName = this.hoTen.split("\\s+");
		return arrName[0];
	}


	public void setHo(String ho) {
		this.ho = ho;
	}


	public String getDem() {
		String[] arrName = this.hoTen.split("\\s+");
		return arrName[1];
	}


	public void setDem(String dem) {
		this.dem = dem;
	}


	public String getTen() {
		String[] arrName = this.hoTen.split("\\s+");
		return arrName[2];
	}


	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public String layHoten()
	{
		return this.ho + " " + this.dem+ " " + this.ten;
	}
	
	public static void main(String[] args) {
		//Nguoi ng = new Nguoi();
		//System.out.println("Ho cua nguoi do la:" + ng.getHo());
		
	}

}
