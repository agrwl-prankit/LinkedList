package singlyLinkedList;

public class SinglyNode {

    private int data;
    private SinglyNode next;

    public SinglyNode(int data){
        this.data = data;
        this.next = null;
    }

    // getter-setter to access these variables

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }
}
