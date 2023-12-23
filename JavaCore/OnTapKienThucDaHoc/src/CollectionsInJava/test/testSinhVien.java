package CollectionsInJava.test;

import java.util.Scanner;

import CollectionsInJava.model.DanhSachSinhVien;
import CollectionsInJava.model.SinhVien;

public class testSinhVien {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		do {
			
			System.out.println("-------------------MENU--------------------");
			System.out.println("--------------Nhap lua chon ----------------");
			System.out.println("1. Them sinh vien");
			System.out.println("2. In danh sach sinh vien");
			System.out.println("3. Kiem tra danh sach co rong hay khong?");
			System.out.println("4. Lay ra so luong sinh vien trong danhs sach");
			System.out.println("5. Lam rong danh sach sinh vien");
			System.out.println("6. Kiem tra sinh vien co ton tai hay khong");
			System.out.println("7. Xoa mot sinh vien ra khoi danh sach");
			System.out.println("8. Tim kiem tat ca sinh vien the ten");
			System.out.println("9. Xuat ra tat ca sinh vien co diem tu cao den thap");
			System.out.println("0. Thoat khoi chuong trinh");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1)
			{
				System.out.println("Nhap ma sinh vien:");
				String maSv = sc.nextLine();
				System.out.println("Nhap Ho va Ten sinh vien:");
				String hoVaTen = sc.nextLine();
				System.out.println("Nhap nam sinh:");
				int namSinh = sc.nextInt();
				System.out.println("Nhap diem trung binh:");
				float diemTB = sc.nextFloat();
				SinhVien sv = new SinhVien(maSv, hoVaTen, namSinh, diemTB);
				dssv.themSinhVien(sv);
				
			}else if(luaChon ==2)
			{
				//2. In danh sach sinh vien
				dssv.inDanhSachSinhVien();
				
			}else if(luaChon ==3)
			{
				System.out.println("Danh sach rong" +dssv.kiemTraDanhSachRong());
			}
			else if(luaChon ==4)
			{
				System.out.println("So luong hien tai:" +dssv.laySoLuongSinhVien());
			}
			else if(luaChon ==5)
			{
				dssv.lamRongDanhSach();
			}
			else if(luaChon ==6)
			{
				System.out.println("Nhap vao ma sinh vien:");
				String maSV = sc.nextLine();
				SinhVien sv = new SinhVien(maSV);
				System.out.println("Kiem tra sinh vien co trong danh sach:" +dssv.kiemTraTonTai(sv));
				
			}
			else if(luaChon ==7)
			{
				System.out.println("Nhap vao ma sinh vien:");
				String maSV = sc.nextLine();
				SinhVien sv = new SinhVien(maSV);
				System.out.println("Xoa sinh vien trong danh sach:" + dssv.xoaSinhVien(sv));
			}
			else if(luaChon ==8)
			{
				System.out.println("Nhap vao ten sinh vien:");
				String ten = sc.nextLine();
				System.out.println("ket qua tim kiem:");
				dssv.timSinhVien(ten);
			}
			else if(luaChon ==9)
			{
				dssv.sapXepSinhVienTheoDiem();
				dssv.inDanhSachSinhVien();
			}		
		}while(luaChon !=0);

	}

}
