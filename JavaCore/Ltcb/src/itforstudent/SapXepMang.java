package itforstudent;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SapXepMang {

	   public static void NhapMang(int M[]) {
	        //Scanner sc = new Scanner(System.in);
		   Random rd = new Random();
	        for (int i = 0; i < M.length; i++) {
	           // System.out.print("M [" + i + "] :");
	            M[i] = rd.nextInt(101);
	        }
	    }
	   
	   public static void XuatMang(int M[]) {
	        for (int i = 0; i < M.length; i++) {
	            System.out.print(M[i] + "\t");
	        }
	    }
	   public static void SapXepNoiBot(int M[]) {
		   
		   for(int i=0;i<M.length;i++) {
			   
			   for(int j = M.length -1;j>i;j--) {
				   if(M[j]<M[j-1]) {
					   int tg = M[j];
					   M[j] = M[j-1];
					   M[j-1] = tg;
				   }
			   }
		   }
	   }
	   public static void SapXepLuaChon(int M[]) {
		   
		for(int i=0;i<M.length;i++) {
			int m = i;
			for(int j=i+1;j<M.length;j++)
				if(M[j] < M[m])
					m = j;
			int tg = M[m];
			M[m]=M[i];
			M[i]=tg;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so phan tu:");
        int n = sc.nextInt();
        int[] M = new int[n];
       // System.out.println("Moi ban nhap cac gia tri cho mang:");
        NhapMang(M);
        System.out.println();
        System.out.println("Mang ngau nhien dc tao ra la:");
        XuatMang(M);
        System.out.println();
		//SapXepNoiBot(M);
       // SapXepLuaChon(M);
        Arrays.sort(M);
		System.out.println("Mang sau khi sap xep la:");
		XuatMang(M);
	}

}
