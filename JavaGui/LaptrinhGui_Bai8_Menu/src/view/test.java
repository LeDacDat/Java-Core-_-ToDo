package view;

import javax.swing.UIManager;

public class test {

	public static void main(String[] args) {

		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MenuExampleView();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
