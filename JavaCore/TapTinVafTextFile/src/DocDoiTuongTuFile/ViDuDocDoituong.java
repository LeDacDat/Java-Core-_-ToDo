package DocDoiTuongTuFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import LuuDuLieuDoiTuong.SinhVien;

public class ViDuDocDoituong {

	public static void main(String[] args) {
		
		try {
			File file = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1\\file.txt");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			SinhVien sv = (SinhVien) ois.readObject();
			System.out.println(sv);
			ois.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
