package Helper;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {

    Scanner scanner = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();

    public void addContact(LinkedList1 linkedList1){

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


    }

    public void viewcontact(LinkedList1 linkedList1){

    }

    public void deleteContact(LinkedList1 linkedList1){

    }

    public void searchContact(LinkedList1 linkedList1){

    }


}
