import java.util.Scanner;

public class Array5 {
    public void printarr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void MoveZeroes(int[] arr ){
        int j= 0;
        int n= arr.length;
        for(int i = 0;i<n;i++){
            if (arr[i]!=0&&arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Array5 obj = new Array5();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("Before moving Zeroes");
        obj.printarr(arr);
        obj.MoveZeroes(arr);
        System.out.println("After moving zeroes");
        obj.printarr(arr);
    }
    
}
