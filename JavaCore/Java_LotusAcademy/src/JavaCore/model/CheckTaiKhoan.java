package JavaCore.model;

import java.util.Scanner;

public class CheckTaiKhoan {
	
	static boolean CheckTK(String acc, String pass)
	{
		String taikhoan = "nguyendongkhanh@hvitclan.vn";
		String matkhau = "123456";
		
		if(taikhoan.isEmpty() || matkhau.isEmpty())
			return false;
		else
		{
			if(taikhoan.equals(acc) && matkhau.equals(pass) )
				return true;
			else
				return false;								
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String acc, pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tai khoan:");
		acc = sc.nextLine();
		System.out.println("Nhap vao mat khau:");
		pass = sc.nextLine();
		
		if(CheckTK(acc, pass))
			System.out.println("Dang nhap thanh cong");
		else
			System.out.println("Dang nhap that bai");
	}

}
