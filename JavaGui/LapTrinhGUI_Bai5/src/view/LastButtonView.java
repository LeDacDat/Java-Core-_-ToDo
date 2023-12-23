package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;

public class LastButtonView extends JFrame{
	
	private LastButtonModel lastButtonModel;
	private JLabel JLabel;
	
	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();
		
		this.init();
	}

	private void init() {
		this.setTitle("Last Button in Desktop");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Font font = new Font("Times new roman", Font.BOLD,28);
		ActionListener ac = new LastButtonListener(this);
		JPanel jpanel_center = new JPanel();
		jpanel_center.setLayout(new GridLayout(2,2));
		
		JButton jbtn_1 = new JButton("1");
		jbtn_1.setFont(font);
		jbtn_1.addActionListener(ac);
		JButton jbtn_2 = new JButton("2");
		jbtn_2.setFont(font);
		jbtn_2.addActionListener(ac);
		JButton jbtn_3 = new JButton("3");
		jbtn_3.setFont(font);
		jbtn_3.addActionListener(ac);
		JButton jbtn_4 = new JButton("4");
		jbtn_4.setFont(font);
		jbtn_4.addActionListener(ac);
		jpanel_center.add(jbtn_1);
		jpanel_center.add(jbtn_2);
		jpanel_center.add(jbtn_3);
		jpanel_center.add(jbtn_4);
		
		JPanel jpanel_label = new JPanel();
		JLabel  = new JLabel("--------------");
		JLabel.setFont(font);
		jpanel_label.add(JLabel);
			
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_center, BorderLayout.CENTER);
		this.add(jpanel_label, BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		
	}
	
	public void changTo_1() {
		this.lastButtonModel.setValue_1();
		JLabel.setText("Ban vua nhan nut:" +this.lastButtonModel.getValue());
	}
	public void changTo_2() {
		this.lastButtonModel.setValue_2();
		JLabel.setText("Ban vua nhan nut:" +this.lastButtonModel.getValue());
	}
	public void changTo_3() {
		this.lastButtonModel.setValue_3();
		JLabel.setText("Ban vua nhan nut:" +this.lastButtonModel.getValue());
	}
	public void changTo_4() {
		this.lastButtonModel.setValue_4();
		JLabel.setText("Ban vua nhan nut:" +this.lastButtonModel.getValue());
	}

}
