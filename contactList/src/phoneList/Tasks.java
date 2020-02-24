package phoneList;

import Helper.LinkedList1;
import Person.Person;

import java.util.LinkedList;
import java.util.Scanner;

public class Tasks {

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
        System.out.print("Enter your email address:");
        scanner.nextLine();
        while (true) {
            String temp = scanner.nextLine();
            if (temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")) {
                linkedList1.addLast(new Person(firstName, lastName, linkedList, temp));
                break;
            } else {
                System.out.println("Invalid email address ! Enter again");
            }
        }
    }

    public void viewcontact(LinkedList1 linkedList1) {
        System.out.println("---Here are all your contacts---");
        if (!linkedList1.isEmpty()) {
            linkedList1.display();
        } else {
            System.out.println("NO results found");
        }

    }

    public void deleteContact(LinkedList1 linkedList1) {
        if (!linkedList1.isEmpty()) {
            System.out.println("Here are all the contacts: Press the number against" +
                    " to delete the contact.");
            linkedList1.displayOne();
            int choice = scanner.nextInt();
            scanner.nextLine();
            linkedList1.deleteNode(choice);
            linkedList1.displayOne();
            System.out.println("Deleted..!!");
        } else {
            System.out.println("No Contacts.You must need to add contacts Before you could delete..");
        }

    }

    public void searchContact(LinkedList1 linkedList1) {
        System.out.println("You could search for a contact from their first names: ");
        String firstName = scanner.nextLine().trim();
        if (linkedList1.indexOf(firstName) >= 0) {
            System.out.println("Match found");
            linkedList1.getNode(linkedList1.indexOf(firstName));
        } else {
            System.out.println("No match found");
        }

    }

}

