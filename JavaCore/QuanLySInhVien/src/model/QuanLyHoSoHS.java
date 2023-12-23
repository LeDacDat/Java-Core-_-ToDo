package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLyHoSoHS {
	
	private List<HoSoHocSinh> danhSachHS ;
	
	public QuanLyHoSoHS(List<HoSoHocSinh> danhSachHS) {
		this.danhSachHS = danhSachHS;
	}

	public QuanLyHoSoHS() {
		this.danhSachHS = new ArrayList<>();
	}
	
	public void addHS(HoSoHocSinh hoSoHS ) {
	
		this.danhSachHS.add(hoSoHS);
	}
	public void showInfor() {
		
		for (HoSoHocSinh hoSoHocSinh : danhSachHS) {
			hoSoHocSinh.HienThiThongTin();
		}
	}
	public void timHocSinh(String name) {
		for (HoSoHocSinh hoSoHocSinh : danhSachHS) {
			if(hoSoHocSinh.getHs().getName().indexOf(name)>=0) {
				hoSoHocSinh.HienThiThongTin();
			}
		}
	}
	
	public void SapXepTheoTuoi() {
		Collections.sort(this.danhSachHS, new Comparator<HoSoHocSinh>() {

			@Override
			public int compare(HoSoHocSinh hs1, HoSoHocSinh hs2) {
				if(hs1.getHs().getAge()>hs2.getHs().getAge())
					return 1;
				else if(hs1.getHs().getAge()<hs2.getHs().getAge())
					return -1;
				else
					return 0;
			}
		});
	}

}
