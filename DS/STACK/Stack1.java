//IMPLEMENT STACK USING LINKEDLIST

import java.util.EmptyStackException;

public class Stack1{
    // Instance variables
    private Node top;
    private int length;
    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
           // this.next = null;
        }
    }
    public Stack1(){
        top = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length ==0;
    }
    public void Push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public int Pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int res = top.data;
        top = top.next;
        length--;
        return res;
    }

    public int Peak(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
    public void display(){
        if (top == null) {
            System.out.println("Stack is empty");
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

            
        }
    }
    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.Push(10);

        st.Push(14);
        st.Push(29);

        st.display();
        System.out.println( "Topmost element in the stack :" +st.Peak());

        st.Pop();
        st.display();
        System.out.println("Topmost element in the stack :" +st.Peak());

    }
}