package TuDienAnhViet.model;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	
	private Map<String , String> dulieu = new TreeMap<>();
	
	public String themTu(String tuKhoa, String yNghia)
	{
		return this.dulieu.put(tuKhoa, yNghia);
	}
	
	public String xoaTu(String tuKhoa)
	{
		return this.dulieu.remove(tuKhoa);
	}
	
	public String traTu(String tuKhoa)
	{
		String yNghia = this.dulieu.get(tuKhoa);
		return yNghia;
	}
	public void inTuKhoa()
	{
		Set<String> tapHopTuKhoa = this.dulieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	
	public int laySoLuong()
	{
		return this.dulieu.size();
	}
	
	public void xoaTatCa()
	{
		this.dulieu.clear();
	}
	
	public static void main(String[] args) {
		TuDien tuDien = new TuDien();
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);			
		do {
			System.out.println("-------------------------------------------");
			System.out.println("MENU:");
			System.out.println("Tra tu dien anh viet:");
			System.out.println("1. Them Tu");
			System.out.println("2. Xoa Tu");
			System.out.println("3. Tim y nghia cua tu khoa");
			System.out.println("4. In Danh Sach tu khoa");
			System.out.println("5. In so luong tu");
			System.out.println("6. Xoa tat ca");
			System.out.println("0. Thoat Chuong Trinh");
			
			luaChon = sc.nextInt();
			sc.nextLine();
			
			if(luaChon == 1)
			{
				System.out.println("Nhap vao tu khoa:");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhap vao y nghia:");
				String yNghia = sc.nextLine();
				tuDien.themTu(tuKhoa, yNghia);
			}
			else if(luaChon == 2 || luaChon == 3)
				
			{
				System.out.println("Nhap vao tu khoa:");
				String tuKhoa = sc.nextLine();
				if(luaChon == 2)
				{
					tuDien.xoaTu(tuKhoa);
				}
				else {
					System.out.println("Y nghia la:" + tuDien.traTu(tuKhoa));
				}
			}
			else if(luaChon == 4)
			{
				tuDien.inTuKhoa();
			}
			else if(luaChon == 5)
			{
				System.out.println("So luong tu khoa la:" + tuDien.laySoLuong());
			}
			else if(luaChon == 6)
			{
				tuDien.xoaTatCa();
			}
			
		}while(luaChon!=0);
	}

}
