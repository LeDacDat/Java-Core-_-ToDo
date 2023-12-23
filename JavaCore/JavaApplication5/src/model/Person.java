/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Person {
    
    protected String name,soCMND;
    protected int age;
    protected String namSinh;

    public Person() {
    }

    public Person(String name, String soCMND, int age, String namSinh) {
        this.name = name;
        this.soCMND = soCMND;
        this.age = age;
        this.namSinh = namSinh;
    }
    private Scanner sc = new Scanner(System.in);
    
    
    public void NhapNamSinh(){
        
        System.out.println("Nhap nam sinh [dd/MM/yyyy]:");
        this.namSinh = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            Date bir = sdf.parse(this.namSinh);
            System.out.println(bir);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public void NhapThongTin(){
        
        try{
            System.out.println("Nhap ho va ten:");
            this.name = sc.nextLine();
            System.out.println("Nhap tuoi:");
            this.age = sc.nextInt();
            this.NhapNamSinh();
            System.out.println("Nhap so can cuoc cong dan");
            this.soCMND = sc.nextLine();
                    
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
}
