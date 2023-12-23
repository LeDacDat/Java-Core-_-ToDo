package javaOOP.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TapChi extends TaiLieu{
	
	private String tenTapChi;
	private int soPhatHanh, thangPhathanh;
	public String getTenTapChi() {
		return tenTapChi;
	}
	public void setTenTapChi(String tenTapChi) {
		this.tenTapChi = tenTapChi;
	}
	public int getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	public int getThangPhathanh() {
		return thangPhathanh;
	}
	public void setThangPhathanh(int thangPhathanh) {
		this.thangPhathanh = thangPhathanh;
	}
	private Scanner sc = new Scanner(System.in);
	public void Nhap() {
		Nhap();
		System.out.println("Nhap ten tap chi:");
		setTenTapChi(sc.nextLine());
		System.out.println("Nhap so phat hanh:");
		setSoBanPhatHanh(sc.nextInt());
		System.out.println("Nhap thang phat hanh:");
		setThangPhathanh(sc.nextInt());
	}
	public void inThongTin() {
		inThongTin();
		System.out.println("Ten Tap chi:" + this.tenTapChi);
		System.out.println("So phat hanh:"+ this.soBanPhatHanh);
		System.out.println("Thang phat hanh:"+ this.thangPhathanh);
	}
	
	public static List<TapChi> timKiem(List<TapChi> lst, String tenCanTim)
	{
		List<TapChi> lstTapChi = new ArrayList<>();
		for (TapChi x : lst) {
			if(x.getTenTapChi().contains(tenCanTim))
				lstTapChi.add(x);		
		}
		return lstTapChi;
	}

}
