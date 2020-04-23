import java.util.ArrayList;
import java.util.Scanner;

import sportsequipment.ChestSportsEquipment;
import sportsequipment.LegsSportsEquipment;
import sportsequipment.SportsEquipment;
import sportsequipment.SportsEquipmentKind;

public class SportsEquipmentManager {
	ArrayList<SportsEquipment> sportsequipments = new ArrayList<SportsEquipment>();
	Scanner input;

	SportsEquipmentManager(Scanner input){
		this.input = input;
	}

	public void addsportsequipment() {
		int kind = 0;
		SportsEquipment sportsequipment;
		while (kind != 1 && kind !=2) {
			System.out.println("1. for arms sportsequipment");
			System.out.println("2. for chest sportsequipment");
			System.out.println("3. for Legs sportsequipment");
			System.out.print("Select num 1, 2 or 3 for SportsEquipment Kind : ");
			kind = input.nextInt();
			if(kind == 1) {
				sportsequipment = new SportsEquipment(SportsEquipmentKind.arms);
				sportsequipment.getUserInput(input);
				sportsequipments.add(sportsequipment);
				break;
			}
			else if (kind == 2) {
				sportsequipment = new ChestSportsEquipment(SportsEquipmentKind.chest);
				sportsequipment.getUserInput(input);
				sportsequipments.add(sportsequipment);
				break;
			}
			else if (kind == 3) {
				sportsequipment = new LegsSportsEquipment(SportsEquipmentKind.legs);
				sportsequipment.getUserInput(input);
				sportsequipments.add(sportsequipment);
				break;
			}
			else {
				System.out.print("Select num for SportsEquipment Kind between 1 and 3 : ");
			}
		}
	}
	public void deletesportsequipment() {
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		int index = -1;
		for(int i = 0; i < sportsequipments.size(); i++) {
			if (sportsequipments.get(i).getId() == SEId) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			sportsequipments.remove(index);
			System.out.println("the sportsequipment " + SEId +  " is deleted");
		}
		else {
			System.out.println("the sportsequipment has not been registered.");
			return;
		}
	}

	public void editsportsequipment() {
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		for(int i = 0; i < sportsequipments.size(); i++) {
			SportsEquipment sportsequipment = sportsequipments.get(i);
			if (sportsequipment.getId() == SEId) {
				int num = -11;
				while (num != 5) {
					System.out.println("** SportsEquipment Info Edit Menu **");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Email");
					System.out.println("4. Edit Phone");
					System.out.println("5. Exit");
					System.out.println("1. Select one number between 1 - 5 :");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Sports Equipment ID : ");
						int id = input.nextInt();
						sportsequipment.setId(id);
					}
					else if (num == 2) {
						System.out.print("Sports Equipment name : ");
						String name= input.next();
						sportsequipment.setName(name);
					}
					else if (num == 3) {
						System.out.print("Email address : ");
						String email= input.next();
						sportsequipment.setEmail(email);
					}
					else if (num == 4) {
						System.out.print("Phone number : ");
						String phone= input.next();
						sportsequipment.setPhone(phone);
					}
					else {
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}

	public void viewsportsequipments() {
		//		System.out.print("Sports Equipment ID : ");
		//		int SEId= input.nextInt();
		System.out.println("# of registered sportsequipments : " + sportsequipments.size());
		for(int i = 0; i < sportsequipments.size(); i++) {
			sportsequipments.get(i).printInfo();
		}
	}

}
