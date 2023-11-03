import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "abcd";

        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();

        // Use a for loop to push characters in reverse order
        for (int i = charArray.length - 1; i >= 0; i--) {
            stack.push(charArray[i]);
        }

        System.out.println(stack);
    }
}