import java.util.Stack;

public class Expression {
    public static Boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isLeftBracket(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (isRightBracket(s.charAt(i))) {
                if (stack.isEmpty())
                    return false;
                char left = stack.pop();
                if (!isMatch(left, s.charAt(i)))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private static Boolean isMatch(char left, char right) {
        return (left == '[' && right == ']') ||
                (left == '{' && right == '}') ||
                (left == '(' && right == ')') ||
                (left == '<' && right == '>');
    }

    private static boolean isLeftBracket(char c) {
        return c == '[' || c == '{' || c == '(' || c == '<';
    }

    private static boolean isRightBracket(char c) {
        return c == ']' || c == '}' || c == ')' || c == '>';
    }
}