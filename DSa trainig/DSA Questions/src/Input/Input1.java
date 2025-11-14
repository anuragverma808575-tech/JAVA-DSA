package Input;

public class Input1 {
    public static void main(String[] args) {

        // Command line Inputs
        String name=args[0];
        int age= Integer.parseInt(args[1]);
        double salary= Double.parseDouble(args[2]);
        System.out.println("Name is:"+args[0]);
         System.out.println("Age is:"+args[1]);
          System.out.println("Salary is:"+args[2]);

    }
}
