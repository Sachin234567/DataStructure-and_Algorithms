import java.util.Scanner;

public class Array4 {
    public static int SecHigh(int[] arr ){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax = arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args) {
         Array4 obj = new Array4();
         int[] arr = new int[5];
         Scanner sc = new Scanner(System.in);
        // int[] arr;
        System.out.println("enter elements");
         for(int i= 0;i<arr.length;i++){
            arr[i] =  sc.nextInt();
         }
         System.out.println("Array Elements:");
         for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
         }
         System.out.println();
         int sm = obj.SecHigh(arr);
         System.out.println("Second max element of the array is"+sm);
    }
    
}
