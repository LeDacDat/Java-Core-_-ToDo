package view;

import Services.QuanLyMeo;
import lib.NhapDuLieu;
import model.Meo;
import model.MeoAnhLongDai;

public class AppUI {
	
	private QuanLyMeo appQLMeo;
	
	public AppUI() {
		appQLMeo =new QuanLyMeo();
		menu();
	}
	
	private void menu() {
		System.out.println("-------------------MENU---------------------");
		System.out.println("1.Them Meo");
		System.out.println("2.Xoa Meo theo ID");
		System.out.println("3.Hien thi toan bo meo");
		System.out.println("4.Hien thi toan bo meo theo ID");
		System.out.println("5.Thay doi tieng keu!");
		System.out.println("6. Thoat Chuong Trinh!");
		System.out.println("------------------- Nhap Lua Chon -------------------");
		int chon = NhapDuLieu.Nhap_soNguyen("Nhap lua chon cua ban", "Lua chon khong hop le!");
		controller(chon);
	}
	
	private void controller(int chon) {
		switch(chon) {
		case 1:		
//			MeoAnhLongDai m1 = new MeoAnhLongDai();
//			m1.NhapThongTin();
			appQLMeo.themMeo(new MeoAnhLongDai());
			break;
		case 2:
			appQLMeo.xoaMeoTheoID(NhapDuLieu.Nhap_soNguyen("Nhap id:", "Loi!"));
			break;
		case 3:
			appQLMeo.hienThiToanBoMeo();
			break;
		case 4:
			appQLMeo.hienThiMeoTheoID(NhapDuLieu.Nhap_soNguyen("Nhap id:", "Loi!"));
			break;
		case 5:
			appQLMeo.thayDoiTiengKeu(null, NhapDuLieu.Nhap_soNguyen("Nhap id:", "loi!"));
			break;
		case 6:
			System.exit(0);
		}
		menu();
	}

}
