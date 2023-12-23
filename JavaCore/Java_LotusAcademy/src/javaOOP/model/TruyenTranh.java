package javaOOP.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruyenTranh extends TaiLieu {
	
	private String tenTruyen;
	private int ngayPhatHanh;
	public String getTenTruyen() {
		return tenTruyen;
	}
	public void setTenTruyen(String tenTruyen) {
		this.tenTruyen = tenTruyen;
	}
	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}
	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	private Scanner sc = new Scanner(System.in);
	public void Nhap() {
		Nhap();
		System.out.println("Nhap ten truyen tranh:");
		setTenTruyen(sc.nextLine());
		System.out.println("Nhap ngay phat hanh:");
		setNgayPhatHanh(sc.nextInt());
	}
	public void inThongTin() {
		inThongTin();
		System.out.println("Ten truyen tranh:" + this.tenTruyen);
		System.out.println("Ngay phat hanh:"+ this.ngayPhatHanh);
	}
	
	public static List<TruyenTranh> timKiem(List<TruyenTranh> lst, String tenCanTim){
		List<TruyenTranh> lstTruyen = new ArrayList<>();
		for (TruyenTranh x : lstTruyen) {
			if(x.getTenTruyen().contains(tenCanTim))
				lstTruyen.add(x);
			
		}
		return lstTruyen;
	}

}
