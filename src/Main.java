public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        log(numbers);
    }

    public static void log(int[] numbers) {
        for (int first : numbers)
            for (int second : numbers)
                for (int third : numbers)
                    System.out.println(first + ", " + second + ", " + third);
    }

}