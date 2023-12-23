package community.com;

import java.util.Scanner;

public class TestIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mot thang bat ki:");
		/*int thg= sc.nextInt();
		if(thg==1|| thg == 3|| thg == 5|| thg== 7 || thg == 8 || thg == 10 || thg ==12) {
			System.out.println("Thang nay co 31 ngay!");
		}
		else if(thg==4|| thg == 6 || thg == 9 || thg == 11) {
			System.out.println("Thang nay co 30 ngay");
		}
		else if(thg==2){
			System.out.println("Thang nay co 28 hoac 29 ngay");
		}
		else {
			System.out.println("ban nhap thang khong phu hop! Xin nhap lai:");
		}*/
		int t = sc.nextInt();
		switch (t) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang " +t +" co 31 ngay! ");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang" +t+ " co 30 ngay!");
			break;
		case 2:
			System.out.println("Thang" +t+ "Co 28 hoac 29 ngay!");
			break;
			default:
				System.err.println("Ban nhap thang khong phu hop! Moi ban nhap lai!");
		}
		System.out.println("Tinh giai thua so vua nhap!");
		int gt=1;
		int i=1;
		while(i<=t) {
			gt*=i;
			i++;
		}
		System.out.println("Gia tri nhan duoc la "+t +"! = "+gt);
	}

}
