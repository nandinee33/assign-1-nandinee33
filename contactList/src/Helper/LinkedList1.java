package Helper;

import Node.Node;
import Person.Person;

public class LinkedList1 {

    Person person;
    private Node first;
    private Node last;

    public void addFirst(Person person) {
        Node node = new Node(person);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public void addLast(Person person) {
        Node node = new Node(person);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first = node;
        }

    }

    public boolean isEmpty() {
        return true;
    }


    public boolean exist(String firstName) {
        return true;
    }


    public int indexOf(String firstName) {
        return -1;
    }


    public void removeFirst() {

    }

    public void removeLast() {

    }

    private Node getPreviousNode(Node node) {
        return null;
    }

    public void deleteNode(int position) {

    }

    public int size() {
        return 0;
    }

    public void display() {

    }

    public void displayOne() {

    }

    public void getNode(int pos) {
        var current = first;
        int index = 0;
        while (current != null) {
            if (index == pos) {
                System.out.println();
                System.out.println("-----------------------*-------------------------");
                System.out.println("Name:" + current.getValue().getFirstName() + " " + current.getValue().getLastName());
                System.out.println("Contacts:" + current.getValue().getContacts().toString());
                System.out.println("Email:" + current.getValue().getEmail());
                System.out.println("------------------------*-------------------------");
                System.out.println();
                break;
            }
            index++;
            current = current.getNext();
        }


    }


}

