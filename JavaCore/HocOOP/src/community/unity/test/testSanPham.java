package community.unity.test;

import community.unity.model.SanPham;

public class testSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham(1, "Coca", 8000);
		SanPham sp2 = new SanPham(2, "pessi", 9000);
		SanPham sp3 = new SanPham(3, "redbull", 12000);
		
		double Tong = SanPham.TongTien(sp1,sp2,sp3);
		System.out.println(Tong);

	}

}
