package javaOOP.model;

public class DauSI extends BinhLinh {

	protected double tinhSucManh() {
		return this.trangBi ? this.sucManh *=1.7 : this.sucManh;
	}
}
