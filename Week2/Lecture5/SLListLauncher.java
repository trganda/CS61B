public class SLListLauncher {
    public static void main(String[] args) {
        SLList<String> sl = new SLList<String>("bone");
        sl.addFirst("things");

        System.out.println(sl.getFirst());
    }
}
