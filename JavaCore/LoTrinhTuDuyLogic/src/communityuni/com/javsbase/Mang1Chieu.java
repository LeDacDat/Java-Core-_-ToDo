package communityuni.com.javsbase;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mang1Chieu {
	
	static int n;
	static int[] Arr;
	
	public static void Nhap() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhap so phan tu n:");
			n =  sc.nextInt();
			
			Arr = new int [n];
			
			for(int i = 0;i<Arr.length;i++) {
				System.out.println("Arr["+i+"] :"); 
				Arr[i] = sc.nextInt();
				
			}
			
		}while(n<=0);
		
	}
	public static void Xuat() {
		
		for(int i = 0;i<Arr.length;i++) {
			System.out.print(Arr[i] +"\t");
		}
		System.out.println();
	}
	
	public static void Timkiem_Nhiphan() {
		
		int cout =0;
		String s = "";
		
		int k;
		System.out.println("Nhap vao so can tim:");
		k = new Scanner(System.in).nextInt();
		
		for(int i = 0; i<Arr.length;i++) {
			if(Arr[i] == k) {
				s +=i+"  ";
				cout++;
			}
		}
		if(s.length()>0) {
			System.out.println( k + " xuat hien " + cout + " lan trong mang:");
			System.out.println( k + " xuat hien lan luot tai cac vi tri :" +s);
			System.out.println();
		}
		else
			System.out.println("Khong tim thay " +k);
		
	}
	
	public static int TimKiem_Dequy(int l, int r,int k)
	{
		
		if(l<r) {
			int mid = (l+r)/2;
			if(Arr[mid] == k) return mid;
			else if(Arr[mid] > k)
				return TimKiem_Dequy(l,mid -1,k);
			else
				return TimKiem_Dequy(mid+1, r,k);
		}
		return -1;
	}
	
	
	public static void ChenPhanTu_ArrList() {
		
		int x,k;
		System.out.println("Nhap vi tri can them vao mang:");
		k = new Scanner(System.in).nextInt();
		System.out.println("Nhap gia tri can them vao mang:");
		x = new Scanner(System.in).nextInt();
		
		List<Integer> newList = new ArrayList<Integer>();
		
		for(int i = 0;i<Arr.length;i++) {
			newList.add(Arr[i]);
		}
			
		newList.add(k, x);
		
		for(int val : newList) {
			System.out.print(val + "\t");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nhap();
		System.out.println("Mang vua nhap la:");
		Xuat();
		//Timkiem_Nhiphan();
		//ChenPhanTu();
		//ChenPhanTu_ArrList();
		int k;
		System.out.println("Nhap so can tim:");
		k = new Scanner(System.in).nextInt();
		int index = TimKiem_Dequy(0, n-1,k);
		
		if(index == -1)
			System.out.println("Khong tim thay "+ k +" trong mang:");
		else
			System.out.println("Tim thay " + k + " o vi tri " + index);
	}

}
