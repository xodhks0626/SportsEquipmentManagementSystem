import java.util.ArrayList;
import java.util.Scanner;

public class SportsEquipmentManager {
	ArrayList<SportsEquipment> sportsequipments = new ArrayList<SportsEquipment>();
	Scanner input;

	SportsEquipmentManager(Scanner input){
		this.input = input;
	}

	public void addsportsequipment() {
		SportsEquipment sportsequipment = new SportsEquipment();
		System.out.print("Sports Equipment ID : ");
		sportsequipment.id = input.nextInt();
		System.out.print("Sports Equipment name : ");
		sportsequipment.name= input.next();
		String buf = input.nextLine();
		System.out.print("Email address : ");
		sportsequipment.email= input.next();
		System.out.print("Phone number : ");
		sportsequipment.phone= input.next();
		sportsequipments.add(sportsequipment);
	}
	public void deletesportsequipment() {
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		int index = -1;
		for(int i = 0; i < sportsequipments.size(); i++) {
			if (sportsequipments.get(i).id == SEId) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			sportsequipments.remove(index);
			SportsEquipment.numSportsEquipmnetRegistered--;
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
			if (sportsequipment.id == SEId) {
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
						sportsequipment.id = input.nextInt();
					}
					else if (num == 2) {
						System.out.print("Sports Equipment name : ");
						sportsequipment.name= input.next();
					}
					else if (num == 3) {
						System.out.print("Email address : ");
						sportsequipment.email= input.next();
					}
					else if (num == 4) {
						System.out.print("Phone number : ");
						sportsequipment.phone= input.next();
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
		System.out.println("# of registered sportsequipments : " + SportsEquipment.numSportsEquipmnetRegistered);
		for(int i = 0; i < sportsequipments.size(); i++) {
			sportsequipments.get(i).printInfo();
		}
	}

}
