package model;

import lib.NhapDuLieu;

public class MeoAnhLongDai extends Meo{public MeoAnhLongDai(String tenMeo, int id, int tuoiMeo, boolean gioiTinh, String tiengKeu){
		super(tenMeo,id,tuoiMeo,gioiTinh,tiengKeu);
	}

	
	
	@Override
	public void hienThiTiengKeu() {
		System.out.println("meo meo moe moemmoe!");
		
	}
	
	public MeoAnhLongDai() {
		NhapThongTin();
		
	}
	public void showInfo() {
		System.out.println("ID:" + this.id);
		System.out.println("Ten Meo:"+this.tenMeo);
		System.out.println("Tuoi Meo:"+this.tuoiMeo);
		System.out.println("Gioi tinh:"+this.isGioiTinh());
		System.out.println("Tieng keu:");
		hienThiTiengKeu();
	}
	

}