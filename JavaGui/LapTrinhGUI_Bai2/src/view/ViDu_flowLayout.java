package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_flowLayout extends JFrame {
	
	public ViDu_flowLayout() {
		this.setTitle("ViDU_FlowLayOut");
		this.setSize(600,400);
		//can giua cua so chuong trinh
		this.setLocationRelativeTo(null);
		
		//set layout
		FlowLayout flowlayout = new FlowLayout();
		FlowLayout flowlayout_1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowlayout_2 = new FlowLayout(FlowLayout.CENTER,50,50);
		//this.setLayout(flowlayout);
		//this.setLayout(flowlayout_1);
		this.setLayout(flowlayout_2);
		
		JButton  jbtn_1 = new JButton("1");
		JButton  jbtn_2 = new JButton("2");
		JButton  jbtn_3 = new JButton("3");
		
		//add cac thanh phan
		this.add(jbtn_1);
		this.add(jbtn_2);
		this.add(jbtn_3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new ViDu_flowLayout();
	}

}
