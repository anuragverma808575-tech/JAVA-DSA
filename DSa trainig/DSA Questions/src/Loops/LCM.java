package Loops;

public class LCM {
    public static void main(String[] args) {
        int a = 20;
        int b = 14;
        int LCM = 0;
        int greatest;
        if (a > b) {
            greatest = a;
        } else {
            greatest = b;
        }
        for (int i = 2; i <= greatest; i++) {
            if (a % i == 0) {
                if (b % i == 0) {
                    LCM = i;
                } else {
                    LCM = i;
                }
            } else {
                LCM = i;

            }

        }
        System.out.println("LCM is: " + LCM);
    }
}
