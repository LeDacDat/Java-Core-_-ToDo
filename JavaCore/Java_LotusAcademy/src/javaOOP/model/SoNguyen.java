package javaOOP.model;

import java.util.Scanner;

public class SoNguyen {
	
	private int giaTri;
	private Boolean laChan, laNguyenTo, laDoiXung;
	public int getGiaTri() {
		return giaTri;
	}
	public void setGiaTri(int giaTri) {
		this.giaTri = giaTri;
		this.laChan = kiemTranChan();
		this.laNguyenTo = kiemTraNguyenTo();
		this.laDoiXung = kiemTranDoiXung();
	}
	public Boolean getLaChan() {
		return laChan;
	}

	public Boolean getLaNguyenTo() {
		return laNguyenTo;
	}
	
	public Boolean getLaDoiXung() {
		return laDoiXung;
	}
	private Boolean kiemTranChan()
	{
		if(this.giaTri%2 == 0) return true;
		return false;
	}
	private Boolean kiemTraNguyenTo()
	{
		if(this.giaTri<2) return false;
		for(int i = 2;i<Math.sqrt(this.giaTri);i++)
		{
			if(this.giaTri %i == 0) return false;
		}
		return true;
	}
	
	private Boolean kiemTranDoiXung()
	{
		char[] arr = String.valueOf(this.giaTri).toCharArray();
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] != arr[arr.length -1-i])
				return false;
			
		}
		return true;
	}
	
	private Scanner sc = new Scanner(System.in);
	public SoNguyen()
	{
		setGiaTri(NhapSo("Nhap gia tri:", "Loi! Nhap lai:"));
	}
	public SoNguyen(int n) {
		setGiaTri(n);
	}
	public SoNguyen Cong(SoNguyen n)
	{
		return new SoNguyen(this.giaTri +n.getGiaTri());
	}
	public void inThongTin() {
		System.out.println("So " +this.giaTri+" " + this.laChan + " la so chan , "+this.laNguyenTo +" la nguyen to ," + this.laDoiXung+" la doi xung");
	}
	private int NhapSo(String msgNhap, String msgErr)
	{
		Boolean ok = false;
		int so = 0;
		do {
			try {
				System.out.println(msgNhap);
				so = sc.nextInt();
				ok = true;
				
			}catch(Exception e)
			{
				System.out.println(msgErr);
				sc.nextLine();
			}
			
		}while(!ok);
		return so;
	}
	public static void main(String[] args) {
		SoNguyen soNguyen = new SoNguyen();
		soNguyen.inThongTin();
	}

}
