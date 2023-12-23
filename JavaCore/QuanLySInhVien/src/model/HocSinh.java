package model;

import java.util.Scanner;

public class HocSinh {
	
	private String name;
	private int age;
	private String diaChi;
	private MyDate ngaySinh = new MyDate();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public MyDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(MyDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public HocSinh() {
		
	}
	public HocSinh(String name, int age, String diaChi, MyDate ngaySinh) {
		this.name = name;
		this.age = age;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
	}
	private Scanner sc = new Scanner(System.in);
	public void Nhap() {
		
		try {
			
			System.out.println("Nhap ho va ten:");
			this.name = sc.nextLine();
			System.out.println("Nhap tuoi:");
			this.age = sc .nextInt();
			System.out.println("Nhap dia chi:");
			this.diaChi = sc.nextLine();
			sc.nextLine();
			System.out.println("Nhap ngay sinh:");
			this.ngaySinh.EnterTime();
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	

}
