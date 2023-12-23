package view;

import javax.swing.JFrame;

public class ViDu {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		// gan ten
		jf.setTitle("Le Dac Dat");
		//gan kich co
		jf.setSize(600,400);
		
		//thoat ra khoi chuong trinh khi dong cua so
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// gan vi tri hien thi
		jf.setLocation(300,300);
		
		// cho phep hien thi
		jf.setVisible(true);

	}

}
