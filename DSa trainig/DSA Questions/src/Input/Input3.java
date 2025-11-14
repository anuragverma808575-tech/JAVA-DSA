package Input;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the id: ");
        // int id = sc.nextInt(); // read integer value before press enter
        // sc.nextLine(); // Read single line with spaces
        // System.out.println("Enter the name: ");
        // String name = sc.nextLine();

        // System.out.println("name:"+name+" "+"id is:"+id);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();// Read single line with spaces

        System.out.println("Enter the id: ");
        int id = sc.nextInt(); // read integer value before press enter
        System.out.println("Name is : " + name + "\n" + "Id is :" + id);
        sc.close(); // best practice

    }
}
