package itforstudent;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class testdinhdang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap vao diem toan:");
		float toan = sc.nextFloat();
		System.out.println("Moi ban nhap vao diem ly:");
		float ly = sc .nextFloat();
		System.out.println("moi ban nhap vao diem hoa:");
		float hoa = sc.nextFloat();
		
		float dtb = (toan+ly+hoa)/3;
		
		DecimalFormat dcf = new DecimalFormat("#,###");
		System.out.println("Dtb = " +dcf.format(dtb));
		
		int x=1234567899;
		DecimalFormatSymbols dcfs = new DecimalFormatSymbols(Locale.getDefault());
		dcfs.setDecimalSeparator(',');
		dcf.setDecimalFormatSymbols(dcfs);
		
		System.out.println(dcf.format(x));
	}

}
