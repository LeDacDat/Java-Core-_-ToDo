package taptinvathumuc.model;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class TaoTapTinVaThuMuc {
	
	public static void copyAll(File f1, File f2)
	{
		try {
			//copy ban than no
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		if(f1.isDirectory()) {
			// copy cac tap tin va thu muc con
			File[] fileCon = f1.listFiles();
			for (File f : fileCon) {
				File fileNew = new File(f2.getAbsoluteFile()+"/"+f.getName());
				copyAll(f, fileNew);
				
			}
		}
	}

	public static void main(String[] args) {
		//kiem tra ton tai thu muc hay khong
		File folder1 = new File("D:\\workspace\\TapTinVafTextFile");
		System.out.println("Kiem tra ton tai folder1 :" + folder1.exists());
		
		//Tao thu muc
		//Phuong thuc mkdir();
		File folder2 = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1");
		folder2.mkdir();
		// phuong thuc mkdirs() : Tao nhieu thu muc cung mot luc
		
		// Tao tap tin co phan mo rong :.exe , . txt, .doc , .xls;....
		File file1 = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1\\Vidu.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//1.Thay doi tne tap tin hoc thu muc
		File f0 = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1\\Vidu.txt");
		File f1 = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1\\Vidu2.txt");
		// su dung file de thay doi ten
		//f0.renameTo(f1);
		// Su dung Files de thay doi ten
		try {
			Files.move(f0.toPath(), f1.toPath(), StandardCopyOption.REPLACE_EXISTING);
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		// 2 Di chuyen File
		File f2 = new File("D:\\workspace\\TapTinVafTextFile\\Directory_2\\Vidu2.txt");
		try {
			
			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//3. copy file
		File f3 = new File("D:\\workspace\\TapTinVafTextFile\\Directory_2\\Vidu2.txt");
		File f3_copy = new File("D:\\workspace\\TapTinVafTextFile\\Directory_2\\Vidu2_copy.txt");
		
		try {
			
			Files.copy(f3.toPath(), f3_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
			
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}
		// su dung ham de copy file
		TaoTapTinVaThuMuc.copyAll(f1, f2);
 	}

}
