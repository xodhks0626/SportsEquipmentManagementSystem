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
			System.out.println("the sportsequipment to be edited is : " + SEId);
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
