package itforstudent;

public class TryCatch {

	public static void main(String[] args) {
		try{
			int x = 4;
			int y = 0;			
			System.out.println(" x = "+ x);
			System.out.println("y = " + y);
			int z = x/y;
			System.out.println(" z = "+ z);
		}
		catch(ArithmeticException ex) {
			System.out.println("Xin loi ban da nhap sai !");
			ex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Co loi, Kiem tra lai!");
			ex.printStackTrace();
		}		
		System.out.println("Cam on ban da su dung!");
	}

}
