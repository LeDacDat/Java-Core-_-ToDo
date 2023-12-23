package view;

import javax.swing.JFrame;

public class MyWinDow extends JFrame {
	
	public MyWinDow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showIt() {
		this.setVisible(true);
	}
	
	public void showIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	public void showIt(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width,height);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWinDow m1 = new MyWinDow();
		//m1.showIt();
		//m1.showIt("Le Dac Dat");
		m1.showIt("DavidLee", 600, 400);
	}

}
