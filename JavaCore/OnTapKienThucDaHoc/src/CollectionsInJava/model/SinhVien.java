package CollectionsInJava.model;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private double diemTB;
	
	
	
	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, double diemTB) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}

	public SinhVien() {
		super();
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTB="
				+ diemTB + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemTB, hoVaTen, maSinhVien, namSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSinhVien, other.maSinhVien);
				
	}
	
	
	

}
