package singlyLinkedList;

public class LinkedList {
    Node head;

    public void insertAtBeginning(int data){
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        System.out.println("Data inserted at beginning successfully");
    }

    public boolean isEmpty(){
        return head == null;
    }

}
