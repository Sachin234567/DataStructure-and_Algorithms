public class BST {
    private Node root;
    private class Node{
        private Node left;
        private Node right;
        private int data;
        public Node(int data){
            this.data = data;
        }
    }
    public void CreateBST(Node root){
        Node fir = new Node(5);
        Node sec = new Node(4);
        Node thir = new Node(6);
        Node fout = new Node(3);
        Node fifth = new Node(7);
        root = fir;
        fir.left = sec;
        fir.right = thir;
        sec.left = fout;
        thir.left = fifth;
        PreTraversal(root);
        Isvalid(root, 0, 10);
    }
    public void PreTraversal(Node root){
        if (root == null) {
            return;
            
        }
       // Node temp = root;
        System.out.print(root.data + " ");
        PreTraversal(root.left);
        PreTraversal(root.right);


    }
    public boolean Isvalid(Node root,long min,long max){
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        boolean left = Isvalid(root.left,min,root.data);
        if (left) {
            boolean right = Isvalid(root.right,root.data,max);
            return right;
        }
        return false;
    }
    public static void main(String[] args) {
         BST bst = new BST();
         bst.CreateBST(null);
         
        // bst.PreTraversal(root);
    }

    
}
