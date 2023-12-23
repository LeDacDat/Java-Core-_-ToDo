package javaOOP.model;

import java.util.Random;
import java.util.Scanner;

public class TroXucSac {
	
	private int giaTri_1, giaTri_2;
	private Boolean Thang = false, Thua = false, Hoa = false;
	public int getGiaTri_1() {
		return giaTri_1;
	}
	public void setGiaTri_1(int giaTri_1) {
		this.giaTri_1 = giaTri_1;
	}
	public int getGiaTri_2() {
		return giaTri_2;
	}
	public void setGiaTri_2(int giaTri_2) {
		this.giaTri_2 = giaTri_2;
		if(this.giaTri_2> this.giaTri_1) Thua = true;
		else if(this.giaTri_2==this.giaTri_1) Hoa = true;
		else Thua = true;
	}
	public Boolean getThang() {
		return Thang;
	}
	
	public Boolean getThua() {
		return Thua;
	}
	
	public Boolean getHoa() {
		return Hoa;
	}
	private Scanner sc = new Scanner(System.in);
	private int NhapSo() {
		
		int so = 0;
		Boolean ok = false;
		
		do {
			
			try {
				System.out.println("Nhap vao gia tri muon cuoc:");
				sc.nextInt();
				ok = true;
				
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Loi! Ban phai nhap vao mot so nguyen!");
				sc.nextLine();
			}
			
		}while(!ok);
		return so;	
	}
	public void inThongTin()
	{
		if(this.Thang) System.out.println("You Win!");
		else if(this.Thua) System.out.println("You lose!");
		else System.out.println("Draw!");
	}
	
	public void BatDau() {
		do {
			setGiaTri_1(NhapSo());
			if(getGiaTri_1()<3 || getGiaTri_1()>18)
			{
				System.out.println("ket thuc!");
				return;
			}
			Random rd = new Random();
			int l1 = rd.nextInt(6) +1;
			int l2 = rd.nextInt(6)+1;
			int l3 = rd.nextInt(6)+1;
			System.out.println("Do lan 1:" +l1+" , Do lan 2:"+l2+", Do lan 3:"+l3+", Tong = "+(l1+l2+l3) );
			setGiaTri_2(l1+l2+l3);
			inThongTin();
			this.Thang = this.Hoa = this.Thua = false;
			
		}while(this.giaTri_2>=3 && this.giaTri_2<=18);
	}
	
	public static void main(String[] args) {
		TroXucSac game = new TroXucSac();
		game.BatDau();
	}

}
