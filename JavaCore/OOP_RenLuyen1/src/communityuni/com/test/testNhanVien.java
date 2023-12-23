package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.NhanVien;

public class testNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1,nv2;
		System.out.println("Moi ban nhap thong tin cua nhan vien 1:");
		System.out.println("Nhap Ho:");
		String ho1 = new Scanner(System.in).nextLine();
		System.out.println("Nhap Ten:");
		String ten1 = new Scanner(System.in).nextLine();
		System.out.println("Nhap so san pham:");
		int sp1 = new Scanner(System.in).nextInt();
		nv1 = new NhanVien(ho1, ten1, sp1);
		
		System.out.println("------------------------------");
		System.out.println("Moi ban nhap thong tin cua nhan vien 2:");
		System.out.println("Nhap Ho:");
		String ho2 = new Scanner(System.in).nextLine();
		System.out.println("Nhap Ten:");
		String ten2 = new Scanner(System.in).nextLine();
		System.out.println("Nhap so san pham:");
		int sp2 = new Scanner(System.in).nextInt();
		nv2 = new NhanVien(ho2, ten2, sp2);
		
		
		System.out.println("Luong cua nhan vien 1:" + nv1.getLuong());
		System.out.println("Luong cua nhan vien 2:" + nv2.getLuong());
		
		if(nv1.LonHon(nv2)) {
			System.out.println("Nhan vien " +nv1.getHo() +" " + nv1.getTen() + " co so san pham nhieu hon! ");
			System.out.println("Cu the la nhieu hon:"+(nv1.getSoSP()-nv2.getSoSP()));
		}
		else {
			System.out.println("Nhan vien" +nv2.getHo() +" " + nv2.getTen() + " co so san pham nhieu hon! ");
			System.out.println("Cu the la nhieu hon:"+(nv2.getSoSP()-nv1.getSoSP()));
		}
	}

}
