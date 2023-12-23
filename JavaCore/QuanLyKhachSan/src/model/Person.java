package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
	        
	        
	    }
	    
	    
	    public void NhapThongTin(){
	        
	        try{
	            System.out.println("Nhap ho va ten:");
	            this.name = sc.nextLine();
	            System.out.println("Nhap tuoi:");
	            this.age = sc.nextInt();
	            this.NhapNamSinh();
	            sc.nextLine();
	            System.out.println("Nhap so can cuoc cong dan");
	            this.soCMND = sc.nextLine();
	                    
	            
	        }catch(Exception ex){
	            ex.printStackTrace();
	        }
	    }

		@Override
		public String toString() {
			return "Person [name=" + name + ", soCMND=" + soCMND + ", age=" + age + ", namSinh=" + namSinh + ", sc="
					+ sc + "]";
		}
	    
	    

}
