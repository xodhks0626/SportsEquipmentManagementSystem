package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		SportsEquipmentManager sportsequipmentManager = getObject("sportsequipmentmanager.ser");
		if (sportsequipmentManager == null) {
			sportsequipmentManager = new SportsEquipmentManager(input);
		}
		else {
			sportsequipmentManager.setScanner(input);
		}

		WindowFrame frame = new WindowFrame(sportsequipmentManager);
		selectMenu(input, sportsequipmentManager);
		putObject(sportsequipmentManager, "sportsequipmentmanager.ser");
	}

	public static void selectMenu(Scanner input, SportsEquipmentManager sportsequipmentManager) {
		int num = -11;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					sportsequipmentManager.addsportsequipment();
					logger.log("add a sportsequipment");
					break;
				case 2:
					sportsequipmentManager.deletesportsequipment();
					logger.log("delete a sportsequipment");
					break;
				case 3:
					sportsequipmentManager.editsportsequipment();
					logger.log("edit a sportsequipment");
					break;
				case 4:
					sportsequipmentManager.viewsportsequipments();
					logger.log("edit a list of sportsequipment");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("----SportsEquipment Management System Menu----");
		System.out.println("1. Add SportsEquipment");
		System.out.println("2. Delete SportsEquipment");
		System.out.println("3. Edit SportsEquipment");
		System.out.println("4. View SportsEquipments");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5 :");
	}
	
	public static SportsEquipmentManager getObject(String filename) {
		SportsEquipmentManager sportsequipmentManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);//객체에서 가져와야 함
			
			sportsequipmentManager = (SportsEquipmentManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return sportsequipmentManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sportsequipmentManager;
	}
	
	public static void putObject(SportsEquipmentManager sportsequipmentManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);//객체에서 가져와야 함
			
			out.writeObject(sportsequipmentManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
