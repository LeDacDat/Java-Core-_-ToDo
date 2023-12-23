package Lopabstract.model;

public abstract class HinhHoc {
	
	private ToaDo toaDo;

	public HinhHoc(ToaDo toaDo) {
		this.toaDo = toaDo;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	
	public abstract double tinhDienTich();

}
