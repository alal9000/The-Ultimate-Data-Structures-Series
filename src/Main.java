public class Main {
    public void greet(String[] names) {
        // O(n) space
        String[] copy = new String[names.length];

        for (int i = 0; i < names.length; i++)
            System.out.println("Hi " + names[i]);
    }

}