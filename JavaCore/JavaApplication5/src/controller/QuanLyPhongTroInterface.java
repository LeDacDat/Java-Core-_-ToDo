/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import model.Hotels;

/**
 *
 * @author DELL
 */
public interface QuanLyPhongTroInterface {
    public boolean addCustomer(Hotels hotels);
    public boolean findCustomer(String name);
    public boolean removeCustomer(String name);
    public boolean showListCustomer();
    
}
