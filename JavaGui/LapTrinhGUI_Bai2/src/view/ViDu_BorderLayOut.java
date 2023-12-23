package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_BorderLayOut extends JFrame{
	
	public ViDu_BorderLayOut() {
		this.setTitle("ViDu_BorderLayOut");
		this.setSize(600,400);
		//can giua cua so chuong trinh
		this.setLocationRelativeTo(null);
		//set layout
		
		BorderLayout borderlayout_1 = new BorderLayout();
		BorderLayout borderlayout_2 = new BorderLayout(15,15);
		
		//this.setLayout(borderlayout_1);
		this.setLayout(borderlayout_2);
		
		JButton  jbtn_1 = new JButton("1");
		JButton  jbtn_2 = new JButton("2");
		JButton  jbtn_3 = new JButton("3");
		JButton  jbtn_4 = new JButton("4");	
		JButton  jbtn_5 = new JButton("5");
		
		
		
		//add cac thanh phan
		this.add(jbtn_1, BorderLayout.NORTH);
		this.add(jbtn_2,BorderLayout.SOUTH);
		this.add(jbtn_3,BorderLayout.EAST);
		this.add(jbtn_4,BorderLayout.WEST);
		this.add(jbtn_5,BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ViDu_BorderLayOut();
	}

}
