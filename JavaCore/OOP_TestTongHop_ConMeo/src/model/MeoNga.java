package model;

import lib.NhapDuLieu;

public class MeoNga extends Meo{

	public MeoNga(String tenMeo, int id, int tuoiMeo, boolean gioiTinh, String tiengKeu){
		super(tenMeo,id,tuoiMeo,gioiTinh,tiengKeu);
	}
	@Override
	public void hienThiTiengKeu() {
		System.out.println("Urarararararara!");
	}
	
	public MeoNga() {
		
	}
	public void showInfo() {
		showInfo();
		System.out.println("Tieng keu:");
		hienThiTiengKeu();
	}

}
