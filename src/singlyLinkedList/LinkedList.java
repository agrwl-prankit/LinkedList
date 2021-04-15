package singlyLinkedList;

public class LinkedList {
    Node head;

    public void insertAtBeginning(int data){
        Node node = new Node(data);
        if (!isEmpty()) {
            node.setNext(head);
        }
        head = node;
        System.out.println("Data inserted at beginning successfully");
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        // if list is empty, create a head with entered node
        if (isEmpty()){
            head = node;
        }
        else { // traverse till end and then insert
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        System.out.println("Data inserted at end successfully");
    }

    public void getList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getData());
            temp = temp.getNext();
            if (temp!= null){
                System.out.print("->");
            }
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

}
