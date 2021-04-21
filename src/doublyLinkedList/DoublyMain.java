package doublyLinkedList;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.getList();
        list.insertAtStart(2);
        list.insertAtStart(1);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.getList();
    }
}
