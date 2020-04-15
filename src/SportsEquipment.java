
public class SportsEquipment {
	String name;
	int id;
	String email;
	String phone;
	static int numSportsEquipmnetRegistered = 0;

	public SportsEquipment() {
		numSportsEquipmnetRegistered++;
	}

	public SportsEquipment(String name, int id) {
		this.name = name;
		this.id = id;
		numSportsEquipmnetRegistered++;
	}

	public SportsEquipment(String name, int id, String mail, String phone) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
		numSportsEquipmnetRegistered++;
	}

	public void printInfo() {
		System.out.println("name : " + name + " id : " + id + " email : " + email + " phone : " + phone);
	}
}