package ITforStudent_base;

import java.util.Scanner;

public class Bai6 {
	
	static int n1,m1,n2,m2;
	
	static int A[][],B[][];
	
	public static void Nhap() {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Nhap so dong cho ma tran A:");
			n1 = sc.nextInt();
			System.out.println("Nhap so cot cho ma tran A:");
			m1 = sc.nextInt();
			
			System.out.println("Nhap so dong cho ma tran B:");
			n2 = sc.nextInt();
			System.out.println("Nhap so cot cho ma tran B:");
			m2 = sc.nextInt();
			
			
			A = new int [n1][m1];
			B = new int [n2][m2];
			System.out.println("Nhap ma tran A:");
			for(int i = 0;i<n1;i++) {
				for(int j =0;j<m1;j++) {
					System.out.println("A["+i+"]["+j+"] :");
					A[i][j] = sc.nextInt();
				}
			}
			System.out.println();
			System.out.println("Nhap ma tran B:");
			for(int i = 0;i<n2;i++) {
				for(int j =0;j<m2;j++) {
					System.out.println("B["+i+"]["+j+"] :");
					B[i][j] = sc.nextInt();
				}
			}
			
		}while(n1<=0 && n2<=0 && m1<=0 && m2<0);
	}
	
	public static void Xuat() {
		
		System.out.println("Ma tran A:");
		for(int i = 0;i<n1;i++) {
			for(int j = 0;j<m1;j++) {
				System.out.print(A[i][j] +"\t");
			}
			System.out.println("\n");
		}
		System.out.println();
		System.out.println("Ma tran B:");
		for(int i = 0;i<n2;i++) {
			for(int j = 0;j<m2;j++) {
				System.out.print(B[i][j] +"\t");
			}
			System.out.println("\n");
		}
	}
	
	public static void Tich_Hai_MT() {
		Scanner sc = new Scanner(System.in);
		int [][] C = new int [m1][n2];
		if(m1 !=n2) {
			System.out.println("De nhan 2 ma tran thi so dong phai bang so cot!");
			System.out.println("Nhap lai so cot ma tran A:");
			m1 = sc.nextInt();
			System.out.println("Nhap lai so dong ma tran B");
			n2 = sc.nextInt();
			
		}
		else {
			for(int  i= 0;i<m1;i++) {
				for(int j = 0;j<n2;j++) {
					C[i][j] =0;
					for(int k = 0;k<n1;k++) {
						C[i][j] += A[i][k] *B[k][j];
					}
				}
			}
		}
		System.out.println();
		System.out.println("Ma tran tich C:");
		for(int i = 0;i<m1;i++) {
			for(int j = 0;j<n2;j++) {
				System.out.print(C[i][j] +"\t");
			}
			System.out.println("\n");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhap();
		Xuat();
		Tich_Hai_MT();
		
	}

}
