import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import sportsequipment.ChestSportsEquipment;
import sportsequipment.CoreSportsEquipment;
import sportsequipment.LegsSportsEquipment;
import sportsequipment.SportsEquipmentInput;
import sportsequipment.SportsEquipmentKind;

public class SportsEquipmentManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4184970770292520085L;
	
	ArrayList<SportsEquipmentInput> sportsequipments = new ArrayList<SportsEquipmentInput>();
	transient Scanner input; //저장하고 싶지 않다.

	SportsEquipmentManager(Scanner input){
		this.input = input;
	}

	public void addsportsequipment() {
		int kind = 0;
		SportsEquipmentInput sportsequipmentInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1. for arms sportsequipment");
				System.out.println("2. for chest sportsequipment");
				System.out.println("3. for Legs sportsequipment");
				System.out.println("Select num 1, 2 or 3 for SportsEquipment Kind : ");
				kind = input.nextInt();
				if(kind == 1) {
					sportsequipmentInput = new CoreSportsEquipment(SportsEquipmentKind.arms);
					sportsequipmentInput.getUserInput(input);
					sportsequipments.add(sportsequipmentInput);
					break;
				}
				else if (kind == 2) {
					sportsequipmentInput = new ChestSportsEquipment(SportsEquipmentKind.chest);
					sportsequipmentInput.getUserInput(input);
					sportsequipments.add(sportsequipmentInput);
					break;
				}
				else if (kind == 3) {
					sportsequipmentInput = new LegsSportsEquipment(SportsEquipmentKind.legs);
					sportsequipmentInput.getUserInput(input);
					sportsequipments.add(sportsequipmentInput);
					break;
				}
				else {
					System.out.println("Select num for SportsEquipment Kind between 1 and 3 : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	public void deletesportsequipment() {
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		int index = findIndex(SEId);
		removefromSportsEquipment(index, SEId);
	}

	public int findIndex(int SEId) {
		int index = -1;
		for(int i = 0; i < sportsequipments.size(); i++) {
			if (sportsequipments.get(i).getId() == SEId) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromSportsEquipment(int index, int SEId) {
		if(index >= 0) {
			sportsequipments.remove(index);
			System.out.println("the sportsequipment " + SEId +  " is deleted");
			return 1;
		}
		else {
			System.out.println("the sportsequipment has not been registered.");
			return -1;
		}
	}

	public void editsportsequipment() {
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		for(int i = 0; i < sportsequipments.size(); i++) {
			SportsEquipmentInput sportsequipment = sportsequipments.get(i);
			if (sportsequipment.getId() == SEId) {
				int num = -11;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						sportsequipment.setSportsEquipmentID(input);
						break;
					case 2:
						sportsequipment.setSportsEquipmentName(input);
						break;
					case 3:
						sportsequipment.setSportsEquipmentEmail(input);
						break;
					case 4:
						sportsequipment.setSportsEquipmentPhone(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewsportsequipments() {
		System.out.println("# of registered sportsequipments : " + sportsequipments.size());
		for(int i = 0; i < sportsequipments.size(); i++) {
			sportsequipments.get(i).printInfo();
		}
	}

	public void showEditMenu() {
		System.out.println("** SportsEquipment Info Edit Menu **");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Email");
		System.out.println("4. Edit Phone");
		System.out.println("5. Exit");
		System.out.println("1. Select one number between 1 - 5 :");
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
}