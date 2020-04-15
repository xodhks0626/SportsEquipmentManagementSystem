package sportsequipment;

import java.util.Scanner;

public class SportsEquipment {
	protected SportsEquipmentKind kind = SportsEquipmentKind.arms;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	

	public SportsEquipment() {
	}

	public SportsEquipment(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public SportsEquipment(String name, int id, String mail, String phone) {
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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void printInfo() {
		System.out.println("name : " + name + " id : " + id + " email : " + email + " phone : " + phone);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Sports Equipment ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Sports Equipment name : ");
		String name= input.next();
		this.setName(name);
		
		String buf = input.nextLine();
		
		System.out.print("Email address : ");
		String email= input.next();
		this.setEmail(email);
		
		System.out.print("Phone number : ");
		String phone= input.next();
		this.setPhone(phone);
	}
}