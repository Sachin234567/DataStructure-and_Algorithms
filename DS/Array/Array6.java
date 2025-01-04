import java.util.Scanner;

public class Array6 {
    public void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int[] ResizeArray(int[] arr, int new_size){
        int[] temp = new int[new_size];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
    public static void main(String[] args) {
        Array6 obj = new Array6();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements before resizing" +arr.length);
        //obj.printarr(arr);
        //obj.ResizeArray(arr, arr.length*2);
       arr= obj.ResizeArray(arr, 8);
       
        System.out.println("Array size after resizing" +arr.length);
        //obj.ResizeArray(arr, 8);
        //obj.printarr(arr);
    }
    
}
