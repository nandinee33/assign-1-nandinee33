package Helper;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {

    Scanner scanner = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();

    public void addContact(LinkedList1 linkedList1) {

        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine().trim();
        while (true) {
            if (firstName.matches("[A-Za-z]+")) {
                break;
            } else {
                System.out.println("Please enter correct name");
            }
            firstName = scanner.nextLine().trim();
        }
        System.out.print("Last Name : ");
        String lastName = scanner.nextLine().trim();
        while (true) {
            if (lastName.matches("[A-Za-z]+")) {
                break;
            } else {
                System.out.println("Please enter correct name");
            }
            lastName = scanner.nextLine().trim();
        }
        System.out.print("Contact Number:");
        while (true) {
            String contact = scanner.nextLine().trim();
            if (contact.matches("[0-9]{10}")) {
                linkedList.add(contact);
                break;
            }
        }
        while (true) {
            System.out.print("Would you like to add another contact number? (y/n):");
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                System.out.println("Conatct Number : ");
                String contactNumber1 = scanner.nextLine().trim();
                while (true) {
                    if (contactNumber1.matches("[0-9]{10}")) {
                        linkedList.add(contactNumber1);
                        break;
                    } else {
                        System.out.println("Add correct number");
                    }
                }
            } else {
                break;
            }
        }
    }
}

