package qlnv.model;

import java.util.ArrayList;
import java.util.Iterator;

public class DanhSachNhanVien {
	
	private ArrayList<NhanVien> danhSachNv;
	

	public DanhSachNhanVien() {
		this.danhSachNv = new ArrayList<NhanVien>();
	}


	public ArrayList<NhanVien> getDanhSachNv() {
		return danhSachNv;
	}


	public void setDanhSachNv(ArrayList<NhanVien> danhSachNv) {
		this.danhSachNv = danhSachNv;
	}


	public DanhSachNhanVien(ArrayList<NhanVien> danhSachNv) {
		this.danhSachNv = danhSachNv;
	}
	
	public void themDanhSachNhanVien(NhanVien nv) {
		nv.NhapThongTin();
		this.danhSachNv.add(nv);
	}
	public void xuatDanhDachNhanVien() {
		NhanVien nv = new NhanVien();
		nv.xuatTieuDe();
		for (NhanVien nhanVien : danhSachNv) {
			nhanVien.xuatDL();
		}
	}
}
