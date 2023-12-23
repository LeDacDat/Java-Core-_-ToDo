package model;

import java.util.ArrayList;

public class QuanLyPhongTro {
	
	private ArrayList<Hotels> danhSachCustomer;

	public QuanLyPhongTro() {
		this.danhSachCustomer = new ArrayList<>();
	}

	public QuanLyPhongTro(ArrayList<Hotels> danhSachCustomer) {
		
		this.danhSachCustomer = danhSachCustomer;
	}
	
	public void addCustomers(Hotels ht) {
		ht.NhapThongTin();
		this.danhSachCustomer.add(ht);
	}
	public void showInfor() {
			for (Hotels hotels : danhSachCustomer) {
				System.out.println(hotels);
				
			}
	}
	
	

}
