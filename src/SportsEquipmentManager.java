import java.util.Scanner;

public class SportsEquipmentManager {
	SportsEquipment sportsequipment;
	Scanner input;
	
	SportsEquipmentManager(Scanner input){
		this.input = input;
	}
	
	public void addsportsequipment() {
		sportsequipment = new SportsEquipment();
		System.out.print("Sports Equipment ID : ");
		sportsequipment.id = input.nextInt();
		System.out.print("Sports Equipment name : ");
		sportsequipment.name= input.next();
		String buf = input.nextLine();
		System.out.print("Email address : ");
		sportsequipment.email= input.next();
		System.out.print("Phone number : ");
		sportsequipment.phone= input.next();
	}
	public void deletesportsequipment() {
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		if (sportsequipment == null) {
			System.out.println("the sportsequipment has not been registered.");
			return;
		}
		if (sportsequipment.id == SEId) {
			sportsequipment = null;
			System.out.println("the sportsequipment is deleted.");
		}
	}
	
	public void editsportsequipment() {
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		if (sportsequipment.id == SEId) {
			int num = -11;
			while (num != 5) {
				System.out.println("** SportsEquipment Info Edit Menu **");
				System.out.println("1. Edit Id");
				System.out.println("2. Edit Name");
				System.out.println("3. Edit Email");
				System.out.println("4. Edit Phone");
				System.out.println("5. Exit");
				System.out.println("1. Select one number between 1 - 6 :");
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
				}
			}
		}
		
	}
	public void viewsportsequipment() {
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		if (sportsequipment.id == SEId) {
			sportsequipment.printInfo();
		}
	}
	
}
