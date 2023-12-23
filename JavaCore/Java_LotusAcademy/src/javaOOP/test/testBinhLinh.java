package javaOOP.test;

import javaOOP.model.BinhLinh;
import javaOOP.model.CungThu;
import javaOOP.model.DauSI;
import javaOOP.model.KiemSi;

public class testBinhLinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinhLinh linh_1 = new BinhLinh();
		linh_1.setTen("Linh 1");
		linh_1.setTrangBi(false);
		
		BinhLinh linh_2 = new BinhLinh();
		linh_2.setTen("Linh 2");
		linh_2.setTrangBi(true);

		CungThu cung = new CungThu();
		cung.setTen("cung");
		cung.setTrangBi(true);
		
		DauSI dausi = new DauSI();
		dausi.setTen("Dau si");
		dausi.setTrangBi(true);
		
		KiemSi kiem = new KiemSi();
		kiem.setTen("Kiem");
		kiem.setTrangBi(true);
		
		linh_1.inThongTin();
		linh_2.inThongTin();
		cung.inThongTin();
		dausi.inThongTin();
		kiem.inThongTin();
		System.out.println(dausi.chienDau(cung));
				
	}

}
