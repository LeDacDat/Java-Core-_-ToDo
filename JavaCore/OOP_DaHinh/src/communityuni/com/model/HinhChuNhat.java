package communityuni.com.model;

public class HinhChuNhat extends HinhHoc {

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return (this.getChieuDai()+this.getChieuRong())*2;
	}

	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(int chieuDai, int chieuRong) {
		super(chieuDai, chieuRong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.getChieuDai()*this.getChieuRong();
	}

}
