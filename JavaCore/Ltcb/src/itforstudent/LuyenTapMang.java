package itforstudent;

import java.util.Random;
import java.util.Scanner;

public class LuyenTapMang {
	static int []M;
	public static void NhapMang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap vao so phan tu mang:");
		int n= sc.nextInt();
		M = new int[n];
		Random rd = new Random();
		
		for(int i=0;i<n;i++) {
			M[i] = rd.nextInt(101);
		}
	}
	
	public static void XuatMang() {
		System.out.println("Cac phan tu mang vua tao la:");
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i] + "\t");
		}
	}
	public static void TinhTong() {
		int sum = 0;
		for(int x : M)
			sum+=x;
		
		System.out.println("Tong cac phan tu mang la:" + sum);
	}
	public static void TimSoBatKy() {
		System.out.println("Moi ban nhap vao so can tim:");
		int k= new Scanner(System.in).nextInt();
		
		String s = "";
		int dem = 0;
			for(int i=0;i<M.length;i++) {
				if(M[i]==k) {
					s+= i+";";
					dem++;
				}
			}
			if(dem==0) {
				System.out.println("Khong tim thay " +k +" trong mang");
			}
			else {
				System.out.println("Tim thay "+ k + " trong mang o cac vi tri :"+s);
				System.out.println(k+ " xuat hien "+ dem+ " lan ");
			}
	}
	public static void TimMax() {
		int max = M[0];
		for(int i=0;i<M.length;i++) {
			if(M[i]>max) max = M[i];
		}
		System.out.println("Phan tu lon nhat trong mang la:"+ max);
	}
	
	public static void TimMin() {
		int min = M[0];
		for(int i=0;i<M.length;i++) {
			if(M[i]<min) min = M[i];
		}
		System.out.println("Phan tu nho nhat trong mang la:"+ min);
	}
	public static void TimSNT() {
		System.out.println("Cac so nguyen to:");
		for(int i=0;i<M.length;i++) {
			
			int dem = 0;
			for(int j=i ; j<=M[i];j++) {
				if(M[i]%j==0)
					dem++;
			}
			if(dem==2) {
				System.out.println(M[i] +"\t");
			}
			
		}
	}
	public static void SapXepTang() {
		for(int i=0;i<M.length;i++) {
			int m = i;
			for(int j = i+1;j>i;j++) 
				if(M[j]<M[m])
					m=i;
			int tg = M[m];
			M[m] = M[i];
			M[i] = tg;
		}
		
	}
	public static void SapXepGiam() {
		for(int i=0;i<M.length;i++) {
			int m = i;
			for(int j = i+1;j>i;j++) 
				if(M[j]>M[m])
					m=i;
			int tg = M[m];
			M[m] = M[i];
			M[i] = tg;
		}
		
	}
	
	public static void Menu() {
		 System.out.println("Chao mung ban su dung pham mem cua toi!");
		 System.out.println("1. Nhap Mang");
		 System.out.println("2. XuatMang");
		 System.out.println("3. Tinh Tong");
		 System.out.println("4. Tim so bat ky");
		 System.out.println("5. Tim Max");
		 System.out.println("6. Tim Min");
		 System.out.println("7. Tim So Nguyen To");
		 System.out.println("8. Sap Xep Tang");
		 System.out.println("9. Sap Xep Giam");
		 System.out.println("0. Thoat");
		 System.out.println("Ban muon sung dung dich vu gi?");
		 
		 int chon = new Scanner(System.in).nextInt();
		 
		 switch(chon)
		 {
		 case 1:
			 NhapMang();
			 break;
		 case 2:
			 XuatMang();
			 break;
		 case 3:
			 TinhTong();
			 break;
		 case 4:
			 TimSoBatKy();
			 break;
		 case 5:
			 TimMax();
			 break;
		 case 6:
			 TimMin();
			 break;
		 case 7:
			 TimSNT();
			 break;
		 case 8:
			 SapXepTang();				
			 break;
		 case 9:
			 SapXepGiam();
			
			 break;
		 case 0:
			 System.err.println("Cam on ban da dung phan mem!");
			 System.exit(-1);
		 default:
			 System.out.println("Ban nhap khong dung yeu cau!");
			 break;
				 		 
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Menu();
		}
	}

}
