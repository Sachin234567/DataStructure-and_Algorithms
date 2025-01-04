import java.util.Scanner;

public class Array3 {
    public int Min(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Array3 obj = new Array3();
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
       int min_ele =  obj.Min(arr);
       System.out.println("minimum element in array");
       System.out.println(min_ele);
        //System.out.println("Enter array elements");
       // Scanner sc = new Scanner(System.in);
        //sc.nextInt();
    }
}
