package model;

import java.util.ArrayList;
import java.util.List;

public class QuanLiSinhVien {
	
	private List<SInhVien> danhSachSV;

	
	public QuanLiSinhVien() {
		this.danhSachSV = new ArrayList<>();
	}


	public QuanLiSinhVien(List<SInhVien> danhSachSV) {
		
		this.danhSachSV = danhSachSV;
	}
	
	public void ThemSinhVien(SInhVien sv) {
		this.danhSachSV.add(sv);
	}
	public void HienThi() {
		for (SInhVien sv : danhSachSV) {
			sv.HienThiThongTin();
		}
	}
	public void TimSVTheoMa(String masv) {
		for (SInhVien sv : danhSachSV) {
			if(sv.getMaSinVien().indexOf(masv) >=0)
				sv.HienThiThongTin();
		}
	}
	
	

}
