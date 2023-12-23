package taptinvathumuc.model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ViDuGhiFile {

	public static void main(String[] args) {
		
		// ghi du lieu
		PrintWriter pw;
		try {
			pw = new PrintWriter("D:\\workspace\\TapTinVafTextFile\\Directory_1\\Vidu3.txt","UTF-8");
			pw.println("Minh la Le Dac Dat");
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
