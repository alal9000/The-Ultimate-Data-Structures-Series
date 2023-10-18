public class ArrayMe {
    private int count;
    private int length;
    private int[] array;


    public ArrayMe(int length) {
        array = new int[length];
        count = 0;
        this.length = length;
    }


    public void insert(int item) {
        if (count < array.length) {
            array[count] = item;
            count++;
        } else {
            int newSize = array.length + 1;
            int[] newArray = new int[newSize];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[count] = item;
            count++;
            array = newArray;
        }
    }


    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Invalid index");
        }
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }


    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (item == array[i]) return i;
        }
        return -1;
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

}
