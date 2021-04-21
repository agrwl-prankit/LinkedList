package doublyLinkedList;

public class DoublyNode {

    private int data;
    private DoublyNode previous, next;

    public DoublyNode(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }
}
