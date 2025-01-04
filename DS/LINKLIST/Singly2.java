public class Singly2 {
    private ListNode head;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        // System.out.println("null");
    }
    public static void main(String[] args) {
        Singly2 obj = new Singly2();
        ListNode head = obj.new ListNode(5);
        ListNode fir = obj.new ListNode(6);
        ListNode sec = obj.new ListNode(7);
        ListNode thir = obj.new ListNode(8);
        ListNode fout = obj.new ListNode(9);
        head.next = fir;
        fir.next = sec;
        sec.next = thir;
        thir.next = fout;
        obj.display();
        
    }
    
}
