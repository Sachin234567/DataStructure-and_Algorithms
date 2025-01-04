public class Bubble{
    public void display(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public void Bubble_Sort(int[] arr,int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j < n;j++){
                if (arr[j] < arr[j+1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = swap;
                    
                }
            }
        }
    }
}