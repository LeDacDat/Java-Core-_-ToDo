package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class Counterlistener implements ActionListener{

	private CounterView ctv ;
	
	public Counterlistener( CounterView ctv){
		this.ctv = ctv;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Ban da nhan nut!");
		
		String src = e.getActionCommand();
		
		if(src.equals("UP")) {
			this.ctv.increment();
		}
		else if(src.equals("DOWN")) {
			this.ctv.decrement();
		}
		
	}
	
	

}
