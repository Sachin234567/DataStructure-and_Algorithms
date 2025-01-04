import java.util.Scanner;

public class Palindrome{
    public void display(String word){
        System.out.println(word );
    }
    public boolean IsPalind(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (charArray[start] != charArray[end] ) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome obj = new  Palindrome();
        String word;
        System.out.println("Enter the word that you want to check");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        obj.display(word);
        boolean x = obj.IsPalind(word);
        System.out.println(x);
    }
}