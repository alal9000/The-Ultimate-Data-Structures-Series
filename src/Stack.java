public class Stack {
    private int[] items;
    private int count;

    public Stack(int length) {
        items = new int[length];
    }


    public void push(int item) {
        items[count] = item;
        count++;
    }

    public int pop() {
        items = new int[3];
        return items[count - 1];
    }

    public int peek() {
        return items[count - 1];
    }

    public boolean isEmpty() {
        return (items.length == 0);
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
