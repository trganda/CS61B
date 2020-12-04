public class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;
    
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode(-1, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(-1, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** add x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    private static void addLast(IntNode p, int x) {
        if (p.next == null) {
            p.next = new IntNode(x, null);
            return;
        }
        addLast(p.next, x);
    }

    /** add x to the end of the lsit */
    public void addLast(int x) {
        addLast(sentinel, x);
        size += 1;
    }

    /** returns the length of the list. */
    public int size() {
        return size;
    }

    /** returns the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** returns the last item in the list. */
    public int getLast() {
        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }

        return p.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(5);
        L.addFirst(10);
        System.out.println(L.getFirst());
    }
}
