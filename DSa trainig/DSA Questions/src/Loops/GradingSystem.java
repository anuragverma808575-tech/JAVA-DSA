package Loops;

import java.util.Scanner;
import jdk.jfr.Percentage;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of DBMS:");
        int a = sc.nextInt();
        System.out.println("Enter the marks of DAA:");
        int b = sc.nextInt();
        System.out.println("Enter the marks of DA:");
        int c = sc.nextInt();
        int marks = a + b + c;
        System.out.println(marks);
        float percentage = (float) (a + b + c) / 3;
        System.out.println("Your Percentage is:" + percentage);

        if (percentage > 100) {
            System.out.println("Invalid Percentage");
        } else if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

    }
}
