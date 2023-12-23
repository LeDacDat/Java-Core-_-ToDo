package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.io.textFileFactory;

public class testFile {
	
	public static void main (String [] args) {
		/*ArrayList<String> dsData = new ArrayList<String>();
		dsData.add("Le Dac Dat");
		dsData.add("Le Anh Dung");
		dsData.add("Do Thi Hue");
		
		boolean kq = textFileFactory.luuFile(dsData, "D:/workspace/TestLuuFile/dulieutest.txt");
		if(kq == true) {
			System.out.println("Luu file Thanh Cong!");	
			
		}
		else {
			System.out.println("Luu file that bai!");
		}*/
		ArrayList<String> dsData = textFileFactory.docFile("D:/workspace/TestLuuFile/dulieutest.txt");
		for(String data : dsData) {
			System.out.println(data);
		}
		
	}

}
