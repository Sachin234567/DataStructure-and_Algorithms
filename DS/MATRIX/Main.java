import java.util.Scanner;
public class Main {
    public void SpiralPrint(int[][] matrix , int r , int c){
        int i, k = 0,l = 0;
        while (k<r && l<c) {
            for(i = l; i<c; i++){
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for(i = k; i < r; i++){
                System.out.print(matrix[i][c-1] + " ");
            }
            c--;
            if (k < r) {
                for(i = c-1;i >= l; i--){
                    System.out.print(matrix[r-1][i] + " ");
                }
                r--;

            }
            if (l < c) {
                for(i = r-1; i >= k; i--){
                    System.out.print(matrix[i][l] + " ");
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Main sm = new Main();
        Scanner sc = new Scanner(System.in);
        //Input Number of rows and columns
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int cols = sc.nextInt();
        //Create  a 2-D array(matrix)
        int[][] matrix = new int[rows][cols];
        // Input Values into the matrix
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                System.out.print("Enter element at position("+ i + "," + j +"):");
                matrix[i][j] = sc.nextInt();
            }
        }
        //print the matrix 
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols ;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        sm.SpiralPrint(matrix, rows, cols);
        
        //Search the element in the matrix 
        /* 
        int key;
       // int len = rows*cols;
        System.out.println("Enter the key you want to search");

        key = sc.nextInt();
        int n = matrix.length;
        rows = 0;
        cols= n-1;
        while (rows < n && cols >= 0) {
            if (matrix[rows][cols] == key) {
                System.out.print(key + " found at position:" + rows + "," + cols);
            
            }
            if (matrix[rows][cols] < key) {
                cols--;
            }
            else{
                rows++;
            }
        }
        System.out.println("Element not Found in the matrix:");
        */
    }
    

    
}
