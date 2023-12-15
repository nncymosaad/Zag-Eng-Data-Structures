
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String l = "Nancy";
        System.out.println(reverseString(l));

    }
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        String reverse="";
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty())
            reverse  += stack.pop();
        return reverse;
    }
