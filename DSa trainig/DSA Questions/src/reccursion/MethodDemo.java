package reccursion;

public class MethodDemo {

    // Function stack me jaate hai and itis based on LIFO;
    static void show() {
        System.out.println("I am the static Method");
    }
    // function ends - pop from the stack
    // function ends } or return
     void Methodshow() {
        System.out.println("I am the non static Method");
    }

    public static void main(String[] args) {
        show();  // calling static function
        // When u call a function or ,ethod it push in a stack
        // along with local vaariables

        MethodDemo obj=new MethodDemo();
        obj.Methodshow();  // non staic calling


    }
}
