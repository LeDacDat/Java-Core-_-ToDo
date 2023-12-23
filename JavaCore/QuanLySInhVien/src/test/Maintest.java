package test;

import java.util.Scanner;

import model.HoSoHocSinh;
import model.QuanLyHoSoHS;

public class Maintest {
	
	 private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		QuanLyHoSoHS dsHoSoHS = new QuanLyHoSoHS();
		HoSoHocSinh hsHs = new HoSoHocSinh();
		HoSoHocSinh hsHs1 = new HoSoHocSinh();
		HoSoHocSinh hsHs2 = new HoSoHocSinh();
		hsHs.Nhap();
		hsHs1.Nhap();
		hsHs2.Nhap();
		dsHoSoHS.addHS(hsHs);
		dsHoSoHS.addHS(hsHs1);
		dsHoSoHS.addHS(hsHs2);
		dsHoSoHS.showInfor();
		System.out.println();
		System.out.println("Nhap ten can tim:");
		String name = sc.nextLine();
		dsHoSoHS.timHocSinh(name);
		System.out.println();
		dsHoSoHS.SapXepTheoTuoi();
		dsHoSoHS.showInfor();

	}

}
