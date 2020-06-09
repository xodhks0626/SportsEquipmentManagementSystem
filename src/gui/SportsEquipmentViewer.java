package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.SportsEquipmentManager;
import sportsequipment.SportsEquipmentInput;

public class SportsEquipmentViewer extends JPanel {

	WindowFrame frame;
	
	SportsEquipmentManager sportsequipmentManager;
	
	public SportsEquipmentViewer(WindowFrame frame, SportsEquipmentManager sportsequipmentManager) {
		this.frame = frame;
		this.sportsequipmentManager = sportsequipmentManager;
		
		System.out.println("***" + sportsequipmentManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contact Info.");
		
		for (int i = 0; i < sportsequipmentManager.size(); i++) {
			Vector row = new Vector();
			SportsEquipmentInput si = sportsequipmentManager.get(i);
			row.add(si.getId());
			row.add(si.getName());
			row.add(si.getEmail());
			row.add(si.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		
	}

}
