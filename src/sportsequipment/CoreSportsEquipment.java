package sportsequipment;

import java.util.Scanner;

public class CoreSportsEquipment extends SportsEquipment {

	public CoreSportsEquipment(SportsEquipmentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setSportsEquipmentID(input);
		setSportsEquipmentName(input);
		String buf = input.nextLine();
		setSportsEquipmentEmail(input);
		setSportsEquipmentPhone(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " name : " + name + " id : " + id + " email : " + email + " phone : " + phone);
	}
}
