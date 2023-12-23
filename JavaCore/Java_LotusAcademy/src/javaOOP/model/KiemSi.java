package javaOOP.model;

public class KiemSi extends BinhLinh {

	protected double tinhSucManh() {
		return this.trangBi ? this.sucManh *=1.5 : this.sucManh;
	}
}
