import java.util.Scanner;

public class Array7 {
    public void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int findMiss(int[] arr){
        int n=arr.length + 1;
        int sum = n*(n+1)/2;
        for(int num:arr){
            sum = sum-num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Array7 obj = new Array7();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("array elements");
        obj.printarr(arr);
        int x = obj.findMiss(arr);
        System.out.println("Missing element is" +x);

    }
}
