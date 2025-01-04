//  implement stack using array
public class Stack2 {
    private int top;
    private int[] arr;
    public Stack2(int capacity){
        top = -1;
        arr = new int[capacity];
    }
    public Stack2(){
        this(10);
    }
    public void push(int data){
        if (isFull()) {
            throw new RuntimeException("Stack is Full");
        }
        top++;
        arr[top]  = data;
    }
    public boolean isFull(){
        return arr.length == size();
    }
    public boolean isEmpty(){
        return top<0;
    }
    public int size(){
        return top + 1;
    }
    // Removing elements from stack
    public int Pop(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        int res = arr[top];
        top--;
        return res;
    }
    public int Peek(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return arr[top];
    }
    public void display(){
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        for(int i = top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack2 st2 = new Stack2();
        st2.push(4);
        st2.push(6);
        st2.push(7);
        st2.push(8);
        st2.push(9);
        st2.display();
        System.out.println("After removing top element ");
        st2.Pop();
        st2.display();

        System.out.println("Top element in the stack");
        int top = st2.Peek();
        System.out.println(top);
    }
}
 