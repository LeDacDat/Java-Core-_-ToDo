package javaOOP.model;

import java.util.Scanner;

public class SoThuc {
	
	private double giaTri;
	private Boolean laSoDuong;
		

	public SoThuc(double giaTri, Boolean laSoDuong) {
		this.giaTri = giaTri;
		this.laSoDuong = laSoDuong;
	}

	public double getGiaTri() {
		return giaTri;
	}

	public void setGiaTri(double giaTri) {
		this.giaTri = giaTri;
	}

	public Boolean getLaSoDuong() {
		setLaSoDuong();
		return laSoDuong;
	}

	public void setLaSoDuong() {
			if(this.giaTri>0) this.laSoDuong = true;
			else laSoDuong = false;
			
	}
	
	private Scanner sc= new Scanner(System.in);
	
	public SoThuc() {
		System.out.println("Nhap vao so thuc bat ki:");
		this.giaTri = sc.nextDouble();
		
	}
	
	public static double timMax(SoThuc a, SoThuc b, SoThuc c)
	{
		double min = a.getGiaTri();
		if(min >= b.getGiaTri()) min = b.getGiaTri();
		if(min >=c.getGiaTri()) min = c.getGiaTri();
		return min;
	}
	public double tinhCanBacN(int n)
	{
		return Math.pow(this.getGiaTri(), 1./n);
	}
	
	public static void main(String[] args) {
		SoThuc soThuc = new SoThuc();
		System.out.println(soThuc.tinhCanBacN(5));
		SoThuc soThuc1 = new SoThuc();
		SoThuc soThuc2 = new SoThuc();
		System.out.println(SoThuc.timMax(soThuc, soThuc1, soThuc2));
		
	}

}
