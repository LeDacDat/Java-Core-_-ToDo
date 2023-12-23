package community.unity.test;

import community.unity.model.SinhVien;

public class testSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1 = new SinhVien(1, "Le Dac Dat", 9);
		sv1.xetTotNghiep();
		System.out.println(sv1);
		sv1.xetTotNghiep(4);
		System.out.println(sv1);
		SinhVien sv2 = new SinhVien(2, "Nguyen Thi Huyen Trang");
		sv2.xetTotNghiep(7, 98);
		System.out.println(sv2);

	}

}
