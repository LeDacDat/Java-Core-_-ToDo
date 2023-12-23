package communityuni.com;

public class SinhVienHAUI {
	
	private int ma;
	private String ten;
	private double diem;
	private XepLoai loai;
	
	public SinhVienHAUI() {
		super();
	}

	public SinhVienHAUI(int ma, String ten, double diem) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diem = diem;
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

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public  XepLoai getLoai() {
		if(this.diem >= 8.5)
			loai = XepLoai.Gioi;
		else if(this.diem >= 7)
			loai = XepLoai.Kha;
		else if(this.diem >= 5)
			loai = XepLoai.Trungbinh;
		else 
			loai = XepLoai.Yeu;	
		return loai;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma +"\t" + this.ten +"\t" +this.diem +"\t" +this.loai;
	}
}
