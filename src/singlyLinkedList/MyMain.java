package singlyLinkedList;

public class MyMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);
        list.insertAtEnd(0);
        list.getList();
    }
}
