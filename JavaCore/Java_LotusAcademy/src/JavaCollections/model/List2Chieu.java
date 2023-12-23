package JavaCollections.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List2Chieu {

	
	static List<Integer> NhapListDS()
	
	{
		List<Integer> lst = new ArrayList<>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu trong danh sach:");
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++)
		{
			lst.add(sc.nextInt());
		}
		return lst;
	}
	
	public static void NhapDS(List<List<Integer>> lst)
	{
		List<List<Integer>> newlst = new ArrayList<List<Integer>>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong danh sach");
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++)
		{
			newlst.add(NhapListDS());
		}
		System.out.println(newlst);
	}
	
	public static void main(String[] args) {
		
		List<List<Integer>> lst = new ArrayList<List<Integer>>();
		NhapDS(lst);
		
	}

}
