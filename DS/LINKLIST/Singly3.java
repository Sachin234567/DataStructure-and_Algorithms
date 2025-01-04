public class Singly3 {
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
         System.out.println("null");
    }
    public static void main(String[] args) {
        Singly3 obj= new Singly3();
        
        obj.display();
        
    }
}
