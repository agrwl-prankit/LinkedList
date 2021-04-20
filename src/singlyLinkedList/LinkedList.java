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

    public void insertAtPos(int pos, int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp = temp.getNext();
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        System.out.println(data + " inserted at " + pos + " successfully");
    }

    public void deleteAtBeginning(){
        if (isEmpty()) System.out.println("List is already blank");
        else {
            head = head.getNext();
            System.out.print("List after deletion of first element is: ");
            getList();
        }
    }

    public void deleteAtEnd(){
        Node temp = head;
        Node previous = null;
        if (isEmpty()) System.out.println("List is already blank");
        else {
            while (temp.getNext() != null){
                previous = temp;
                temp = temp.getNext();
            }
            previous.setNext(null);
            System.out.print("List after deletion of last element is: ");
            getList();
        }
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
        System.out.println("");
    }

    public void getSize(){
        int count = 0;
        Node temp = head;
        if (!isEmpty()) {
            while (temp != null) {
                temp = temp.getNext();
                count++;
            }
        }
        System.out.println("Size of list is: " + count);
    }

    public boolean isEmpty(){
        return head == null;
    }

}
