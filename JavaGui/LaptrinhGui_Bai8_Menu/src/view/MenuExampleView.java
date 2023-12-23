package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleController;
import controller.MenuExampleMouseListener;

public class MenuExampleView  extends JFrame{
	
	private JLabel Jlabel;
	public JPopupMenu jPopupMenu;
	

	public MenuExampleView() {
		this.setTitle("MENU");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		MenuExampleController ac = new MenuExampleController(this);
		//Tao thanh menu
		JMenuBar jMenuBar = new JMenuBar();
		//Tao menu cha
		JMenu Jmenu_file = new JMenu("File");
		JMenu Jmenu_help = new JMenu("Help");
		//Tao cac menu con
		JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
		jMenuItem_open.addActionListener(ac);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
		
		jMenuItem_exit.addActionListener(ac);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem jMenuItem_new = new JMenuItem("New",KeyEvent.VK_N);
		jMenuItem_new.addActionListener(ac);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.ALT_DOWN_MASK));
		//Them menu con 1
		Jmenu_file.add(jMenuItem_new);
		Jmenu_file.add(jMenuItem_open);
		Jmenu_file.addSeparator();
		Jmenu_file.add(jMenuItem_exit);
		
		//them menu con 2
		JMenuItem jmenu_welcom = new JMenuItem("Welcom");
		jmenu_welcom.addActionListener(ac);
		Jmenu_help.add(jmenu_welcom);
		
		jMenuBar.add(Jmenu_file);
		jMenuBar.add(Jmenu_help);
		
		
		//Menu chuot phai JpopupMenu
		 jPopupMenu = new JPopupMenu();
		 JMenu jMenuPopupFont = new JMenu("Font");
		 JMenuItem jMenuItemType = new JMenuItem("Type");
		 JMenuItem jMenuItemSize = new JMenuItem("Size");
		 JMenuItem jMenuItemCut = new JMenuItem("Cut");
		 JMenuItem jMenuItemCopy= new JMenuItem("Copy");
		 JMenuItem jMenuItemPaste = new JMenuItem("Paste");
		 
		 
		 jMenuPopupFont.add(jMenuItemType);
		 jMenuPopupFont.add(jMenuItemSize);
		 
		 
		 jPopupMenu.add(jMenuPopupFont);
		 jPopupMenu.add(jMenuItemCut);
		 jPopupMenu.add(jMenuItemCopy);
		 jPopupMenu.add(jMenuItemPaste);
		 this.add(jPopupMenu);
		 
		 //tao su kien click chuot phai
		 MenuExampleMouseListener ac1 = new MenuExampleMouseListener(this);
		 this.addMouseListener(ac1);	 
		
		//Them thanh menu vao chuong trinh
		this.setJMenuBar(jMenuBar);
		
		//Tao ToolBar (Thanh cong cu)
		JToolBar jToolBar = new JToolBar();
		JButton jbtn_undo = new JButton("Undo");
		jbtn_undo.addActionListener(ac);
		jbtn_undo.setToolTipText("DKMMMM");
		JButton jbtn_redo = new JButton("Redo");
		jbtn_redo.addActionListener(ac);
		JButton jbtn_copy = new JButton("Copy");
		jbtn_copy.addActionListener(ac);
		JButton jbtn_Cut = new JButton("Cut");
		jbtn_Cut.addActionListener(ac);
		JButton jbtn_paste = new JButton("Paste");
		jbtn_paste.addActionListener(ac);
		
		jToolBar.add(jbtn_undo);
		jToolBar.add(jbtn_redo);
		jToolBar.add(jbtn_copy);
		jToolBar.add(jbtn_Cut);
		jToolBar.add(jbtn_paste);
		
		this.add(jToolBar , BorderLayout.NORTH);
		
		//Tao label hien thi
		Font font = new Font("Arial",Font.BOLD,40);
		 Jlabel = new JLabel();
		 
		  
		this.add(Jlabel,BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public void setTextJlabel(String s) {
		this.Jlabel.setText(s);
	}

}
