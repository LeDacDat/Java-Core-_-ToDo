package JavaCore.model;

public class ToanTu {
	
	public static boolean check(int n)
	
	{
		int tong = 0;
		while(n>0) {
			int r = n%10;
			tong+=r;
			n/=10;		
		}
		if(tong % 3 != 0)
			return false;
		return true;
	}
	
	
	public static void main(String[] args) {	
		 int n = 16;
		 if(check(n))
			 System.out.println(n +" la so chia het cho 3");
		 else
			 System.out.println(n+" khong phai so chia het cho 3");
	}

}
