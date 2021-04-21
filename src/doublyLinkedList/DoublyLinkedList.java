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
        System.out.println(data + " inserted at start successfully");
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
        System.out.println(data + " inserted at the end successfully");
    }

    public void deleteFirst(){
        if (isEmpty()) System.out.println("List is already empty");
        else {
            DoublyNode temp = head;
            head = head.getNext();
            System.out.println(temp.getData() + " is deleted successfully \nNew list is: ");
            getListFromStart();
        }
    }

    public void getListFromStart(){
        DoublyNode temp = head;
        if (isEmpty()) System.out.println("List is empty");
        else {
            while (temp != null) {
                System.out.print(temp.getData());
                temp = temp.getNext();
                if (temp != null) System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty(){
        return head == null;
    }
}
