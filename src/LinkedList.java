public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node first;
    private Node last;

    // addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else  {
            last.next = node;
            last = node;
        }
    }

    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;

        }
    }


    // deleteFirst
    public void deleteFirst() {
//        first.setValue(0);
//        first.setNext(new Node());
    }

    // deleteLast
    public void deleteLast() {
//        last.setValue(0);
//        last.setNext(new Node());
    }
    // contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }



    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;

        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }





}
