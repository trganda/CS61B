public class AList<Glorp> {
    private Glorp[] arrays;
    private int size;

    /** Creates an empty list. */
    public AList() {
        arrays = new Glorp[100];
        size = 0;
    }

    /** Reseizes the capaticy of the list. */
    private void resize(int capacity) {
        Glorp[] temp =  (Glorp[]) new Object[capacity];
        System.arraycopy(arrays, 0, temp, 0, size);
        arrays = temp;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Glorp x) {
        if (size == arrays.length) {
            resize((int)(size*1.5));
        }
        arrays[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public Glorp getLast() {
        if (size == 0) {
            return -1;
        }
        return arrays[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Glorp get(int i) {
        return arrays[i-1];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Glorp removeLast() {
        Glorp ret = getLast();
        arrays[size-1] = null;
        size--;
        return ret;
    }
}