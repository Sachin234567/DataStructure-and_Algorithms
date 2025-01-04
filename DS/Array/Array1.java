public class Array1 {
    public static void PrintArray(int[] res){
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    public static int[] RemoveEven(int[] arr){
        int countodd = 0;
        for(int i = 0;i<arr.length;i++){
            if (arr[i]%2!=0) {
                countodd++;
            }
        }
        int[] result = new int[countodd];
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
       // int[] arr = {3,4,5,7,8,9,6};
       // Array1 obj = new Array1();
        int[] arr = { 3, 4, 5, 7, 8, 9, 6 };
        System.out.println("Before Removing Even Integers");
        PrintArray(arr);
        System.out.println("After Removing  Even Integers");
       // RemoveEven(arr);
        int[] new_arr = RemoveEven(arr);
        PrintArray(new_arr);
    }

    
}
