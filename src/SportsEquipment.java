
public class SportsEquipment {
	String name;
	int id;
	String email;
	String phone;

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
	public void printInfo() {
		System.out.println("name : " + name + " id : " + " email : " + email + " phone : " + phone);
	}
}