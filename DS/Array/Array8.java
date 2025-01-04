import java.util.Scanner;

public class Array8 {
    public int[] Merge(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0,k=0;
        int n = arr1.length;
        int m = arr2.length;
        int[] res = new int[n+m];
        while (i<n && j<m) {
            if (arr1[i]<arr2[j]) {
                 res[k] = arr1[i];
                 i++;
            }
            else{
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<n) {
            res[k] = arr1[i];
            i++; 
            k++;
        }
        while (j<m) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }
    public void display(int[] res){
        //int[] result = new int[10];
        for(int i = 0;i < res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        Array8 obj = new Array8();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in First Array");
        for(int i = 0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();

        }

        System.out.println("Enter Elements in Second Array");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        int[] result = obj.Merge(arr1, arr2);
        obj.display(result);
        
        
        

    }
    
}
 