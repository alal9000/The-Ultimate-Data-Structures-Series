import java.util.Stack;

public class BalancedExpressions {
    public boolean balanced(String input) {

        Stack<Character> stack = new Stack<>();


        for (char ch : input.toCharArray())
            if (ch == '(' || ch == '[' || ch == '<'  )
                stack.push(ch);
            else if (ch == ')' || ch == ']' || ch == '>') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '>' && top != '<')) {
                    return false;
                }
            }
            return true;
    }
}
