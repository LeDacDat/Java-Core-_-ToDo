package community.unity.model;

public class SinhVien {
	private int ma;
	private String ten;
	private double diem;
	
	public SinhVien() {
		
	}
	public SinhVien(int ma) {
		this();
		this.ma=ma;
	}
	
	public SinhVien(int ma , String ten) {
		this(ma);
		this.ten = ten;
	}
	public SinhVien(int ma, String ten, double diem) {
		this(ma,ten);
		this.diem = diem;
	}
	public void xetTotNghiep() {
		
		if(diem >= 5) {
			System.out.println("Ban duoc xet tot nghiep!");
		}else {
			System.out.println("Ban chua duoc xet tot nghiep!");
		}
		
	}
	public void xetTotNghiep(double diem) {
		
		System.out.println("Diem cua ban la:" + diem);
	}
	
	public void xetTotNghiep(double diem, int uuTien) {
		if(uuTien == 98) {
			System.out.println("Diem uu tien cua ban la:" + 0.75);
			System.out.println("Tong diem cua ban la:" +(diem + 0.75));
		}
		else {
			System.out.println("Ban khong duoc xet uu tien!");
			System.out.println("Tong diem cua ban la:" + diem);
		}
	}

}
