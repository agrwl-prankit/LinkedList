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
        System.out.println("Data inserted at start successfully");
    }

    public void insertAtEnd(int data){
        DoublyNode newNode = new DoublyNode(data);
        DoublyNode temp = head;
        if (isEmpty()) head = newNode;
        else {
            while (temp.getNext() != null) temp = temp.getNext();
            temp.setNext(newNode);
            newNode.setPrevious(temp);
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}
