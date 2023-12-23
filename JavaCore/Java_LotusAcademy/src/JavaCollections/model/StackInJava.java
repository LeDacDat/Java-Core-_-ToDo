package JavaCollections.model;

import java.util.Scanner;
import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<String> stackChuoi = new Stack<>();
		
		//var.push() - dua gia tri vao stack
		//var.pop() - lay gia tri ra , xoa khoi stack;
		// var.peek() - lay gia tri ra nhung khong xoa khoi stack
		// var.clear() - xoa tat ca
		//var.contains() - kiem tra ton tai
		//var.size() - lay ra do dai chuoi
		
		//vi du dao nguoc chuoi
		
		System.out.println("Nhap vao 1 chuoi:");
		String str = sc.nextLine();
		
		for(int i = 0;i<str.length();i++)
		{
			stackChuoi.push(str.charAt(i) +"");
		}
		
		System.out.println("Chuoi dao nguoc la:");
		for(int i = 0;i<str.length();i++)
		{
			System.out.print(stackChuoi.pop());
		}
		System.out.println();
		Stack<Integer> nhiPhan = new Stack<>();
		System.out.println("Nhap vao so nguyen:");
		int n = sc.nextInt();
		
		while(n >0)
		{
			int soDu = n%2;
			nhiPhan.push(soDu);
			n/=2;
		}
		
		int m = nhiPhan.size();
		System.out.println( n+ " chuyen dang nhi phan la:");
		for(int i = 0;i<m;i++) {
			System.out.print(nhiPhan.pop());
		}
	}

}
