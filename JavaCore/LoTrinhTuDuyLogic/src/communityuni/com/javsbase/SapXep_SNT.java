package communityuni.com.javsbase;

import java.util.Arrays;
import java.util.Scanner;

public class SapXep_SNT {
	static int n;
	static int[] Arr;
	
	public static boolean isPrime(int num) {
		
		if(num<2)
			return false;
		for( int i =2 ; i< Math.sqrt(num);i++) {
			if(num %i==0)
				return false;
		}
		
		return true;
		
	}
	
	public static void Nhap() {
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao so phan tu mang:");
			try {
				n= sc.nextInt();	
				Arr = new int[n];
				
				for(int i = 0;i<Arr.length;i++) {
					System.out.println("A["+i+"] : ");
					Arr[i] = sc.nextInt();
				}
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}while(n<=0);
	}
	
	public static void Xuat() {
		
		for(int i = 0;i<Arr.length;i++) {
			System.out.print(Arr[i] +"\t");
		}
		System.out.println();
	}
	
	public static void TimKiemSNT_SapXep() {
		
		int index = 0;
		for(int i = 0;i>Arr.length;i++) {
			if(isPrime(Arr[i])) {
				int temp = Arr[i];
				for(int j =i ;j>index;j--) {
					Arr[j] = Arr[j-1];
				}
				Arr[index] = temp;
				index++;
			}
		}
		
		Arrays.sort(Arr, 0, index);
		
		System.out.println("Mang sau khi sap xep lai la:");		
		for(int i = 0;i<Arr.length;i++) {
			System.out.print(Arr[i] +"\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhap();
		System.out.println("Mang vua nhap:");
		Xuat();
		System.out.println();
		TimKiemSNT_SapXep();
		
	}

}
