package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {

	private MenuExampleView menuExampleView;
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		
		if(button.equals("Open")) {
			this.menuExampleView.setTextJlabel("Ban da click Open");
		}else if(button.equals("Exit")) {
			this.menuExampleView.setTextJlabel("Ban da click Exit");
		}else if(button.equals("Welcom")) {
			this.menuExampleView.setTextJlabel("Ban da click Welcom");
		}
		else if(button.equals("New")) {
			this.menuExampleView.setTextJlabel("Ban da click New");
		}
		
	}

}
