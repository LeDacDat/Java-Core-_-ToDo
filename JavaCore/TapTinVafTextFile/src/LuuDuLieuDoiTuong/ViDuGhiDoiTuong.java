package LuuDuLieuDoiTuong;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {

	public static void main(String[] args) {
		
		try {
			File file = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1\\file.txt");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			SinhVien sv = new SinhVien("001", "Le Dac Dat", 2002, 10);
			oos.writeObject(sv);
			oos.flush();
			oos.close();
			
		}catch(Exception e) {
			
		}

	}

}
