/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Hotels {
    
    private int soNgayTro;
    private String loaiPhongTro;
    private double giaPhong;
    private Person person;

    public Hotels() {
        this.person = new Person();
    }

    public Hotels(int soNgayTro, String loaiPhongTro, double giaPhong, Person person) {
        this.soNgayTro = soNgayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaPhong = giaPhong;
        this.person = person;
    }
    private Scanner sc = new Scanner(System.in);
    
    public void NhapThongTin(){
       try{
           System.out.println("Nhap thong tin khach hang");
           this.person.NhapThongTin();
           System.out.println("Nhap so ngay tro");
           this.soNgayTro = sc.nextInt();
           System.out.println("Nhap loai phong tro:");
           this.loaiPhongTro = sc .nextLine();
           System.out.println("Nhap gia phong:");
           this.giaPhong = sc.nextDouble();
           
       }catch(Exception ex){
           ex.printStackTrace();
       }
             
    }
    public void HienThiThongTin(){
        
        
        System.out.format("%20s%5s%15s%15s%10s%15s%15s%","Ho Va Ten" , 
                "Tuoi","Ngay Sinh","So CMND","So ngay tro","Loai phong tro","Gia phong");
        
        
        System.out.printf("%20s%5d%15s%15s%10d%15s%15f.2",this.person.name,
                this.person.age,this.person.namSinh,this.person.soCMND,
                this.soNgayTro,this.loaiPhongTro,this.giaPhong
        );
        
        
    }
    
}
