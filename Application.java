package addressBook;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		// Collection<AddressBook> a = new ArrayList<AddressBook>();
		List<AddressBook> a = new ArrayList<AddressBook>();
		Scanner s1 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("Press 1 for Insert");
			System.out.println("Press 2 for Display");
			System.out.println("Press 3 for Search");
			System.out.println("Press 4 for Delete");
			System.out.println("Press 5 for Update");
			System.out.println("Press 0 for exit");
			System.out.print("Enter your choice: ");
			ch = s1.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter Serial number: ");
				int srno = s1.nextInt();
				System.out.print("Enter First name: ");
				String fname = sc.nextLine();
				System.out.print("Enter last name: ");
				String lname = sc.nextLine();
				System.out.print("Enter address: ");
				String addres = sc.nextLine();
				System.out.print("Enter state: ");
				String state = sc.nextLine();
				System.out.print("Enter zip: ");
				int zip = s1.nextInt();
				System.out.print("Enter phone: ");
				long phone = s2.nextLong();
				System.out.print("Enter email: ");
				String email = sc.nextLine();
				a.add(new AddressBook(srno, fname, lname, addres, state, zip, phone, email));
				break;

			case 2:
				// System.out.println(a);
				System.out.println("***********************************");
				Iterator<AddressBook> i = a.iterator();
				while (i.hasNext()) {
					AddressBook addr = i.next();
					System.out.println(addr);
				}
				System.out.println("***********************************");
				break;

			case 3:
				boolean found = false;
				System.out.println("Enter serial number to search: ");
				srno = s1.nextInt();
				System.out.println("***********************************");
				i = a.iterator();
				while (i.hasNext()) {
					AddressBook addr = i.next();
					if (addr.getSrno() == srno) {
						System.out.println(addr);
						found = true;
					}
				}
				if (!found) {
					System.out.println("Entered Number Record Not matched");
				}
				System.out.println("***********************************");
				break;

			case 4:
				found = false;
				System.out.println("Enter serial number to delete: ");
				srno = s1.nextInt();
				System.out.println("***********************************");
				i = a.iterator();
				while (i.hasNext()) {
					AddressBook addr = i.next();
					if (addr.getSrno() == srno) {
						i.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Entered Name Record Not matched");
				} else {
					System.out.println("Record Deleted Successfully");
				}
				System.out.println("***********************************");
				break;

			case 5:
				found = false;
				System.out.println("Enter serial number to update: ");
				srno = s1.nextInt();
				System.out.println("***********************************");
				// i = a.iterator();
				ListIterator<AddressBook> li = a.listIterator();
				while (li.hasNext()) {
					AddressBook addr = li.next();
					if (addr.getSrno() == srno) {
						System.out.print("Enter new first name: ");
						fname = sc.nextLine();
						System.out.print("Enter new last name: ");
						lname = sc.nextLine();
						System.out.print("Enter new address: ");
						addres = sc.nextLine();
						System.out.print("Enter new state: ");
						state = sc.nextLine();
						System.out.print("Enter new zip: ");
						zip = sc.nextInt();
						System.out.print("Enter new phone: ");
						phone = sc.nextLong();
						System.out.print("Enter new email: ");
						email = sc.nextLine();
						li.set(new AddressBook(srno, fname, lname, addres, state, zip, phone, email));
						found = true;
					}
				}
				if (!found) {
					System.out.println("Entered Number Record Not matched");
				} else {
					System.out.println("Record Updated Successfully");
				}
				System.out.println("***********************************");
				break;
			}
		} while (ch != 0);

	}

}
