package singlyLinkedList;

public class Node {

    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    // as variables are private, we need getter-setter to access these variables

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
