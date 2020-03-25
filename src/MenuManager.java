import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num = 5;

		while (num != 6) {
			System.out.println("----SportsEquipment Management System Menu----");
			System.out.println("1. Add SportsEquipment");
			System.out.println("2. Delete SportsEquipment");
			System.out.println("3. Edit SportsEquipment");
			System.out.println("4. View SportsEquipment");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("1. Select one number between 1 - 6 :");
			num = input.nextInt();
			if (num == 1) {
				addsportsequipment();
			}
			else if (num == 2) {
				deletesportsequipment();
		}
			else if (num == 3) {
				editsportsequipment();

	}
			else if (num == 4) {
				viewsportsequipment();
			}
			else {
				continue;
			}
		}
	}
	public static void addsportsequipment() {
		Scanner input = new Scanner (System.in);
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		System.out.print("Sports Equipment name : ");
		String SEName= input.next();
		System.out.print("Email address : ");
		String SEEmail= input.next();
		System.out.print("Phone number : ");
		String SEPhone= input.next();
	}
	public static void deletesportsequipment() {
		Scanner input = new Scanner (System.in);
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
	}
	
	public static void editsportsequipment() {
		Scanner input = new Scanner (System.in);
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		
	}
	public static void viewsportsequipment() {
		Scanner input = new Scanner (System.in);
		System.out.print("Sports Equipment ID : ");
		int SEId= input.nextInt();
		
	}
}
