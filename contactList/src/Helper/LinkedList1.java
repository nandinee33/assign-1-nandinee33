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
        boolean response = false;
        if (first == null) {
            response = true;
        }
        return response;
    }


    public boolean exist(String firstName) {
        if (indexOf(firstName) != -1) {
            return true;
        }
        return false;
    }


    public int indexOf(String firstName) {
        Node currently = first;
        int response = 0;
        while (currently != null) {
            if (currently.getValue().getFirstName().equals(firstName)) {
                return response;
            }
            response++;
            currently = currently.getNext();
        }
        return -1;
    }


    public void removeFirst() {
        if (first == last) {
            first = null;
            last = null;
        } else {
            Node second = first.getNext();
            first = second;
        }
    }

    public void removeLast() {
        var previousNode = getPreviousNode(last);
        last = previousNode;
        last.setNext(null);
    }

    private Node getPreviousNode(Node node) {
        var current = first;
        while (current.getNext() != null) {
            if (current.getNext() == node) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void deleteNode(int position) {

    }

    public int size() {
        var current = first;
        int index = 1;
        while (current.getNext() != null) {
            current = current.getNext();
            index++;
        }
        return index;
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

