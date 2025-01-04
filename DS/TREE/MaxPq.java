public class MaxPq {
    Integer[] heap;
    int n;
    public MaxPq(int capacity){
        heap = new Integer[capacity+1];
        n = 0;
    }
    public boolean isEmpty(){
        return n==0; 
    }
    public int size(){
        return n;
    }
    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for(int i = 0;i<heap.length;i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }
    public void insert(int x){
        if (n == heap.length - 1) {
            resize(2*heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }
    public void swim(int k){
        while (k > 1 && heap[k/2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2;
        }
    }
    public void display(){
        for(int i = 1; i<= n; i++){
            System.out.print(heap[i] + " ");
        }
    }
    
    
    public static void main(String[] args) {
        MaxPq pq = new MaxPq(3);
        //System.out.println(pq.size());
        //System.out.print(pq.isEmpty());
        pq.insert(3);
        pq.insert(4);
        pq.insert(5);
        pq.insert(6);
        pq.insert(7);
        
        System.out.println(pq.size());
        pq.display();
       // pq.insert(0);
        
    }

    
}
