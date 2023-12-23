package community.unity.model;

public class TamGiac {
	
	private double CanhA;
	private double CanhB;
	private double CanhC;
	
	public TamGiac() {
		this.CanhA = this.CanhB = this.CanhC =1;
	}
	
	public TamGiac(double CanhA , double CanhB , double CanhC ) {
		this.CanhA = CanhA;
		this.CanhB = CanhB;
		this.CanhC = CanhC;
	}
	
	public void setCanhA(double CanhA) {
		this.CanhA = CanhA;
	}
	public double getCanhA () {
		return this.CanhA;
	}
	public void setCanhB (double CanhB) {
		this.CanhB = CanhB;
	}
	public double getCanhB() {
		return this.CanhB;
	}
	public void setCanhC (double CanhC) {
		this.CanhC = CanhC;
		
	}
	public double getCanhC () {
		return this.CanhC;
				
	}
	
	public double TinhChuVi() {
		return this.CanhA+this.CanhB+this.CanhC;
	}
	private double TinhNuaChuVi() {
		return TinhChuVi()/2;
	}
	
	public double TinhDienTich() {
		
		double p = TinhNuaChuVi();
		double dt = Math.sqrt(p*(p-this.CanhA)*(p-this.CanhB)*(p-this.CanhC));
		return dt;
	}
}
