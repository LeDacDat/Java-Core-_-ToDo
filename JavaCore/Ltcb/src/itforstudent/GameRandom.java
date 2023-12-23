package itforstudent;

import java.util.Random;
import java.util.Scanner;

public class GameRandom {

	public static void GameDoanSo () {
		Random rd = new Random();
		int soMay = rd.nextInt(101);
		int soNguoi;
		int solandoan=0;
		System.out.println("May da ra mot so bat ki tu [0...100]:");
		do {
			
			System.out.println("Moi ban doan 1 so bat ki:");
			soNguoi = new Scanner(System.in).nextInt();
			solandoan++;
			System.out.println("Ban doan lan thu "+ solandoan);
			if(soNguoi == soMay) {
				System.out.println("Xin chuc mung ban da doan trung , so may dua ra la:"+soMay);
				break;
			}
			if(soMay>soNguoi) {
				System.out.println("Tiec Qua, Ban doan sai roi, So may lon hon so cua ban!");
			}
			else {
				System.out.println("Tiec Qua, Ban doan sai roi, So may nho hon so cua ban!");
			}
			if(solandoan==7) {
				System.out.println("Game Over!");
				break;
			}
			
		}while(solandoan<=7);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			GameDoanSo();
			System.out.println("Ban co muon choi nua khong (c/k) :");
			String tl = new Scanner(System.in).nextLine();
			if(tl.equalsIgnoreCase("k")) {
				System.out.println("Tam biet!");
				break;				
			}
			//System.out.println("Tam biet!");
		}
		
	}

}
