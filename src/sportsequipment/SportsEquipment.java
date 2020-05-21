package sportsequipment;

import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;

public abstract class SportsEquipment implements SportsEquipmentInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2356715405296704137L;
	
	protected SportsEquipmentKind kind = SportsEquipmentKind.arms;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;


	public SportsEquipment() {
	}

	public SportsEquipment(SportsEquipmentKind kind) {
		this.kind = kind;
	}

	public SportsEquipment(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public SportsEquipment(String name, int id, String email, String phone) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}

	public SportsEquipment(SportsEquipmentKind kind, String name, int id, String email, String phone) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}

	public SportsEquipmentKind getKind() {
		return kind;
	}

	public void setKind(SportsEquipmentKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@") && !email.equals("")) { 
			throw new EmailFormatException();
		}

		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public abstract void printInfo();

	public void setSportsEquipmentID(Scanner input) {
		System.out.print("Sports Equipment ID : ");
		int id = input.nextInt();
		this.setId(id);
	}

	public void setSportsEquipmentName(Scanner input) {
		System.out.print("Sports Equipment name : ");
		String name= input.next();
		this.setName(name);
	}

	public void setSportsEquipmentEmail(Scanner input) {
		String email = "";
		while (!email.contains("@")) {
			System.out.print("Email address : ");
			email= input.next();
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}

	public void setSportsEquipmentPhone(Scanner input) {
		System.out.print("Phone number : ");
		String phone= input.next();
		this.setPhone(phone);
	}

	public String getKindString() {
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
		return skind;
	}
}