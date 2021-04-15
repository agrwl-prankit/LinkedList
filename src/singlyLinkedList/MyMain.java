package singlyLinkedList;

public class MyMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtBeginning(1);
        list.insertAtPos(3, 6);
        list.getList();
    }
}
