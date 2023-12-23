package javaOOP.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sach2  extends TaiLieu{
	
	private String tenSach, tenTacGia;
	private int soTrang;
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	private Scanner sc= new Scanner(System.in);
	
	public void NhapThongTin() {
		Nhap();
		System.out.println("Nhap ten sach, ten tac gia, so trang:");
		setTenSach(sc.nextLine());
		setTenTacGia(sc.nextLine());
		setSoTrang(sc.nextInt());
	}
	public void inThongTin() {
		
		inThongTin();
		System.out.println("Ten Sach:" + this.tenSach);
		System.out.println("Ten tac gia:" + this.tenTacGia);
		System.out.println("So trang:" + this.soTrang);
	}
	
	public static List<Sach2> timKiem(List<Sach2> lst, String tenCanTim){
		List<Sach2> lstSach = new ArrayList<>();
		for (Sach2 x : lst) {
			if(x.getTenSach().contains(tenCanTim))
				lstSach.add(x);		
		}
		return lstSach;
	}

}
