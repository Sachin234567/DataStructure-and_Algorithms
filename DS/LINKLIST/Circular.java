import java.util.NoSuchElementException;

public class Circular{
    private Node last;
    private int length;
    private class Node{
        private Node next;
        private int data;
        public Node(int data){
            this.data = data;
        }
    }
    public Circular(){
        last = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void CreateList(){
        Node fir = new Node(5);
        Node sec = new Node(6);
        Node thir = new Node(7);
        Node fout = new Node(8);
        fir.next =sec;
        sec.next = thir;
        thir.next = fout;
        fout.next = fir;
        last = fout;
        
    }
    public void display(){
        if (last == null) {
            return;
        }
        Node temp = last.next;
        while(temp != last ){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print( temp.data );
        System.out.println();
    }
    //  Insert at begining 
    public void InsertBeg(int val){
        Node newnode = new Node(val);
        if (last == null) {
            last = newnode;

        }
        else {
            newnode.next = last.next;

        }
        last.next = newnode;
        length++;

    }
    // Insert at end
    public void InsertEnd(int val){
        Node newnode = new Node(val);
        if (last == null) {
            last = newnode;
            last.next = newnode;
        }
        else{
            newnode.next = last.next;
            last.next = newnode;
            last = newnode;

        }
        length++;
    }
    // Remove First node 
    public Node RemFirst(){
        Node temp = last.next;
        
        if (isEmpty()) {
            throw new  NoSuchElementException();
        }
        //Node temp = last.next;
        if (last.next == last) {
            last = null;
            return last;
        }
        else{
            last.next = temp.next;
            //temp.next = null;
            
        }
        temp.next = null;
        length--;
        return temp;
    }
    public static void main(String[] args) {
        Circular cr = new Circular();

        cr.CreateList();
        cr.display();
        
        System.out.println("Inserting data at begining");
        cr.InsertBeg(9);
        cr.InsertBeg(10);
        cr.display();

        System.out.println("Inserting data at Last");
        cr.InsertEnd(2);
        cr.display();

        System.out.println("Deleting First Node");
        Node First = cr.RemFirst();
        System.out.println("Node to be deleted:" + First.data);
        cr.display();
    }


}
