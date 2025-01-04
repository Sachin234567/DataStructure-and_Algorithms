public class Merge {
    public void Sort(int[] arr,int[] temp,int low,int high){
        if(low < high) {
            int mid = low + (high-low)/2;
            Sort(arr, temp,low,mid);
            Sort(arr, temp,mid+1,high);
            Merging(arr,temp,low,mid,high);
            
        }
    }
    public void Merging(int[] arr,int[] temp,int low,int mid,int high){
        for(int i = low; i <= high; i++){
            temp[i] = arr[i];

        }
        int i = low; int j = mid+1; int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }
    public void display(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Merge obj = new Merge();
        int[] arr = {12,16,13,11,14,17,10};
        System.out.println("Before Sorted Array elements");
        obj.display(arr);
        
        obj.Sort(arr,new int[arr.length],0, arr.length-1);
        System.out.println("After Sorted Array elements");
        obj.display(arr);
    }
    
}
