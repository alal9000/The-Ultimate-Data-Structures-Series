public class Main {
    public static void main(String[] args) {
        String str = ")1 + 2(";

        BalancedExpressions contains = new BalancedExpressions();
        var result = contains.isBalanced(str);
        System.out.println(result);
    }
}