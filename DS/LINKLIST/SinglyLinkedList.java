import java.util.List;

public class SinglyLinkedList {
    // Represent a node of the singly linked list
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }
    }

    // display() will display all the nodes present in the list
    public void display() {
        // Node current will point to head
        Node current = head;

        
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public void RemDuplicate(){
        if (head == null) {
            return;
        }
        Node current = head;
        while(current != null && current.next != null){
            if (current.data == current.next.data) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
    }
    public Node InsertSort(int val){
        Node  newnode = new Node(val);
        if(head == null){
            return newnode;
        }
        Node current = head;
        Node temp = null;
        while (current != null && current.data < newnode.data) {
            temp = current;
            current = current.next;
        }
        newnode.next = current;
        temp.next = newnode;
        return head;
    }
    public void DelKey(int key){
        Node current = head;
        Node temp = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;   
        }
        if (current == null) {
            return;
        }
        temp.next = current.next;
    }
    // HOW TO DETECT A LOOP IN A LINNKED LIST IN JAVA
    
    public boolean DetLoop(){
        Node FastPtr = head;
        Node SlowPtr = head;
        while (FastPtr != null && FastPtr.next != null) {
            FastPtr = FastPtr.next.next;
            SlowPtr = SlowPtr.next;
            if (SlowPtr == FastPtr) {
                return true;
            }
        }
        return false;
    }
        
    private Node getStartingNode(Node SlowPtr){
        Node temp = head;
        while (SlowPtr != temp) {
            temp = temp.next;
            SlowPtr = SlowPtr.next;
        }
        return temp;
    }
    // HOW TO DETECT THE STARTING POINT OF THE LOOP
    public Node PosLoop(){
        Node FastPtr = head;
        Node SlowPtr = head;
        while (FastPtr != null && FastPtr.next != null) {
            FastPtr = FastPtr.next.next;
            SlowPtr = SlowPtr.next;
            if (FastPtr == SlowPtr) {
                return getStartingNode(SlowPtr);
            }
        }
        return null;
    }  
    //HOW TO REMOVE LOOP FROM LINKED LIST
    
    private void RemoveFunc(Node Slowptr){
        Node temp = head;
        while (Slowptr.next != temp.next) {
            Slowptr = Slowptr.next;
            temp = temp.next;
            
        }
        Slowptr.next = null;
    }
        
    public void Remloop(){
        Node FastPtr = head;
        Node SlowPtr = head;
        while (FastPtr != null && FastPtr.next != null) {
            FastPtr = FastPtr.next.next;
            SlowPtr = SlowPtr.next;
            if (FastPtr ==SlowPtr) {
                    RemoveFunc(SlowPtr);
                    return;
            }
            //return null;
        }
        //return null;
    } 
    
    private void RemoveFunc(Node Slowptr) {
        Node temp = head;
        while (Slowptr.next != temp.next) {
            Slowptr = Slowptr.next;
            temp = temp.next;

        }
        Slowptr.next = null;
    } 
    public void CreateloopList(){
        Node fir = new Node(4);
        Node sec = new Node(6);
        Node thir = new Node(7);
        Node fout = new Node(8);
        Node fifth = new Node(9);
        Node six = new Node(10);
        head = fir;
        fir.next = sec;
        sec.next = thir;
        thir.next = fout;
        fout.next = fifth;
        fifth.next = six;
        six.next = fout;
        

    }
    
    // Merge two linked list
    public static Node Merge_Node(Node a , Node b){
        SinglyLinkedList obj = new SinglyLinkedList();
        
        Node Dummy = obj.new Node(0);

       // Dummy.next = null;
        Node tail = Dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            }
            else{
                tail.next = b;
                b = b.next;

            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        }
        else{
            tail.next = a;
        }
        return Dummy.next;
    }


    public static void main(String[] args) {
        

        SinglyLinkedList sList = new SinglyLinkedList();

        // Add nodes to the list
         
        sList.addNode(4);
        sList.addNode(5);
        sList.addNode(6);
        sList.addNode(7);
        sList.addNode(9);
        sList.addNode(10);
        sList.addNode(11);
        sList.addNode(13);
        
        SinglyLinkedList sList2 = new SinglyLinkedList();
        sList2.addNode(1);
        sList2.addNode(2);
        sList2.addNode(3);
        sList2.addNode(8);
        sList2.addNode(12);
        sList2.addNode(14);
        sList2.addNode(15);

        sList.display();
        sList2.display();

        SinglyLinkedList result = new SinglyLinkedList();
        result.head = Merge_Node(sList.head ,sList2.head);
        result.display();

        // Displays the nodes present in the list
       // System.out.println("Linked List with duplicate nodes");
       // sList.display();

        //System.out.println("Linked list without duplicate nodes");
        //sList.RemDuplicate();
        //Node NewList =  sList.InsertSort(8);

        // Remove node by providing key
       // sList.DelKey(7);
       
    // boolean x =   sList.DetLoop();
    // System.out.println(x);


       // sList.CreateloopList();
        //System.out.println(sList.DetLoop());
      //  sList.display();
        //System.out.println(sList.PosLoop().data);
        
        //sList.RemLoop();
        //sList.display();

    }
}
