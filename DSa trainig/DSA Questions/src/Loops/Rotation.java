package Loops;

public class Rotation {
    public static void main(String[] args) {
        int num = 12345;
        int k = 2;
        int digit = 0;
        int temp = num;
        while (temp > 0) {
            num = num / 10;
            digit++;

        }
        // int r = r % digit;
        int n = temp;
        int right = n % (int) Math.pow(10, k);
        int left = n / (int) Math.pow(10, k);
        int result = right * (int) Math.pow(10, digit - k) + left;
        System.out.println(k + "Rotation of number is:" + result);

    }
}
