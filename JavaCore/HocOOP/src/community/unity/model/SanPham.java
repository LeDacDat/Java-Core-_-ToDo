package community.unity.model;

public class SanPham {
	private int ma;
	private String ten;
	private double gia;
	
	public SanPham() {
		
	}
	public SanPham (int ma, String ten, double gia) {
		this.ma=ma;
		this.ten=ten;
		this.gia= gia;
	}
	public void setMa(int ma) {
		this.ma= ma;
	}
	public int getMa() {
		return this.ma ;
	}
	public void setTen(String ten) {
		this.ten= ten;
	}
	public String getTen() {
		return this.ten;
	}
	public void setGia(double gia) {
		this.gia=gia;
	}
	public double getGia() {
		return this.gia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma+"\t"+this.ten+"\t"+this.gia;
	}
	public static double TongTien(SanPham ...sanPhams) {
		double Sum = 0;
		for(SanPham sp : sanPhams) {
			Sum+=sp.gia;
		}
		return Sum;
	}

}
