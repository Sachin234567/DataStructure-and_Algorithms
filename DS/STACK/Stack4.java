/*Given an array of integers . For each element in the array,
 * Find its next greater element in thaat array .
 * The next greater element is the first element towards right,
 * which is greater than the current element
 * ex- In: arr = {4,7,3,4,8,1}
 *      Ot: arr = {7,8,4,8,-1,-1}
 */
import java.util.Stack;
public class Stack4{
    public int[] NextGreater(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Stack4 st4 = new Stack4();
        int[] arr = {4,7,3,4,8,1};
        System.out.println("Original Array ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Next greater element array");
        int[] result = st4.NextGreater(arr);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
        

    }
}
