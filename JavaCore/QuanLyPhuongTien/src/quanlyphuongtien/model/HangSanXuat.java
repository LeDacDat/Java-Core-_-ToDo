package quanlyphuongtien.model;

public class HangSanXuat {
	
	private String hangSanXuat, tenQuovGia;

	public HangSanXuat(String hangSanXuat, String tenQuovGia) {
		this.hangSanXuat = hangSanXuat;
		this.tenQuovGia = tenQuovGia;
	}
	
	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public String getTenQuovGia() {
		return tenQuovGia;
	}

	public void setTenQuovGia(String tenQuovGia) {
		this.tenQuovGia = tenQuovGia;
	}

	public HangSanXuat() {
		super();
	}

}
