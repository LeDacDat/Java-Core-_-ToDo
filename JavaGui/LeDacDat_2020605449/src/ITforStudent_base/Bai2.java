package ITforStudent_base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Cach 1 dung Scanner jdk5
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		System.out.println("Your name is:" + name.toUpperCase());
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter your name:");
			String name = br.readLine();
			
			System.out.println("Your name is :" + name.toUpperCase());
			
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br != null) {
				try {
					br.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
