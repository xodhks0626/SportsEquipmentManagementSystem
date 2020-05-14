package sportsequipment;

import java.util.Scanner;

import exception.EmailFormatException;

public class LegsSportsEquipment extends CLSportsEquipment {

	protected String GymEmail;
	protected String GymPhone;

	public LegsSportsEquipment(SportsEquipmentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setSportsEquipmentID(input);
		setSportsEquipmentName(input);
		String buf = input.nextLine();
		setSportsEquipmentEmailwithYN(input);
		setSportsEquipmentGymEmailwithYN(input);
		setSportsEquipmentPhone(input);
	}

	public void setSportsEquipmentGymEmailwithYN(Scanner input) {
		char answer = 'x';
		while(answer !='y' && answer != 'Y' && answer !='n' && answer !='N') {
			System.out.print("Do you know Gym's email address that have SportsEquipment? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setSportsEquipmentEmail(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setEmail("");
					break;
				}
				else {
				}
			}
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind" + skind + " name : " + name + " id : " + id + " email : " + email + " phone : " + phone + 
				" Gym's email : " + GymEmail + " Gym's phone : " + GymPhone);
	}
}