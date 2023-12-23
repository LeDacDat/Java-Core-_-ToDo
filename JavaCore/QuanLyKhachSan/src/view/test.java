package view;

import java.util.List;

import model.Hotels;
import model.QuanLyPhongTro;

public class test {

	public static void main(String[] args) {
		
		QuanLyPhongTro qlpt = new QuanLyPhongTro();
		Hotels h1 = new Hotels();
		qlpt.addCustomers(h1);
		qlpt.showInfor();

	}

}
