import java.util.Stack;
public class Stack3 {
    public String RevStr(String str){
        Stack<Character> st = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c:chars){
            st.push(c);
        }
        for(int i = 0;i<str.length();i++){
            chars[i] = st.pop();
        }
        return new String(chars);
        
    }
    public static void main(String[] args) {
        Stack3 st3 = new Stack3();
        String str = "ABCD";
        System.out.println("Before reversing the string");
        System.out.println(str);
        System.out.println("After reversing the String");
         String r_str = st3.RevStr(str);
         System.out.println(r_str);

    }
    
}
