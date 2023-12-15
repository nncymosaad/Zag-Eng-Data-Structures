
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String l = "Nancy";
        System.out.println(reverseString(l));
        String M = "[{lkop}]";
        System.out.println(balancedExpression(M));
        String N = "[{lkop}])";
        System.out.println(balancedExpression(N));
        String Z = "([{lkop}]";
        System.out.println(balancedExpression(Z));
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
    public static Boolean balancedExpression(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(isLeftBracket(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (isRightBracket(s.charAt(i))) {
                if(stack.isEmpty())
                    return false;
                char left = stack.pop();
                if(!isMatch(left,s.charAt(i)))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private static Boolean isMatch(char left, char right) {
        return (left=='['&&right==']')||
               (left=='{'&&right=='}')||
               (left=='('&&right==')')||
               (left=='<'&&right=='>');
    }

    private static boolean isLeftBracket(char c) {
        return c=='[' || c=='{' || c=='(' || c=='<' ;
    }
    private static boolean isRightBracket(char c) {
        return c==']' || c=='}' || c==')' || c=='>' ;
    }
}
