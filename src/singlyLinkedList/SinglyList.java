package singlyLinkedList;

public class SinglyList {
    SinglyNode head;

    public void insertAtBeginning(int data){
        SinglyNode node = new SinglyNode(data);
        if (!isEmpty()) {
            node.setNext(head);
        }
        head = node;
        System.out.println("Data inserted at beginning successfully");
    }

    public void insertAtEnd(int data){
        SinglyNode node = new SinglyNode(data);
        // if list is empty, create a head with entered node
        if (isEmpty()){
            head = node;
        }
        else { // traverse till end and then insert
            SinglyNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        System.out.println("Data inserted at end successfully");
    }

    public void insertAtPos(int pos, int data){
        SinglyNode newNode = new SinglyNode(data);
        SinglyNode temp = head;
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
        SinglyNode temp = head;
        SinglyNode previous = null;
        if (isEmpty()) System.out.println("List is already blank");
        else {
            while (temp.getNext() != null){
                previous = temp;
                temp = temp.getNext();
            }
            if (previous == null) head = null;
            else previous.setNext(null);
            System.out.print("List after deletion of last element is: ");
            getList();
        }
    }

    public void deleteAtPos(int pos){
        SinglyNode temp = head;
        SinglyNode previous = null;
        if (isEmpty()) System.out.println("List is already blank");
        else {
            for (int i=1; i<pos; i++){
                previous = temp;
                temp = temp.getNext();
            }
            previous.setNext(temp.getNext());
            System.out.print("List after deletion of element at " + pos + " position is: ");
            getList();
        }
    }

    public void getList(){
        if (isEmpty()) System.out.println("List is empty");
        else {
            SinglyNode temp = head;
            while (temp != null) {
                System.out.print(temp.getData());
                temp = temp.getNext();
                if (temp != null) {
                    System.out.print("->");
                }
            }
            System.out.println("");
        }
    }

    public void getSize(){
        int count = 0;
        SinglyNode temp = head;
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
