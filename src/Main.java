import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        var result = stack.peek();
        System.out.println(result);
        var top = stack.pop();
        System.out.println(top);
        stack.print();
        System.out.println(result);

    }
}