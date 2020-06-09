package sportsequipment;

import java.util.Scanner;

import exception.EmailFormatException;

public interface SportsEquipmentInput {

	public int getId();

	public void setId(int id);
	
	public String getName();

	public void setName(String name);
	
	public String getEmail();

	public void setEmail(String email) throws EmailFormatException;
	
	public String getPhone();

	public void setPhone(String phone);

	public void getUserInput(Scanner input);

	public void printInfo();

	public void setSportsEquipmentID(Scanner input);

	public void setSportsEquipmentName(Scanner input);

	public void setSportsEquipmentEmail(Scanner input);

	public void setSportsEquipmentPhone(Scanner input);
}
