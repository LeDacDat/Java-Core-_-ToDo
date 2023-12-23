package javaOOP.model;

public class NhanVien {
	
	private int maNhanVien;
	private String hoVaten;
	private String phongBan;
	private String diaChi;
	private String soDienThoai;
	
	public NhanVien() {
	}

	public NhanVien(int maNhanVien, String hoVaten, String phongBan, String diaChi, String soDienThoai) {
		this.maNhanVien = maNhanVien;
		this.hoVaten = hoVaten;
		this.phongBan = phongBan;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getHoVaten() {
		return hoVaten;
	}

	public void setHoVaten(String hoVaten) {
		this.hoVaten = hoVaten;
	}

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	public void xuatDanhSach()
	{
		System.out.format("%-10s %15s %15s %15s %15s %n","Ma NV","Ho Va Ten" , "Phong ban","Dia chi","So dien thoai");
		System.out.printf("%-10d %15s %15s %15s %15s %n",this.maNhanVien,this.hoVaten, this.phongBan, this.diaChi, this.soDienThoai);
	}
	
	public static void main(String[] args) {
		NhanVien nv = new NhanVien();
		nv.setMaNhanVien(123);
		nv.setHoVaten("Le Dac Dat");
		nv.setPhongBan("Lap Trinh");
		nv.setDiaChi("Bac Giang");
		nv.setSoDienThoai("0365080477");
		nv.xuatDanhSach();
	}
	

}
