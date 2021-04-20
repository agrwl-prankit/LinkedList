package singlyLinkedList;

public class SinglyMain {
    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtBeginning(1);
        list.insertAtPos(3, 6);
        list.getList();
        list.getSize();
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtPos(3);
    }
}
