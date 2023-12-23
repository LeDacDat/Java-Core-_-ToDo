package Lopabstract.model;

public class HinhTron extends HinhHoc {
	

	public HinhTron(ToaDo toaDo) {
		super(toaDo);
	}

	public HinhTron(ToaDo toaDo, int r) {
		super(toaDo);
		this.r = r;
	}

	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*this.r*this.r;
	}
	

}
