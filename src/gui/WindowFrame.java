package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.SportsEquipmentManager;

public class WindowFrame extends JFrame {
	
	SportsEquipmentManager sportsequipmentManager;
	
	MenuSelection menuselection;
	SportsEquipmentAdder SEAdder;
	SportsEquipmentViewer SEViewer;
	
	
	public WindowFrame(SportsEquipmentManager sportsequipmentManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.sportsequipmentManager = sportsequipmentManager;
		this.menuselection = new MenuSelection(this);
		this.SEAdder = new SportsEquipmentAdder(this);
		this.SEViewer = new SportsEquipmentViewer(this, this.sportsequipmentManager);
		
		this.add(menuselection);
		
		this.setVisible(true); // ÇÊ¼ö
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public SportsEquipmentAdder getSEAdder() {
		return SEAdder;
	}

	public void setSEAdder(SportsEquipmentAdder sEAdder) {
		SEAdder = sEAdder;
	}

	public SportsEquipmentViewer getSEViewer() {
		return SEViewer;
	}

	public void setSEViewer(SportsEquipmentViewer sEViewer) {
		SEViewer = sEViewer;
	}
}
