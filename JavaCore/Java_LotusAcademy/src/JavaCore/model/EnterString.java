package JavaCore.model;

import java.util.Calendar;
import java.util.Scanner;

public class EnterString {
	
	public static void main(String[] args) {
		/*String str = "Baby, I don't feel so good. 6 words you never understood";
		int demChuCai = 0, demChuSo = 0, demKiTu = 0;
		for(int i = 0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i)))
			{
				demChuCai++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				demChuSo++;
			}
			else
				demKiTu++;
		}
		System.out.println("So chu cai la:"+demChuCai);
		System.out.println("So chu so la:" +demChuSo);
		System.out.println("So ki tu la:"+demKiTu);
		*/
		
		String s = "Hello Java ,Hello HvitClan";
		StringBuilder str = new StringBuilder(s);
		int index = str.indexOf("Hello");
		int lastIndex = str.lastIndexOf("Hello");
		str.delete(index, lastIndex);
		//System.out.println(str);
	}	
}
