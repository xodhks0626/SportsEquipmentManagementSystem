package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	MenuSelection menuselection;
	SportsEquipmentAdder SEAdder;
	SportsEquipmentViewer SEViewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.SEAdder = new SportsEquipmentAdder(this);
		this.SEViewer = new SportsEquipmentViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
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
