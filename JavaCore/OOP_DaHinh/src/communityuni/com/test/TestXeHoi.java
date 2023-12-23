package communityuni.com.test;

import communityuni.com.model.VinFast;
import communityuni.com.model.XeHoi;

public class TestXeHoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XeHoi xh = new VinFast(1, "Luxury A7", 5000, 0.2);
		System.out.println("gia cua chiec xe nay la:"+xh.Price());
	}

}
