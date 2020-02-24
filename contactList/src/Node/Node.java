package Node;

import Person.Person;

public class Node {
    private Person value;
    private Node next;

    public Node(Person value) {
        this.value = value;
    }

    public Person getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }


}
