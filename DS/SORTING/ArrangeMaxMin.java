import java.util.Scanner;

public class ArrangeMaxMin {
    public void Arrange(int[] arr){
        int maxidx = arr.length-1;
        int minidx = 0;
        int max = arr[maxidx]+1;
        for(int i=0;i<arr.length;i++){
            if (i%2 == 0) {
                arr[i] = arr[i] + (arr[maxidx]%max)*max;
                maxidx--;
            }
            else{
                arr[i] = arr[i] + (arr[minidx]%max)*max;
                minidx++;
            }
        }
        for(int i = 0; i<arr.length;i++){
            arr[i] = arr[i] /max;
        }
    }
    public void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrangeMaxMin obj = new ArrangeMaxMin();
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted Array Before Arrange");
        obj.display(arr);
        obj.Arrange(arr);
        System.out.println("MaxMin Array After Arrange");
        obj.display(arr);
    }

    
}
