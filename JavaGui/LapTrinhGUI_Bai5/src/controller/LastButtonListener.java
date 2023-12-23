package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonListener implements ActionListener{
	private LastButtonView lastButtonView;
	
	public LastButtonListener(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String suKien = e.getActionCommand();
		if(suKien.equals("1")) {
			this.lastButtonView.changTo_1();
		}else if(suKien.equals("2")) {
			this.lastButtonView.changTo_2();
		}else if(suKien.equals("3")) {
			this.lastButtonView.changTo_3();
		}
		else if(suKien.equals("4")) {
			this.lastButtonView.changTo_4();
		}
		
	}

}
