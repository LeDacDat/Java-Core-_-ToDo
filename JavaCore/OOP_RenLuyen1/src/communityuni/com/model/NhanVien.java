package communityuni.com.model;

public class NhanVien {
	private String Ho;
	private String Ten;
	private int soSP;
	public NhanVien(String ho, String ten, int soSP) {
		super();
		Ho = ho;
		Ten = ten;
		this.soSP = soSP;
		if(soSP < 0)
			this.soSP = 0;
	}
	public NhanVien() {
		super();
	}
	public String getHo() {
		return Ho;
	}
	public void setHo(String ho) {
		Ho = ho;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	public double getLuong() {
		double donGia = 0;
		if(this.soSP<=199)
			donGia = 0.5;
		else if(this.soSP <=399)
			donGia = 0.55;
		else if(this.soSP<=599)
			donGia = 0.6;
		else
			donGia = 0.65;
		return this.soSP*donGia ;
	}
	public boolean LonHon(NhanVien nv2) {
		return this.soSP > nv2.soSP;
	}

}
