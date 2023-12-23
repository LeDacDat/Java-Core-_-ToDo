package javaOOP.model;

import java.io.IOException;
import java.util.Scanner;

public class PhanSo {
	
	private int tuSo;
	private int mauSo;
	
	
	
	public PhanSo() {
	}
	public int getTuSo() {
		return tuSo;
	}
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	public int getMauSo() {
		return mauSo;
	}
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	
	
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	public PhanSo Nhapps() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tu so:");
		this.tuSo = sc.nextInt();
		do {
			System.out.println("Nhap vao mau so:");
			this.mauSo = sc.nextInt();
			
			if(this.mauSo == 0) {
				System.out.println("Nhap lai!");
			}
			
		}while(this.mauSo == 0);
		
		PhanSo ps = new PhanSo(tuSo, mauSo);
		return ps;
	}
	
	static int UCLN(int a, int b) {
		while(a!=b) {
			if(a>b) a-=b;
			else b -=a;			
		}
		return a;
	}
	public PhanSo toiGianPhanSo(PhanSo ps) {
		PhanSo phanSo = new PhanSo();
		phanSo.tuSo = ps.tuSo/UCLN(Math.abs(tuSo), Math.abs(mauSo));
		phanSo.mauSo = ps.mauSo/UCLN(Math.abs(tuSo), Math.abs(mauSo));
		return phanSo;
	}
	
	public static PhanSo Cong(PhanSo ps1, PhanSo ps2) {
		PhanSo phanSo = new PhanSo();
		phanSo.tuSo = ps1.tuSo*ps2.mauSo + ps2.tuSo*ps1.mauSo;
		phanSo.mauSo = ps1.mauSo*ps2.mauSo;
		if(phanSo.tuSo!=0)
			phanSo.toiGianPhanSo(phanSo);
		return phanSo;
	}
	
	public static PhanSo Tru(PhanSo ps1, PhanSo ps2) {
		PhanSo phanSo = new PhanSo();
		phanSo.tuSo = ps1.tuSo*ps2.mauSo - ps2.tuSo*ps1.mauSo;
		phanSo.mauSo = ps1.mauSo*ps2.mauSo;
		if(phanSo.tuSo!=0)
			phanSo.toiGianPhanSo(phanSo);
		return phanSo;
	}
	
	public static void hienThiPS(PhanSo ps) {
		if(ps.mauSo == 1 || ps.tuSo == 0)
			System.out.println(ps.tuSo);
		else
			System.out.println(ps.tuSo +"/" + ps.mauSo);
	}
	
	public static void main(String[] args) throws IOException {
		PhanSo ps1 = new PhanSo();
		PhanSo ps2 = new PhanSo();
		ps1.Nhapps();
		if(ps1.tuSo!=0)
		{
			ps1.toiGianPhanSo(ps1);
			hienThiPS(ps1);
		}
		ps2.Nhapps();
		if(ps2.tuSo!=0)
		{
			ps2.toiGianPhanSo(ps2);
			hienThiPS(ps2);
		}
		System.out.println("Tong 2 phan so la:");
		hienThiPS(Cong(ps1, ps2));
		System.out.println("Hieu 2 phan so la:");
		hienThiPS(Tru(ps1, ps2));
	}

}
