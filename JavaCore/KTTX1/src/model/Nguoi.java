package model;

public class Nguoi {
	protected String hoTen,gioiTinh,cccd;
	protected int ngaySinh;
	
	
	public Nguoi() {
	}


	public Nguoi(String hoTen, String gioiTinh, String cccd, int ngaySinh) {
		
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.cccd = cccd;
		this.ngaySinh = ngaySinh;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public String getCccd() {
		return cccd;
	}


	public void setCccd(String cccd) {
		this.cccd = cccd;
	}


	public int getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(int ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	
	
	

}
