package taptinvathumuc.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaTapTin {
	
	public static void xoaFile(File fx)
	{
		if(fx.isFile())
		{
			//xoa neu la tap tin
			System.out.println("Da xoa:" +fx.getAbsolutePath());//in tap tin da xoa
			fx.delete();
		}
		else if(fx.isDirectory())
		{
			//lay cac file con
			File[] fileCon = fx.listFiles();
			for (File f : fileCon) {
				//xoa cac file con
				xoaFile(f);
			}
			System.out.println("Da xoa:" +fx.getAbsolutePath());//in tap tin da xoa
			//Xoa thu muc chua cac file con
			fx.delete();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f0 = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1\\Vidu3.txt");
		File f01 = new File("D:\\workspace\\TapTinVafTextFile\\Directory_1\\Vidu4.txt");
		
		//
		//f0.deleteOnExit();
		//f01.deleteOnExit();
		//System.out.println(f01.delete());
		//ViDuXoaTapTin.xoaFile(f01);

		// su dung class file  xoa tap tin va thu muc
		//Path p = FileSystems.getDefault().getPath(null, "D:\\workspace\\TapTinVafTextFile\\Directory_1\\Vidu3.txt");
		Path p = f0.toPath();
		try {
			Files.deleteIfExists(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
