package model;

import lib.NhapDuLieu;

public abstract class Meo {
	
	protected String tenMeo;
	protected int id,tuoiMeo;
	protected boolean gioiTinh;
	protected String tiengKeu;
	
	public String getTenMeo() {
		return tenMeo;
	}
	public void setTenMeo(String tenMeo) {
		this.tenMeo = tenMeo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTuoiMeo() {
		return tuoiMeo;
	}
	public void setTuoiMeo(int tuoiMeo) {
		this.tuoiMeo = tuoiMeo;
	}
	public boolean isGioiTinh() {
		setGioiTinh(gioiTinh);
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		if(this.gioiTinh = true) System.out.println("Meo duc!");
		else System.out.println("Meo cai!");
		this.gioiTinh = gioiTinh;
	}
	public String getTiengKeu() {
		setTiengKeu(tiengKeu);
		return tiengKeu;
	}
	public void setTiengKeu(String tiengKeu) {
		this.tiengKeu = tiengKeu;
	}
	
	public Meo(String tenMeo, int id, int tuoiMeo, boolean gioiTinh, String tiengKeu) {
		this.tenMeo = tenMeo;
		this.id = id;
		this.tuoiMeo = tuoiMeo;
		this.gioiTinh = gioiTinh;
		this.tiengKeu = tiengKeu;
	}
	public Meo() {	
	} 
	
	public void NhapThongTin() {
		this.id = NhapDuLieu.Nhap_soNguyen("Nhap id :", "Id nhap vao phai la mot so nguyen");
		this.tenMeo = NhapDuLieu.Nhap_Chuoi("Nhap vao ten meo", "Ban nen nhap chuoi!");
		this.tuoiMeo = NhapDuLieu.Nhap_soNguyen("Nhap vao tuoi meo:", "Tuoi nhap vao phai la mot so nguyen!");
		System.out.println("Gioi tinh:");
		this.setGioiTinh(gioiTinh);
		
	}
	
	public void showInfo() {
		System.out.println("ID:" + this.id);
		System.out.println("Ten Meo:"+this.tenMeo);
		System.out.println("Tuoi Meo:"+this.tuoiMeo);
		System.out.println("Gioi tinh:"+this.isGioiTinh());
	}
	
	public abstract void hienThiTiengKeu();

}
