package communityuni.com.javsbase;

import java.util.Scanner;

public class giaiPTB2 {
	static double a,b,c;
	
	public static void Nhap() {
		Scanner sc = new Scanner(System.in);
			try {
				
				System.out.println("Nhap vao so a:");
				a = sc.nextDouble();
				System.out.println("Nhap vao so b:");
				b = sc.nextDouble();
				System.out.println("Nhap vao so c:");
				c= sc.nextDouble();
			}
			catch(Exception ex ) {
				ex.printStackTrace();
			}			
		
	}
	
	public static void PTB2() {
		
		if(a == 0) {
			if(b == 0) {
				if(c == 0)
					System.out.println("Phuong trinh vo so nghiem!");
				else
					System.out.println("Phuong trinh vo nghiem");
			}
			else {
				double k = -c/b;
				System.out.println("Phuong trinh la phuong trinh bac nhat co nghiem :"+k );
			}
			
		}
		else {
			double d = b*b - 4*a*c;
			double x1 = (-b + Math.sqrt(d))/(2*a);
			double x2 = (-b - Math.sqrt(d))/(2*a);
			
			System.out.println("Phuong trinh la phuong trinh bac 2 co hai nghiem:");
			System.out.println( "X1 = "+ x1);
			System.out.println("X2 = "+x2);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhap();
		PTB2();
		System.out.println();
	}

}
