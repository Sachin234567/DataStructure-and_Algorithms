import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree1{
    private Node root;
    private class Node{
        private Node left;
        private Node right;
        private int data;
        public Node(int data){
            this.data = data;
        }
    }
    public void CreateBinTree(){
        Node fir = new Node(1);
        Node sec = new Node(2);
        Node thir = new Node(3);
        Node fout = new Node(4);
        Node fifth = new Node(5);

        root = fir;
        fir.left = sec;
        fir.right = thir;

        sec.left = fout;
        sec.right = fifth;
        System.out.println("Preorder Traversal");
        PreTraversal(root);
        System.out.println();
        System.out.println("Inorder Traversal");
        
        Inorder(root);
        System.out.println();
        System.out.println("Post OrderTraversal");
        PostTraversal(root);
        System.out.println();



    }
    //Recursively traverse the tree
    public void PreTraversal(Node root){
        if (root == null) {
            return ;
        }
        System.out.print(root.data + " ");
        PreTraversal(root.left);
        PreTraversal(root.right);
    }
        /* 
    //Preorder Tree Traversal using stack
    public void PreTraversal(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
    //Inorder Tree Traversal using recursion
    public void Inorder(Node root){
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }*/
    // Inorder traversal using stack
    public void Inorder(Node root){
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }

        }

    }
    /* 
    public void PostTraversal(Node root){
        if (root == null) {
            return;
        }
        PostTraversal(root.left);
        PostTraversal(root.right);
        System.out.print(root.data + " ");
    }
        */
    public void PostTraversal(Node root){
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (!stack.isEmpty()||curr != null) {
            if (curr!=null) {
                stack.push(curr);
                curr = curr.left;

            }
            else{
                Node temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty()&& temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                }
                else {
                    curr = temp;
                }

            }
        }
    }
    public void  LevelOrder(){
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }

        }

    }
    public int FindMax(){
        return Fin 
    }

        
    public static void main(String[] args) {
        BinaryTree1 obj = new BinaryTree1();
        obj.CreateBinTree();
        System.out.println("Level Order Traversal");
        obj.LevelOrder();
        
        
    }

}