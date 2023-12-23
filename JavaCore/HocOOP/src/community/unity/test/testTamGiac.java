package community.unity.test;

import java.text.DecimalFormat;

import community.unity.model.TamGiac;

public class testTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac tg1 = new TamGiac(20, 12, 25);
		System.out.println("chu vi  = "+ tg1.TinhChuVi());
		
		DecimalFormat dcf = new DecimalFormat("#.###");
		
		System.out.println("Dien tich = "+ dcf.format(tg1.TinhDienTich()));
	}

}
