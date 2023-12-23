package communityuni.com.model;

public class SanPham implements Comparable<SanPham>{
	private int ma;
	private String ten;
	private double gia;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public SanPham(int ma, String ten, double gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
	}
	public SanPham() {
		super();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma + "\t" + this.ten +"\t" + this.gia;
	}
	@Override
	public int compareTo(SanPham o) {
		//Sap xep theo ten
		return this.ten.compareToIgnoreCase(o.ten)*-1;
		//sap xep theo gia
		/*if(this.gia<o.gia)
			return 1;
		if(this.gia > o.gia)
			return -1;
		return 0;*/
	}
}
