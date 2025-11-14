package reccursion;

public class CountZeros {
    static void CountZeros(int n, int count) {
        if (n == 0) {
            System.out.println("Zeros in this number is :"+count);
            return;
        }
        int digit = n % 10;
        if (digit == 0) {
            count++;
        }
        CountZeros(n/10, count);
    }

    public static void main(String[] args) {
        CountZeros(500706070, 0);
    }
}
