package doublyLinkedList;

public class DoublyLinkedList {

    private DoublyNode head;

    public void insertAtStart(int data){
        DoublyNode newNode = new DoublyNode(data);
        if (!isEmpty()) {
            head.setPrevious(newNode);
            newNode.setNext(head);
        }
        head = newNode;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
