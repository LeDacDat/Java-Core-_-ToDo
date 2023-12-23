package communityuni.com.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class testLuuFile {
	
	public static boolean luuFile(ArrayList<String>dsKH, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(String data : dsKH) {
				bw.write(data);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			
			return true;
		}
		catch(Exception ex ) {
			ex.printStackTrace();
		}
		return false;
	}

}
