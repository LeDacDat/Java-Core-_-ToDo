package communityuni.com.model;

public class XeHoi implements Comparable<XeHoi> {
	private int ma;
	private String ten;
	private double gia;
	
	

	public XeHoi() {
		super();
	}



	public XeHoi(int ma, String ten, double gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
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



	public double getGia() {
		return gia;
	}



	public void setGia(double gia) {
		this.gia = gia;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma +"\t" + this.ten +"\t" + this.gia;
	}

	@Override
	public int compareTo(XeHoi o) {
		// TODO Auto-generated method stub
		
		return this.ten.compareToIgnoreCase(o.ten)*-1;
		/*if(this.gia<o.gia)
			return -1;
		if(this.gia>o.gia)
			return 1;
		return 0;*/
	}
	

}
