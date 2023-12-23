package JavaCollections.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class testTongHop {
	
	// Ham viet hoa den vi tri N cua list
	public static void VietHoaDenN(List<String> lst)
	{
		for(int i = 0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).toUpperCase());
		}
	}
	// Ham sap xep giam dan theo do dai chuoi
	public static void sapXepDanhSach(List<String> lst) {
		
		Collections.sort(lst, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				if(s1.length() < s2.length())
					return 1;
				else if(s1.length() > s2.length())
					return -1;
				
				return 0;
			}
			
		});
			
	}
	//ham in danh sach 
	public static void inDanhSach(List<String> lst) {
		
		for (String str : lst) {
			System.out.print(str + " , ");
		}
	}
	

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		
		lst.add("Le Dac Dat");
		lst.add("Le Anh Dung");
		lst.add("Nguyen Thi Huyen Trang");
		System.out.println("Viet hoa den vi tri n trong list:");
		VietHoaDenN(lst);
		sapXepDanhSach(lst);
		System.out.println("list sau khi sap xep giam dan theo do dai chuoi la:");
		System.out.println(lst);
		System.out.println("In danh sach cac chuoi :");
		inDanhSach(lst);
		
	}

}
