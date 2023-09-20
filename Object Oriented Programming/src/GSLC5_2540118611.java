import java.util.*;
import java.util.Collections;

public class GSLC5_2540118611 {

	public static void main(String[] args) {

		int menuPrice, menuDiscount, choice, count, count2;
		boolean menuloop = true;
		String menuCode, menuName;
		boolean flag;
		ArrayList<Menu> al = new ArrayList<Menu>();
		ArrayList<MenuSpecial> al2 = new ArrayList<MenuSpecial>();

		try (Scanner input = new Scanner(System.in)) {
			do {
				System.out.println();
				System.out.println("Family Restaurant");
				System.out.println("===========================================");
				System.out.println("1. Add Regular Menu");
				System.out.println("2. Add Special Menu");
				System.out.println("3. Show All Menu");
				System.out.println("4. Delete Regular Menu");
				System.out.println("5. Delete Special Menu");
				System.out.println("6. Exit");

				do {
					System.out.printf("Choice [1-6]: ");
					choice = 0;
					try {
						choice = Integer.parseInt(input.nextLine());
					} catch (NumberFormatException e) {

					}
				} while (choice > 6 || choice < 1);

				switch (choice) {
				case 1:
					System.out.println();
					System.out.println("Add Regular Menu");
					System.out.println("===========================");

					do {
						flag = true;
						System.out.print("Input menu code [R...]:");
						menuCode = input.nextLine();

						if (!(menuCode.charAt(0) == 'R')) {
							flag = false;
						}

						for (int i = 1; i < menuCode.length(); i++) {
							char ch = menuCode.charAt(i);
							if (!(ch >= '0' & ch <= '9')) {
								flag = false;
							}
						}

					} while (flag == false);

					do {
						System.out.print("Input menu name [5-20]:");
						menuName = input.nextLine();
					} while (menuName.length() > 20 || menuName.length() < 5);

					do {
						System.out.print("Input menu price [10000-100000]:");
						menuPrice = 0;
						try {
							menuPrice = Integer.parseInt(input.nextLine());
						} catch (NumberFormatException e) {

						}
					} while (menuPrice > 100000 || menuPrice < 10000);

					Menu NewMenu = (new Menu(menuCode, menuName, menuPrice));
					al.add(NewMenu);

					System.out.println("Add success!");
					break;
				case 2:
					System.out.println();
					System.out.println("Add Special Menu");
					System.out.println("===========================");

					do {
						flag = true;
						System.out.print("Input menu code [S...]:");
						menuCode = input.nextLine();

						if (!(menuCode.charAt(0) == 'S')) {
							flag = false;
						}

						for (int i = 1; i < menuCode.length(); i++) {
							char ch = menuCode.charAt(i);
							if (!(ch >= '0' & ch <= '9')) {
								flag = false;
							}
						}

					} while (flag == false);

					do {
						System.out.print("Input menu name [5-20]:");
						menuName = input.nextLine();
					} while (menuName.length() > 20 || menuName.length() < 5);

					do {
						System.out.print("Input menu price [10000-100000]:");
						menuPrice = 0;
						try {
							menuPrice = Integer.parseInt(input.nextLine());
						} catch (NumberFormatException e) {

						}
					} while (menuPrice > 100000 || menuPrice < 10000);

					do {
						System.out.print("Input menu discount [10% | 25% | 50%]:");
						menuDiscount = 0;
						try {
							menuDiscount = Integer.parseInt(input.nextLine());
						} catch (NumberFormatException e) {

						}
					} while (menuDiscount != 10 && menuDiscount != 25 && menuDiscount != 50);

					MenuSpecial NewMenuSpecial = (new MenuSpecial(menuCode, menuName, menuPrice, menuDiscount));
					al2.add(NewMenuSpecial);

					System.out.println("Add success!");
					break;
				case 3:
					System.out.println();
					System.out.println("Reguler Menu");
					System.out.println("=================================================");
					System.out.println("No.| Kode |         Nama          |   Harga     |");
					System.out.println("=================================================");
					count = 0;
					for (Menu b : al) {
						count++;
						System.out.printf("%d %6s %14s %16d\n", count, b.menuCode, b.menuName, b.menuPrice);
					}
					System.out.println();

					System.out.println();
					System.out.println("Special Menu");
					System.out.println("==============================================================");
					System.out.println("No.| Kode |         Nama          |   Harga     |   Diskon   |");
					System.out.println("==============================================================");
					count2 = 0;
					for (MenuSpecial b : al2) {
						count2++;
						System.out.printf("%d %6s %12s %19d %11d %%", count2, b.menuCode, b.menuName, b.menuPrice,
								b.menuDiscount);
					}
					System.out.println();
					break;
				case 4:
					System.out.println();
					System.out.println("Delete Reguler Menu");
					System.out.println("==========================");
					flag = false;
					do {
						System.out.print("Input menu code [R...]:");
						menuCode = input.nextLine();

						if (!(menuCode.charAt(0) == 'R')) {
							flag = false;
						}

						for (int i = 1; i < menuCode.length(); i++) {
							char ch = menuCode.charAt(i);
							if (!(ch >= '0' & ch <= '9')) {
								flag = false;
							}
						}
						
						
						for(int j = 0; j < al.size(); j++) {
							if(al.contains(menuCode))
								al.remove(menuCode);
								System.out.println("Delete Success!");
								System.out.println();
								flag = true;
						}
						
//						for(int j = 0; j < al.size(); j++) {
//							if(al.indexOf(menuCode) != -1)
//								al.remove(al.indexOf(menuCode));
//								System.out.println("Delete Success!");
//								System.out.println();
//								flag = true;
//						}

						if (flag == false) {
							System.out.println("Code is wrong");
						}

					} while (flag == false);

					break;
				case 5:
					System.out.println();
					System.out.println("Delete Special Menu");
					System.out.println("==========================");
					do {
						flag = true;
						System.out.print("Input menu code [S...]:");
						menuCode = input.nextLine();

						if (!(menuCode.charAt(0) == 'S')) {
							flag = false;
						}

						for (int i = 1; i < menuCode.length(); i++) {
							char ch = menuCode.charAt(i);
							if (!(ch >= '0' & ch <= '9')) {
								flag = false;
							}
						}

						for(int j = 0; j < al2.size(); j++) {
							if(al2.indexOf(menuCode) != -1)
								al2.remove(al2.indexOf(menuCode));
								System.out.println("Delete Success!");
								System.out.println();
								flag = true;
						}

						if (flag == false) {
							System.out.println("Code is wrong");
						}

					} while (flag == false);

					break;
				case 6:
					menuloop = false;
				}
			} while (menuloop == true);
		}
	}
}
