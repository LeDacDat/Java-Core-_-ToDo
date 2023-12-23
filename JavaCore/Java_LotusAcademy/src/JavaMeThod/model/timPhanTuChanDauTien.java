package JavaMeThod.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class timPhanTuChanDauTien {
	
	static int a[],n;
	
	public static void xuatMang(int a[]) {
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i] +"\t");
		}
		System.out.println();
	}
	
	public static void NhapMang(int a[])
	{
		
		for(int i =0;i<a.length;i++)			
		{
			System.out.println("a["+i+"] :");
			a[i] = new Scanner(System.in).nextInt();
		}
	}
	
	public static void sapXepTang_QuickSort(int a[],int left, int right) {
		
		if(left <= right) {
			int mid = (left + right)/2;
			int pivot = a[mid];
			int i = left, j = right;
			
			while(i<= left && j>= right) {
				
				while(a[i] <pivot) i++;
				while(a[j] > pivot) j++;
				
				if(i<= left && j>= right)
				{
					int tg = i;
					i = j;
					j= tg;
				}		
			}
			sapXepTang_QuickSort(a, left, mid-1);
			sapXepTang_QuickSort(a, mid +1, right);
		}
		
	}
	public static void sapXepTang(int a[])
	{
		/*for(int i = 1;i<a.length;i++) {
			int key = a[i];
			int j = i-1;
			
			while(j>=0 && a[j] >key)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j +1] = a[i];					
		}*/
		for(int i = 0;i<a.length-1;i++)
		{
			int m = i;
			for(int j = i+1;j<a.length;j++)
			{
				if(a[m] > a[j])
					m = j;
			}
			int tg = a[i];
			a[i] = a[m];
			a[m] = tg;
		}
	}
	
	public static int tinhTong(int a[]) {
		
		int sum = 0;
		
		for (int i : a) {
			sum+=i;
		}
		
		return sum;
		
	}
	
	public static void daoNguocDanhSach(List<String> lst) {
		Collections.reverse(lst);
		System.out.println(lst);
		
	}
	
	public static int demKiTuKhoangTrang(String str) {
		return str.split(" ").length-1;
	}
	
	public static void ranDomNumber() {
		
		Random rd = new Random();
		int x = rd.nextInt(101);
		System.out.println("So ngau nhien tu 1-100 la:"+x);
	}
	
	public static void Nhap(int n) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Nhap vao so nguyen n:");
			n = sc.nextInt();
			
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static int findEvenFirst(int a[]) {
		int index = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i] %2 == 0)
			{
				index = i;
				break;
			}
		}
		return index;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Vi tri chan dau tien trong mang la:"+findEvenFirst(a));
		
		String str = " Le Dac Dat";
		System.out.println("So ki tu khoang trang chuoi la:" + demKiTuKhoangTrang(str));*/
		
		/*List<String> lst = new ArrayList<>();
		lst.add("Le Dac Dat");
		lst.add("Ahihi");
		lst.add("Ahuhu");
		System.out.println(lst);
		System.out.println("Chuoi dao nguoc la:");
		daoNguocDanhSach(lst);*/
		System.out.println("Nhap vao so phan tu mang:");
		n = new Scanner(System.in).nextInt();
		
		a = new int [n];
		NhapMang(a);
		xuatMang(a);
		//sapXepTang(a);
		sapXepTang_QuickSort(a, 0, n);
		System.out.println("Mang sau khi sap xep la:");
		xuatMang(a);
	}

	
}
