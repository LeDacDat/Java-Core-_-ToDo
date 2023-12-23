package javaOOP.model;

public class BinhLinh {
	
	protected String ten;
	protected double sucManh = 50;
	protected boolean trangBi = false;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getSucManh() {
		return sucManh;
	}
	public void setSucManh(double sucManh) {
		this.sucManh = sucManh;
	}
	public boolean isTrangBi() {
		return trangBi;
	}
	public void setTrangBi(boolean trangBi) {
		this.trangBi = trangBi;
		this.sucManh = tinhSucManh();
	}
	
	protected double tinhSucManh() {
		return this.trangBi ? this.sucManh *=1.1 : this.sucManh;
	}
	
	public void inThongTin() {
		System.out.println(this.ten + " co suc manh la :" +this.sucManh);
	}
	
	public int chienDau(BinhLinh linh) {
		return this.sucManh < linh.getSucManh() ?-1 : this.sucManh == linh.getSucManh() ?0:1;
		
	}
	

}
