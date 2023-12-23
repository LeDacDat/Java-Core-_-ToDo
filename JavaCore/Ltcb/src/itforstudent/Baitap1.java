package itforstudent;

import java.util.Scanner;

public class Baitap1 {
	public static void main(String[] args) {
		System.out.println("Hello Everyone");
		System.out.println("Min cua Integer = "+ Integer.MIN_VALUE);
		System.out.println("Max cua integer = "+ Integer.MAX_VALUE);
		Scanner sc= new Scanner(System.in);
		System.out.println("Moi ban nhap vao mot so nguyen bat ki!");
		int a = sc.nextInt();
		System.out.println("Ban vua nhap so = "+ a);
		System.out.println("Moi ban nhap vao 1 so thuc");
		float f = sc.nextFloat();
		System.out.println("So ban vua nhap la:" + f);
		System.out.println("Moi ban nhap vao 1 chuoi bat ki:");
		String line= new Scanner(System.in).nextLine();
		System.out.println("Ban vua nhap chuoi:"+ line);
	}
}
