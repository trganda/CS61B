public class SLList<LochNess> {
    private class StuffNode {
        public LochNess item;
        public StuffNode next;
    
        public StuffNode(LochNess i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    private StuffNode sentinel;
    private int size;

    public SLList() {
        sentinel = new StuffNode(null, null);
        size = 0;
    }

    public SLList(LochNess x) {
        sentinel = new StuffNode(null, null);
        sentinel.next = new StuffNode(x, null);
        size = 1;
    }

    /** add x to the front of the list. */
    public void addFirst(LochNess x) {
        sentinel.next = new StuffNode(x, sentinel.next);
        size += 1;
    }

    private void addLast(StuffNode p, LochNess x) {
        if (p.next == null) {
            p.next = new StuffNode(x, null);
            return;
        }
        addLast(p.next, x);
    }

    /** add x to the end of the lsit */
    public void addLast(LochNess x) {
        addLast(sentinel, x);
        size += 1;
    }

    /** returns the length of the list. */
    public int size() {
        return size;
    }

    /** returns the first item in the list. */
    public LochNess getFirst() {
        return sentinel.next.item;
    }

    /** returns the last item in the list. */
    public LochNess getLast() {
        StuffNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }

        return p.item;
    }

    // public static void main(String[] args) {
    //     SLList<int> L = new SLList<int>();
    //     L.addLast(5);
    //     L.addFirst(10);
    //     System.out.println(L.getFirst());
    // }
}
