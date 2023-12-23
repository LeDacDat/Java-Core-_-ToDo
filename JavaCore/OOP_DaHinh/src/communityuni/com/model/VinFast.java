package communityuni.com.model;

public class VinFast extends XeHoi {

	@Override
	public double Price() {
		// TODO Auto-generated method stub
		return this.getGiaGoc()+this.getGiaGoc()*this.getVat();
	}
	public VinFast () {
		super();
	}
	public VinFast(int ma, String ten, double giaGoc, double vat) {
		super(ma, ten, giaGoc, vat);
		// TODO Auto-generated constructor stub
	}
	

}
