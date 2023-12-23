package model;

import lib.NhapDuLieu;

public class MeoAnhLongNgan extends Meo {

	public MeoAnhLongNgan(String tenMeo, int id, int tuoiMeo, boolean gioiTinh, String tiengKeu){
		super(tenMeo,id,tuoiMeo,gioiTinh,tiengKeu);
	}
	@Override
	public void hienThiTiengKeu() {
		System.out.println("Meo meo meomoe!");
	
	}
	public MeoAnhLongNgan() {
		
	}
	public void showInfo() {
		showInfo();
		System.out.println("Tieng keu:");
		hienThiTiengKeu();
	}

}
