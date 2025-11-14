package Variables;

public class ch2 {
    public static void main(String[] args) {

        // 🔹 Example 1: Primitive Data Type (Immutable)
        // Primitive types store value directly in memory
        int x = 10;
        int y = x; // Copy of value is assigned (not reference)
        System.out.println(y + 10); // prints 20
        System.out.println(y); // prints 10
        y = y + 20; // y changes but x remains same
        System.out.println(x + " " + y); // Output: 10 30

        // 🔹 Example 2: Non-Primitive Data Type (Mutable / Reference Type)
        // Arrays are reference types in Java
        int a[] = {1, 2, 3, 4, 5};
        int b[] = a; // Here 'b' refers to same array as 'a'
        b[0] = 23; // changing b[0] will also affect a[0]
        System.out.println(a[0] + " " + b[0]); // Output: 23 23

        // 🔹 Example 3: Wrapper Classes and Type Conversion
        // String to int conversion
        String g1 = "1000";
        int c = Integer.parseInt(g1); // String → int
        System.out.println("Converted int value: " + c);

        // 🔹 Example 4: Primitive double vs Wrapper Double
        double tt = 100.20; // primitive type (only stores data)
        Double nn = 100.20; // wrapper class (data + methods)

        // Double → int conversion using intValue()
        int a1 = nn.intValue();
        System.out.println("Integer value of nn: " + a1); // Output: 100

        // Double → String conversion using toString()
        String g = nn.toString();
        System.out.println("String value of nn: " + g); // Output: "100.2"

        // 🔹 Important Interview Notes:
        // Wrapper classes in Java are used when:
        // 1️⃣ We want to use primitives in Collections (like ArrayList, HashMap etc.)
        // 2️⃣ We need utility methods (like parseInt(), intValue(), toString(), etc.)
        // 3️⃣ For object-oriented features and null handling

        // 🔹 Summary:
        // Primitive → immutable (value copy hota hai)
        // Non-primitive → reference copy (address share hota hai)
        // Wrapper → provides methods + null handling + OOP features
    }
}
