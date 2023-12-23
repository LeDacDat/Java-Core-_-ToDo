package model;

import lib.InputHelper;

public class HocSinh {
	
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public HocSinh() {
		this.id = InputHelper.intHelper("Moi Nhap Id:", "Loi!Nhap sai kieu du lieu");
		this.name =InputHelper.stringHelper("Moi nhap ten:", "Do dai khong phu hop", 5, 50);
		this.age = InputHelper.intHelper("Moi Nhap tuoi:", "Loi! Nhap sai kieu du lieu");
	}
	public void showInfo() {
		System.out.println("ID :" + this.id);
		System.out.println("Ten:" + this.name);
		System.out.println("Tuoi:"+this.age);
	}
	

}
