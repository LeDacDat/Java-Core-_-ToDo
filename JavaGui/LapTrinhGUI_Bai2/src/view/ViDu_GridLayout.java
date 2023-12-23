package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {
	
	public ViDu_GridLayout() {
		this.setTitle("ViDU_GridLayOut");
		this.setSize(600,400);
		//can giua cua so chuong trinh
		this.setLocationRelativeTo(null);
		
		//set layout
		GridLayout gridlayout = new GridLayout();
		GridLayout gridlayout_1 = new GridLayout(4,4);
		GridLayout gridlayout_2 = new GridLayout(4,4,25,25);
		
		//this.setLayout(gridlayout_1);
		this.setLayout(gridlayout_2);
		
//		JButton  jbtn_1 = new JButton("1");
//		JButton  jbtn_2 = new JButton("2");
//		JButton  jbtn_3 = new JButton("3");
		
		for(int i = 0;i<16;i++) {
			JButton jbtn = new JButton(i + " ");
			this.add(jbtn);
		}
		
		//add cac thanh phan
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ViDu_GridLayout();
	}
}
