package CS61B.Week3.Lecture6;

public class SpeedAList {
    public static void main(String[] args) {
        AList L = new AList();
        int i = 0;
        while (i < 1000000) {
            L.addLast(i);
            i++;
        }        
    }
}
