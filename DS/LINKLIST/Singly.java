
public class Singly{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        //System.out.println("null");
    }
    /* 
    public int Length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public void InsertFirst(int val){
        ListNode newnode = new ListNode(val);
        newnode.next = head;
        head = newnode;
    }
    public void InsertEnd(int val){
        ListNode newnode = new ListNode(val);
        if (head == null) {
            head  = newnode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newnode;
    }
    public void InsertMid(int val,int pos){
        ListNode newnode = new ListNode(val);
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
        }
        else{
            ListNode prev = head;
            int count = 1;
            while (count < pos-1) {
                prev = prev.next;
                count++;
            }
            ListNode current = prev.next;
            newnode.next = current;
            prev.next = newnode;
        }
    }
    //deleting first node
    public ListNode DelFirst(){
        if(head == null){
            return null;
        }
        
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
        
        
    }
    public ListNode DelLast(){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
            //head = temp;
        }
        prev.next = null;
        return temp;
    }
    public ListNode DelPos(int pos){
        if (head == null || pos == 1) {
            return head;
        }
        ListNode temp = head;
       // ListNode prev = null;
        int count = 1;
        while (count < pos-1) {
          //  prev = temp;
            temp = temp.next;
            count++;
        }
        ListNode prev = temp.next;
        temp.next = prev.next;
        return prev;
    }
    public boolean SearchKey(int key){
        ListNode temp = head;
        while (temp.next != null) {
            if (key == temp.data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    // REVERSE THE LINKLIST 
    public ListNode RevList(ListNode head){
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        ListNode Next = null;
        while (temp != null) {
            Next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = Next;
        }
        return prev;
    }
        */
    public static void main(String[] args){
        Singly si = new Singly();

        ListNode  head = new ListNode(4);
        ListNode sec = new ListNode(5);
        ListNode thid = new ListNode(6);
        ListNode fouth = new ListNode(7);
        ListNode fifth = new ListNode(8);

        head.next = sec;
        sec.next = thid;
        thid.next = fouth;
        fouth.next = fifth;
       // Singly si = new Singly();
        si.display();
       /*int Len =  si.Length();
       System.out.println(Len);

       System.out.println("Inserting node at begining");
       si.InsertFirst(9);
       si.display();

       System.out.println("Inserting node at Last");
       si.InsertEnd(11);
       si.display();
        
       System.out.println("Inserting node at particular position");
       si.InsertMid(13,3);
       si.display();

      System.out.println(" First Deleted node is :" + si.DelFirst().data);
      si.display();

      System.out.println("Last Deleted node is: " +si.DelLast().data);
      si.display();

      System.out.println("node dele.at specific pos is:" +si.DelPos(2).data);
      si.display();

      System.out.println("Element Search :" +si.SearchKey(6) );
      si.display();
       */
     // ListNode revlist = si.RevList(head);
      //System.out.println("Reverse LinkedList:"+ revlist.data);
    //  si.display(revlist);
    }
}