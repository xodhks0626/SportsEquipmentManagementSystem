import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		SportsEquipmentManager sportsequipmentManager = new SportsEquipmentManager(input);

		int num = -11;
		while (num != 5) {
			System.out.println("----SportsEquipment Management System Menu----");
			System.out.println("1. Add SportsEquipment");
			System.out.println("2. Delete SportsEquipment");
			System.out.println("3. Edit SportsEquipment");
			System.out.println("4. View SportsEquipments");
			System.out.println("5. Exit");
			System.out.println("1. Select one number between 1 - 5 :");
			num = input.nextInt();
			if (num == 1) {
				sportsequipmentManager.addsportsequipment();
			}
			else if (num == 2) {
				sportsequipmentManager.deletesportsequipment();
			}
			else if (num == 3) {
				sportsequipmentManager.editsportsequipment();

			}
			else if (num == 4) {
				sportsequipmentManager.viewsportsequipments();
			}
			else {
				continue;
			}
		}
	}
}
