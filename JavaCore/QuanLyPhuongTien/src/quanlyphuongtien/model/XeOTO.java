package quanlyphuongtien.model;

public class XeOTO extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public XeOTO(String tenLoaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super(tenLoaiPhuongTien, hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	

}
