package JavaMeThod.model;

import java.util.ArrayList;
import java.util.List;

public class testProgram {
	
	public static double lamTronSo(double n) {
		
		double soLamTronXuong = Math.floor(n);
		double soLamtronLen = Math.ceil(n);
		
		if((soLamtronLen - n) < (n - soLamTronXuong))
			return soLamtronLen;
		return soLamTronXuong;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 3.3;
		

		System.out.println("So lam tron la:" + lamTronSo(n));
		
	}

}
