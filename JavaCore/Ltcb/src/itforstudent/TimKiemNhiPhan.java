package itforstudent;

import java.util.Scanner;

public class TimKiemNhiPhan {

    public static void NhapMang(int M[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < M.length; i++) {
            System.out.print("M [" + i + "] :");
            M[i] = sc.nextInt();
        }
    }

    public static void XuatMang(int M[]) {
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + "\t");
        }
    }

    public static int FindBinary(int M[], int l, int r, int k) {
    	if(l <=r) {
    		int mid = (r+l)/2;
    		if(M[mid] == k) return mid;
    		else if (M[mid]>k )
    			return FindBinary(M, l, mid -1, k);
    		else 
    			return FindBinary(M, mid+1, r, k);
    	}
    	return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so phan tu:");
        int n = sc.nextInt();
        int[] M = new int[n];
        System.out.println("Moi ban nhap cac gia tri cho mang:");
        NhapMang(M);
        System.out.println();
        System.out.println("Mang vua nhap la:");
        XuatMang(M);
        System.out.println();
        
        System.out.println("Nhap so ban muon tim vao day:");
        int k = sc.nextInt();
        int index = FindBinary(M, 0, n -1, k);
        
        if (index == -1) {
        	System.out.println("Khong tim thay "+ k + " trong mang!");
        }
        else {
        	System.out.println("Tim thay " + k + " o vi tri :"+ index);
        }
    
    }

}