package reccursion;

public class Rec {
    static void show(int n) {
        // Base case or Termination case
        if (n == 0) {
            return;
        }
        System.out.println("Anurag " + n); // reccursion build
        // n--; // value of n changed
        // show(n); // not change in function itself
        show(n - 1);
        System.out.println("Anurag " + n); // reccursion fall
    }

    // Stack flow >>
    // stack(0)
    // stack(1)
    // stack(2)
    // stack(3)
    // stack(4)
    // stack(5)
    // main() >> main thread chalata hai

    // function load me main() >> stack(0)
    // Function fall me stack(0) >> main()
    // Reccursion state ko maintain karta hai

    public static void main(String[] args) {
        show(5);
    }
}
