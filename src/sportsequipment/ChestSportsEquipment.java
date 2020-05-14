package sportsequipment;

import java.util.Scanner;

public class ChestSportsEquipment extends CLSportsEquipment {

	public ChestSportsEquipment(SportsEquipmentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setSportsEquipmentID(input);
		setSportsEquipmentName(input);
		String buf = input.nextLine();
		setSportsEquipmentEmailwithYN(input);
		setSportsEquipmentPhone(input);
	}
}
