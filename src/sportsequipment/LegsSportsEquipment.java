package sportsequipment;

import java.util.Scanner;

public class LegsSportsEquipment extends SportsEquipment {
	
	protected String GymEmail;
	protected String GymPhone;

	public String getGymEmail() {
		return GymEmail;
	}

	public void setGymEmail(String gymEmail) {
		GymEmail = gymEmail;
	}

	public String getGymPhone() {
		return GymPhone;
	}

	public void setGymPhone(String gymPhone) {
		GymPhone = gymPhone;
	}
	
	public LegsSportsEquipment(SportsEquipmentKind kind) {
		this.kind = kind;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Sports Equipment ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Sports Equipment name : ");
		String name= input.next();
		this.setName(name);
		
		String buf = input.nextLine();
		
		char answer = 'x';
		while(answer !='y' && answer != 'Y' && answer !='n' && answer !='N') {
			System.out.print("Do you have an email address? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Email address : ");
				String email= input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			}
			else {
			}
		}
		System.out.print("Phone number : ");
		String phone= input.next();
		this.setPhone(phone);

		answer = 'x';
		while(answer !='y' && answer != 'Y' && answer !='n' && answer !='N') {
			System.out.print("Do you know Gym's email address that have SportsEquipment? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Gym's email address : ");
				String GymEmail= input.next();
				this.setGymEmail(GymEmail);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			}
			else {
			}
		}
		
		System.out.print("Gym's Phone number : ");
		String GymPhone= input.next();
		this.setGymPhone(GymPhone);
	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind){
		case arms:
			skind = "Arms";
			break;
		case chest:
			skind = "Chest";
			break;
		case core:
			skind = "Core";
			break;
		case legs:
			skind = "Legs";
			break;
		default:
		}
		System.out.println("kind" + skind + " name : " + name + " id : " + id + " email : " + email + " phone : " + phone + 
				" Gym's email : " + GymEmail + " Gym's phone : " + GymPhone);
	}
}
