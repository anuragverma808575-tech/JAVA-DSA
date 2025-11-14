package reccursion;

public class CountEvenOddNumber {
    static int evenSum = 0;
    static int oddSum = 0;

    static void EvenOdd(int n) {

        if (n == 0) {
            System.out.println("Even Sum: " + evenSum + " \n" + "Odd sum: " + oddSum);
            return;
        }
        int digit = n % 10;
        if (digit % 2 == 0) {
            evenSum += digit;
        } else {
            oddSum += digit;
        }
        EvenOdd(n / 10);

    }

    public static void main(String[] args) {
        EvenOdd(12346);
    }
}
