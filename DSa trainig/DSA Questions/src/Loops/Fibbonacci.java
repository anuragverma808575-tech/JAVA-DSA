package Loops;

public class Fibbonacci {

    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;
        int next;
        System.out.println(t1 + "\n" + t2);
        for (int i = 2; i <= n; i++) {
            next = t1 + t2;
            System.out.println(next);
            t1 = t2;
            t2 = next;

        }
    }
}
