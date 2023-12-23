package communityuni.com.model;

public abstract class XeHoi {
	private int ma;
	private String ten;
	private double giaGoc;
	private double Vat;
	
	public XeHoi() {
		super();
	}

	public XeHoi(int ma, String ten, double giaGoc, double vat) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.giaGoc = giaGoc;
		Vat = vat;
	}

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

	public double getGiaGoc() {
		return giaGoc;
	}

	public void setGiaGoc(double giaGoc) {
		this.giaGoc = giaGoc;
	}

	public double getVat() {
		return Vat;
	}

	public void setVat(double vat) {
		Vat = vat;
	}

	public abstract double Price();
}
