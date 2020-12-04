public class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n) {
        item = i;
        next = n;
    }

    public void addAdjacent() {
        if (next == null) {
            return;
        }
        IntNode p = this;
        IntNode q = next;

        while (p != null && q != null) {
            if (p.item == q.item) {
                p.item += q.item;
                q = q.next;
                p.next = q;
            } else {
                p = p.next;
                q = q.next;
            }
        }
    }

    public static void main(String[] args) {
        IntNode L = new IntNode(3, null);
        L = new IntNode(2, L);
        L = new IntNode(1, L);
        L = new IntNode(1, L);

        L.addAdjacent();
    }
}