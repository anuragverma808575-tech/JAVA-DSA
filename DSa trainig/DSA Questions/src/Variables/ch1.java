package Variables;

public class ch1 {

    // 🔹 Instance Variable → Defined inside class but outside methods.
    // Created when object is created, destroyed when object is destroyed.
    int h; 

    // 🔹 Static Variable → Belongs to class, not object.
    // Created when class is loaded in memory.
    static int h2; 

    public static void main(String[] args) {

        // 🔹 Local Variables (inside method)
        int y = 10;          // Explicit type declaration
        var x = 10.0;        // Implicit type (Java 10+ feature) → Compiler automatically infers data type
        System.out.println(h2); // Accessing static variable (default value = 0)

        // 🔹 Primitive Data Types → Immutable (Value can't be changed directly)
        // They store actual value, not reference.

        // 🟢 Non-decimal (Integral) types:

        byte a = 100; 
        // 1 byte (8 bits)
        // Range: -128 to 127 (-2^7 to 2^7 - 1)
        // 1 bit = sign bit, 7 bits = magnitude bits
        // Used for saving memory in large arrays.

        short b = 130; 
        // 2 bytes (16 bits)
        // Range: -32768 to 32767 (-2^15 to 2^15 - 1)

        int c = 2332; 
        // 4 bytes (32 bits)
        // Most commonly used integer type.

        long d = 32434545454L; 
        // 8 bytes (64 bits)
        // Always add 'L' at the end to specify long literal.

        // 🟡 Decimal types (Floating-point numbers):

        float h = 99.20f;  
        // 4 bytes
        // Always use 'f' or 'F' at end of float literals.

        double h1 = 90.20;  
        // 8 bytes
        // Used for more precision than float.

        // 🟣 Character type:

        char g1 = 'A';  
        // 2 bytes
        // Uses Unicode system → can store any character in any language.

        char g2 = 'न';  
        // Unicode allows even Hindi, Chinese, or any symbol.
        System.out.println(g2); // Output: न

        // 🟠 Boolean type:
        boolean z = true;  
        // 1 bit (logical type)
        // Can be either true or false.
    }
}
