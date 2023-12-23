package model;

import lib.NhapDuLieu;

public class MeoBaTu extends Meo {

	
	public MeoBaTu(String tenMeo, int id, int tuoiMeo, boolean gioiTinh, String tiengKeu){
		super(tenMeo,id,tuoiMeo,gioiTinh,tiengKeu);
	}
	@Override
	public void hienThiTiengKeu() {
		System.out.println("Meo moe moe moe!");
		
	}
	public MeoBaTu() {
		
	}
	public void showInfo() {
		showInfo();
		System.out.println("Tieng keu:");
		hienThiTiengKeu();
	}

}
