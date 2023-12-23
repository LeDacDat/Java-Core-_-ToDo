package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.model.SinhVien;

public class testSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
		dsSV.add(new SinhVien(1, "Dat", 9));
		dsSV.add(new SinhVien(2, "Hue", 7));
		dsSV.add(new SinhVien(3, "Trang", 5));
		dsSV.add(new SinhVien(4, "Khanh", 2));
		
		System.out.println("Danh sach sinh vien:");
		for(SinhVien sv : dsSV) {
			System.out.println(sv);
		}

	}

}
