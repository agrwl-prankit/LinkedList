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

    public void insertAtPos(int data, int pos){
        DoublyNode newNode = new DoublyNode(data);
        DoublyNode temp = head;
        for (int i=1; i<pos; i++) temp = temp.getNext();
        temp.getPrevious().setNext(newNode);
        newNode.setPrevious(temp.getPrevious());
        newNode.setNext(temp);
        temp.setPrevious(newNode);
        System.out.println(data + " inserted at pos " + pos + " successfully\nNew list is: ");
        getListFromStart();
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

    public void deleteLast(){
        if (isEmpty()) System.out.println("List is already empty");
        else {
            DoublyNode temp = head, prev = null;
            while (temp.getNext() != null) temp = temp.getNext();
            prev = temp;
            temp.getPrevious().setNext(null);
            System.out.println(prev.getData() + " is deleted successfully \nNew list is: ");
            getListFromStart();
        }
    }

    public void deleteAtPos(int pos){
        DoublyNode temp = head;
        for (int i=1; i<pos; i++) temp = temp.getNext();
        temp.getPrevious().setNext(temp.getNext());
        temp.getNext().setPrevious(temp.getPrevious());
        System.out.println("Data deleted at " + pos + " succesfully\nNew list is: ");
        getListFromStart();
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

    public int getSize(){
        int size = 0;
        if (!isEmpty()){
            DoublyNode temp = head;
            while (temp != null){
                size++;
                temp = temp.getNext();
            }
        }
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
