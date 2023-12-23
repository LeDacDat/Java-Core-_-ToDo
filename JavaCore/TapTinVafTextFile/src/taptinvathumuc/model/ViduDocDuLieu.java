package taptinvathumuc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ViduDocDuLieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Cach 1
		File f = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1\\Vidu3.txt");
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while(true) {
				line = br.readLine();
				if(line == null)
					break;
				else
					System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// Cach 2
		File f2 = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1\\Vidu.txt");
		
		try {
			List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for (String line : allText) {
				System.out.println();
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
