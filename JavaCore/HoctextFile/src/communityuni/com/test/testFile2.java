package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.io.testLuuFile;

public class testFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> dsKH = new ArrayList<String>();
		dsKH.add("Le Dac Dat");
		dsKH.add("Nguyen Thi Huyen Trang");
		dsKH.add("Pham van Minh");
		
		boolean kq = testLuuFile.luuFile(dsKH, "D:/workspace/TestLuuFile/dulieutest2.txt");
		if(kq == true) 
			System.out.println("Luu thanh cong!");
		else 
			System.out.println("Luu that bai!"); 
			
	}

}
