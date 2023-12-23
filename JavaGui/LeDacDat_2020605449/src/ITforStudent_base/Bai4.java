package ITforStudent_base;

import java.util.Scanner;

public class Bai4 {
	
	static int n,c,d;
	static int A[],B[],C[];
	
	public static void NhapMang() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Nhap vao so phan tu mang :");
			n = sc.nextInt();
			
			A = new int [n];
			for(int i =0;i<n;i++) {
				System.out.print("A["+i+"] :");
				A[i] = sc.nextInt();
			}
			
		}while(n<=0);
	}
	
	public static void XuatMang() {
		for(int i = 0;i<n;i++) {
			System.out.print(A[i] +"\t");
		}
	}
	
	public static void TachMang() {
		
		B = new int [n];
		C = new int [n];
		
		c = d =0;
		
		for(int i = 0;i<n;i++) {
			if(A[i] % 2 ==0) {
				B[c] = A[i];
				c++;
			}
			else {
				C[d] = A[i];
				d++;
			}
		}
		
		System.out.println("Cac phan tu mang chan la:");
		for(int i =0;i<c;i++) {
			System.out.print(B[i] + "\t");
		}
		System.out.println();
		
		System.out.println("Cac phan tu mang le la:");
		for(int i =0;i<d;i++) {
			System.out.print(C[i] + "\t");
		}
		System.out.println();
	}
	
	public static void Tong() {
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum +=A[i];			
		}
		System.out.println("Tong cac phan tu mang :" +sum);
	}
	
	public static void SapXepTang() {
		
		for(int i = 0;i<n;i++) {
			int m = i;
			for(int j = i+1;j<n;j++) {
				if(A[j] <A[m])
					m = j;
			}
			int tg = A[m];
			A[m] = A[i];
			A[i] = tg;
		}
		System.out.println("Mang sau khi sap xep tang la:");
		XuatMang();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NhapMang();
		System.out.println();
		System.out.println("Mang vua nhap la:");
		XuatMang();
		System.out.println();
		Tong();
		System.out.println();
		TachMang();
		System.out.println();
		SapXepTang();
	}

}
