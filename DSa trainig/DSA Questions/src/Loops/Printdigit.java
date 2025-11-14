package Loops;

public class Printdigit {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;
        int copy = n;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Digit is: " + count);
        int power = (int) Math.pow(10, count - 1);
        n = copy;
        while (n > 0) {
            int firstDigit = n / power;
            System.out.println(firstDigit);
            n = n % power;
            power=power/10;

        }

    }
}
