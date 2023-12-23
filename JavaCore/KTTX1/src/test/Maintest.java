package test;

import java.util.Scanner;

import model.QuanLiSinhVien;
import model.SInhVien;

public class Maintest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int luachon = 0;
        QuanLiSinhVien dssv = new QuanLiSinhVien();
        do {
            System.out.println("----------------------------------------------");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien Thi");
            System.out.println("3. Tim Kiem");
            System.out.println("4. Thoat");

            System.out.println("Nhap lua chon:");
            luachon = sc.nextInt();
            sc.nextLine();
            
            switch (luachon) {
                case 1:
                    SInhVien sv = new SInhVien();
                    sv.Nhap();
                    dssv.ThemSinhVien(sv);
                    break;
                case 2:
                    dssv.HienThi();
                    break;
                case 3:
                    System.out.println("Nhap vao ma can tim:");
                    String masv = sc.nextLine();
                    dssv.TimSVTheoMa(masv);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luachon != 4);

    }
}
