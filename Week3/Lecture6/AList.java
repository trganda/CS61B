package CS61B.Week3.Lecture6;

public class AList {
    private int[] arrays;
    private int size;

    /** Creates an empty list. */
    public AList() {
        arrays = new int[100];
        size = 0;
    }

    /** Reseizes the capaticy of the list. */
    private void resize(int capacity) {
        int[] temp =  new int[capacity];
        System.arraycopy(arrays, 0, temp, 0, size);
        arrays = temp;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if (size == arrays.length) {
            resize(size+100);
        }
        arrays[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        if (size == 0) {
            return -1;
        }
        return arrays[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return arrays[i-1];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        int ret = getLast();
        size--;
        return ret;
    }
}