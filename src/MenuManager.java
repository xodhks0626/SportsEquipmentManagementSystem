import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		SportsEquipmentManager sportsequipmentManager = new SportsEquipmentManager(input);

		selectMenu(input, sportsequipmentManager);
	}

	public static void selectMenu(Scanner input, SportsEquipmentManager sportsequipmentManager) {
		int num = -11;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					sportsequipmentManager.addsportsequipment();
					break;
				case 2:
					sportsequipmentManager.deletesportsequipment();
					break;
				case 3:
					sportsequipmentManager.editsportsequipment();
					break;
				case 4:
					sportsequipmentManager.viewsportsequipments();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("----SportsEquipment Management System Menu----");
		System.out.println("1. Add SportsEquipment");
		System.out.println("2. Delete SportsEquipment");
		System.out.println("3. Edit SportsEquipment");
		System.out.println("4. View SportsEquipments");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5 :");
	}
}
