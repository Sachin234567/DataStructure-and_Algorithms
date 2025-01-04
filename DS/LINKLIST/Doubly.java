import java.util.List;
import java.util.NoSuchElementException;

public class Doubly {
    private Node head;
    private Node tail;
    private int length;

    private class Node{
        private int data;
        private Node next;
        private Node prev;
        public Node(int data){
            this.data = data;
        }
    }  
   // private Node  head;
    //private Node tail;
    //private int length;
    public Doubly(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length == 0; //head == null
    }
    public int length(){
        return length;
    }
    //Inserting Nodes
    public void InsertLast(int val){
        Node newnode = new Node(val);
        if (isEmpty()) {
            head = newnode;
        }
        else{
            tail.next = newnode;

        }
        newnode.prev = tail;
        tail = newnode;
        length++;
    }
    public void TravFor(){
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void TravBack() {
        if (tail == null) {
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    //Inserting node at begining of doubly linked list
    public void InsertFirst(int val){
        Node newnode = new Node(val);
        if (isEmpty()) {
            tail = newnode;
        }
        else{
            head.prev = newnode;

        }
        newnode.next = head;
        head = newnode;
    }
    // Inserting at end
    public void InsertEnd(int val){
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        }
        else{
            tail.next = newnode;
            newnode.prev= tail;

        }
        tail = newnode;
        length++;
    }
    //Deleting the first node from list
    public Node DelFirst(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node temp = head;
        if (head == tail) {
            tail = null;
        }
        else{
            temp.next.prev = null;
            head = head.next;
            temp.next = null;
        }
        return temp;
    }
    public Node DelLast(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node temp = tail;
        if (head == tail) {
            head = null;
        }
        //Node temp = tail;
        else{
            tail.prev.next = null;
        }
        temp.prev = null;
        tail = tail.prev;
        
        
        return temp;

    }
    public static void main(String[] args) {
        Doubly dly = new Doubly();
        dly.InsertLast(3);
        dly.InsertLast(6);
        dly.InsertLast(8);
        dly.InsertLast(9);
        dly.InsertLast(7);
        dly.InsertLast(5);
        System.out.println("Traverse List in forward way");
        dly.TravFor();
        
        System.out.println("Traverse List in Backward way");
        dly.TravBack();
        System.out.println("Inserting at Begining");
        dly.InsertFirst(2);
        dly.TravFor();

        System.out.println("Inserting at Last");
        dly.InsertEnd(11);
        dly.TravFor();
        dly.TravBack();

        System.out.println("Deleting the First Node");
        Node First =  dly.DelFirst();
        System.out.println("Node to be deleted:" + First.data);
        dly.TravFor();
        dly.TravBack();

        System.out.println("Deleting the last node ");
        Node Last = dly.DelLast();
        System.out.println("Node to be deleted:" + Last.data);
        //dly.TravFor();
        dly.TravBack();


    }
}
