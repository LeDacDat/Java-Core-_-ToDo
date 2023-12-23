package javaOOP.test;

import java.util.ArrayList;
import java.util.List;

import javaOOP.model.MyDate;
import javaOOP.model.Sach2;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sach2> lst = new ArrayList<>();
		Sach2 sach = new Sach2();
		sach.NhapThongTin();
		lst.add(sach);
		for (Sach2 x : lst) {
			System.out.println(x.getTenSach());
		}	
		Sach2.timKiem(lst, "Lap Trinh").forEach(x->{System.out.println(x.getTenSach());});
		
	}

}
