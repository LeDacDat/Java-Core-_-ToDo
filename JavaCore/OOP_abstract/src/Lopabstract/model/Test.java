package Lopabstract.model;

public class Test {

	public static void main(String[] args) {
		
		ToaDo td1  = new ToaDo(2, 3);
		
		HinhHoc h1 = new HinhTron(td1, 10);
		
		System.out.println("Dien tich hinh tron:" + h1.tinhDienTich());
		
	}

}
