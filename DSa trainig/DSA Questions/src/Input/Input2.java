package Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) throws FileNotFoundException {
        //  Input Second method
        Scanner sc=new Scanner(new File("C:\\Users\\Mr.X\\Desktop\\DSa trainig\\Input\\Input2.java")); //
       // Scanner sc=new Scanner("Hello world"); // Scanner is buffer not input type
        int count=0;
        while(sc.hasNext()){
            count++;
            System.out.println(sc.next());
           
        }
         System.out.println("Total words:"+count);
    }
}
