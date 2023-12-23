package communityuni.com.test;

import java.util.ArrayList;
import java.util.Collections;

import communityuni.com.model.SanPham;

public class testSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
		dsSP.add(new SanPham(1, "pessi", 25));
		dsSP.add(new SanPham(2, "coca", 15));
		dsSP.add(new SanPham(3, "redbull", 20));
		
		System.out.println("Danh sach san pham:");
		for(SanPham sp : dsSP) {
			System.out.println(sp);
		}
		Collections.sort(dsSP);
		System.out.println("Danh sach san pham sau khi sap xep:");
		for(SanPham sp : dsSP) {
			System.out.println(sp);
		}

	}

}
