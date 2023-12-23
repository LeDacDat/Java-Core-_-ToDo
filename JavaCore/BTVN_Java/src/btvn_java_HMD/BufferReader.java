package btvn_java_HMD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Nhap ten:");
			String ten = br.readLine();
			
			System.out.println(ten);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
