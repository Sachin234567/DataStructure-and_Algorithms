public class Array2 {
    public void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public  int[] Reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Array2 obj = new Array2();
        int[] arr = {4,6,3,7,8,5,9};
        System.out.println("Before reversing the array");
        obj.PrintArray(arr);
        System.out.println("After Reversing the array elements");
        obj.Reverse(arr);
        obj.PrintArray(arr);

    }
    
}
