package Loops;

public class Problem {
    public static void main(String[] args) {
        int num = 17;
        // int factor = 0;
        // Prime numbers
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // factor++;
        // }

        // }
        // if (factor == 2) {
        // System.out.println("Prime Number ");
        // } else {
        // System.out.println("Not Prime");

        // }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
 // leetcode 204 problem in prime