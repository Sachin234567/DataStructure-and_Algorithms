public class Binary {
    public int BinSearch(int[] arr, int key) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Binary obj = new Binary();
        int[] arr = { 21, 45, 67, 80, 96, 98 };
        int key = 80;
        int SearchElementIndex = obj.BinSearch(arr, key);
        System.out.println(SearchElementIndex + " ");

    }

}