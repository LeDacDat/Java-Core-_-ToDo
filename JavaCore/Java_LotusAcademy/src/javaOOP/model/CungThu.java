package javaOOP.model;

public class CungThu extends BinhLinh{
	
	protected double tinhSucManh() {
		return this.trangBi ? this.sucManh *=1.3 : this.sucManh;
	}
}
