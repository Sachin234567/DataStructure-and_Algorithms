import java.util.Scanner;

public class Quick {
    public void Quick_Sort(int[] arr, int low, int high){
        if (low < high) {
            int Partition_Index = Partition(arr,low,high);
            Quick_Sort(arr, low, Partition_Index-1);
            Quick_Sort(arr, Partition_Index+1, high);
        }
    }
    public int Partition(int[] arr,int low , int high){
        int pivot = arr[low];
        int i = low+1;
        int j = high;
        do{
            while (arr[i] <= pivot ) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        while(i<j);
        if (i >= j) {
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            //return j;
        }
        return j;
    }
    public void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Quick  qk = new Quick();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements that you want to sort");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting");
        qk.display(arr);
        qk.Quick_Sort(arr,0,arr.length-1);
        System.out.println("Array After sorting");
        qk.display(arr);
    }
    
}
