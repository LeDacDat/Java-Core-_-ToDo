package qlnv.model;

import java.util.Scanner;

public class NhanVien {

    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double phuCap;

    public NhanVien(String maNV, String hoTen, double luongCoBan, double phuCap) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.phuCap = phuCap;
    }

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public double tongLuong() {    
        return this.luongCoBan + this.phuCap;
    }

    public static void xuatTieuDe() {
        System.out.printf("%-15s %-15s %15s %15s %15s %n","Ma NV","Ho va Ten", "Luong co ban" ,"Phu Cap", "Tong luong");
    }

    public void xuatDL() {
        System.out.printf("%-15s %-15s %15.2f %15.2f %15.2f %n", this.maNV, this.hoTen, this.luongCoBan, this.phuCap, this.tongLuong());
    }

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhap ma nhan vien:");
            this.maNV = sc.nextLine();

            System.out.println("Nhap ten nhan vien:");
            this.hoTen = sc.nextLine();

            while (true) {
                try {
                    System.out.println("Nhap vao luong co ban:");
                    this.luongCoBan = sc.nextDouble();
                    System.out.println("Nhap vao phu cap:");
                    this.phuCap = sc.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Luong co ban phai la mot so. Vui long nhap lai.");
                    System.out.println("Phu cap phai la mot so . Vui long nhap lai.");
                    sc.nextLine(); // Đọc bỏ kí tự không phải số khỏi bộ đệm
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
