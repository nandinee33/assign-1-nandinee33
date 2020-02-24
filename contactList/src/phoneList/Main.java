package phoneList;

import Helper.LinkedList1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList1 linkedList1 = new LinkedList1();
        Tasks tasks = new Tasks();
        System.out.println("Welcome to nandinee Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit program ");

        int choice = Integer.parseInt(scanner.nextLine());


    }
}
