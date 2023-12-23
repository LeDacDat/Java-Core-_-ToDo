/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Hotels;

/**
 *
 * @author DELL
 */
public class QuanLyCustomers implements QuanLyPhongTroInterface{

    
    private List<Hotels> hotels;

    public QuanLyCustomers() {
        this.hotels = new ArrayList<Hotels>();
    }
    
    @Override
    public boolean addCustomer(Hotels h1) {
        h1.NhapThongTin();
        this.hotels.add(h1);
        System.out.println("Them thanh cong!");            
        return true;
        
    }

    @Override
    public boolean findCustomer(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean removeCustomer(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean showListCustomer() {
       if(this.hotels.size() == 0){
           System.out.println("Khong co du lieu");
           return false;
       }
        for (Hotels hotel : hotels) {
            hotel.HienThiThongTin();
        }
        return true;
    }
    
}
