package ITforStudent_base;

import java.util.Scanner;

public class Bai5 {
	
	static int [][]M;
	static int n,m;
	
	public static void NhapMT() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhap so dong:");
			n = sc.nextInt();
			System.out.println("Nhap so cot:");
			m = sc.nextInt();
			
			M = new int [n][m];
			
			for(int i =0;i<n;i++) {
				for(int j = 0;j<m;j++) {
					System.out.print("M["+i+"]["+j+"] :");
					M[i][j] = sc.nextInt();
				}
			}
			
		}while(n<=0 && m<=0);
		
	}
	
	public static void XuatMT() {
		
		for(int i = 0;i<n;i++) {
			for(int j =0;j<m;j++) {
				System.out.print(M[i][j] +"\t");
			}
			System.out.println("\n");
				
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhapMT();
		System.out.println("Ma tran vua nhap la:");
		XuatMT();
	}

}
