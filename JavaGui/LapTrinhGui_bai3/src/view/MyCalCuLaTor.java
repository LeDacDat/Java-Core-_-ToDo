package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalCuLaTor extends JFrame {
	
	public MyCalCuLaTor() {
		this.setTitle("MyCalculator");
		this.setSize(300,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jtext = new JTextField(50);
		JPanel jhead = new JPanel();
		jhead.setLayout(new BorderLayout());
		jhead.add(jtext, BorderLayout.CENTER);
		
		
		JButton jbtn_0 = new JButton("0");
		JButton jbtn_1 = new JButton("1");
		JButton jbtn_2 = new JButton("2");
		JButton jbtn_3 = new JButton("3");
		JButton jbtn_4 = new JButton("4");
		JButton jbtn_5 = new JButton("5");
		JButton jbtn_6 = new JButton("6");
		JButton jbtn_7 = new JButton("7");
		JButton jbtn_8 = new JButton("8");
		JButton jbtn_9 = new JButton("9");
		
		JButton jbtn_cong = new JButton("+");
		JButton jbtn_tru = new JButton("-");
		JButton jbtn_nhan = new JButton("*");
		JButton jbtn_chia = new JButton("/");
		JButton jbtn_bang = new JButton("=");
		
		JPanel jpan_btn = new JPanel();
		jpan_btn.setLayout(new GridLayout(5,3));
		
		//this.setLayout(new FlowLayout());
		jpan_btn.add(jbtn_0);
		jpan_btn.add(jbtn_1);
		jpan_btn.add(jbtn_2);
		jpan_btn.add(jbtn_3);
		jpan_btn.add(jbtn_4);
		jpan_btn.add(jbtn_5);
		jpan_btn.add(jbtn_6);
		jpan_btn.add(jbtn_7);		
		jpan_btn.add(jbtn_8);
		jpan_btn.add(jbtn_9);
		jpan_btn.add(jbtn_cong);
		jpan_btn.add(jbtn_tru);
		jpan_btn.add(jbtn_nhan);
		jpan_btn.add(jbtn_chia);
		jpan_btn.add(jbtn_bang);
		
		this.setLayout(new BorderLayout());
		this.add(jhead,BorderLayout.NORTH);
		this.add(jpan_btn,BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalCuLaTor();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
