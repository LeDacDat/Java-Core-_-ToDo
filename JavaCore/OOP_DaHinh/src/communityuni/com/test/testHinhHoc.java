package communityuni.com.test;

import communityuni.com.model.HinhChuNhat;
import communityuni.com.model.HinhHoc;
import communityuni.com.model.HinhVuong;

public class testHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h;
		h= new HinhChuNhat(4, 5);
		System.out.println("Chu vi hcn la:"+ h.tinhChuVi());
		System.out.println("Dien tich hcn:"+ h.tinhDienTich());
		System.out.println("----------------------------------");
		HinhHoc h1 = new HinhVuong(5);
		System.out.println("Chu vi hinh vuong:"+ h1.tinhChuVi());
		System.out.println("Dien tich hinh vuong :"+ h1.tinhDienTich());
		
	}

}
