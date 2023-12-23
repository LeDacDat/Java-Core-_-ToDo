package communityuni.com.test;

import java.util.ArrayList;
import java.util.Collections;

import communityuni.com.model.XeHoi;

public class testXeHoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<XeHoi> dsXH = new ArrayList<XeHoi>();
		dsXH.add(new XeHoi(1, "Vinfast", 123));
		dsXH.add(new XeHoi(2, "Toyota", 120));
		dsXH.add(new XeHoi(3, "Audi", 456));
		
		System.out.println("Danh sach cac loai xe :");
		for(XeHoi xh : dsXH) {
			System.out.println(xh);
		}
		Collections.sort(dsXH);
		System.out.println("Danh sach sau khi sap xep la:");
		for(XeHoi xh : dsXH) {
			System.out.println(xh);
		}
	}

}
