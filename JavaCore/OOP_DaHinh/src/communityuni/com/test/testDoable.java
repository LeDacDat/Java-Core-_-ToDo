package communityuni.com.test;

import communityuni.com.model.Doable;
import communityuni.com.model.NhanVien;
import communityuni.com.model.SinhVien;

public class testDoable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doable x = new SinhVien();
		x.DoSomeThing();
		x = new NhanVien();
		x.DoSomeThing();
	}

}
