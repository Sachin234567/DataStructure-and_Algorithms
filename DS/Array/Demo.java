public class Demo {
    public void PrintArray(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public void Myarray(){
        //arr[0] = 5;
        int[] arr = new int[5];
       // PrintArray(arr);
       arr[0] = 4;
       arr[1] = 9;
       arr[2] = 8;
       arr[3] = 5;
       arr[4] = 7;
       arr[2] = 6;
       PrintArray(arr);

    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.Myarray();
    }
     
}