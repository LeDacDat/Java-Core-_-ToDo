package itforstudent;

import java.util.Scanner;

public class ToanTu {
	
	static boolean isPrime(int n)
	{
		if(n<2) return false;
		
		for(int i = 2;i<Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	static void LietKeSNT(int n)
	{
		System.out.println("Cac so nguyen to nho hon "+ n + " la:");
		for(int i = 2;i<n;i++)
		{
			if(isPrime(i))
				System.out.println(i + " ");
		}
	}

	public static void main(String[] args) {

		int n;
		System.out.println("Nhap vao n:");
		n = new Scanner(System.in).nextInt();
		
		LietKeSNT(n);
	}

}
