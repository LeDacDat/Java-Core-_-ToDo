package javaOOP.model;

public class MonAn {
	private String tenMonAn;
	private double giaBan;
	private String gioiThieu;
	private String nguyenLieuChinh;
	
	public MonAn() {
	}

	public MonAn(String tenMonAn, double giaBan, String gioiThieu, String nguyenLieuChinh) {
		this.tenMonAn = tenMonAn;
		this.giaBan = giaBan;
		this.gioiThieu = gioiThieu;
		this.nguyenLieuChinh = nguyenLieuChinh;
	}

	public String getTenMonAn() {
		return tenMonAn;
	}

	public void setTenMonAn(String tenMonAn) {
		this.tenMonAn = tenMonAn;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public String getGioiThieu() {
		return gioiThieu;
	}

	public void setGioiThieu(String gioiThieu) {
		this.gioiThieu = gioiThieu;
	}

	public String getNguyenLieuChinh() {
		return nguyenLieuChinh;
	}

	public void setNguyenLieuChinh(String nguyenLieuChinh) {
		this.nguyenLieuChinh = nguyenLieuChinh;
	}
	
	public  void  inThongTinMonAn()
	{
		System.out.format("%-15s %-10s %15s  %20s %n" , "Ten Mon An" ,"Gia ban"," Gioi thieu", "Nguyen lieu chinh");
		System.out.printf("%-15s %-10s %15s  %20s %n", this.tenMonAn, this.giaBan, this.gioiThieu, this.nguyenLieuChinh);
	}
	
	public static void main(String[] args) {
		
		MonAn m1 = new MonAn();
		m1.setTenMonAn("Pizaa");
		m1.setGiaBan(20000);
		m1.setGioiThieu("Cau Giay");
		m1.setNguyenLieuChinh("Trung, Ca chua");
		m1.inThongTinMonAn();
		
	}
	

}
