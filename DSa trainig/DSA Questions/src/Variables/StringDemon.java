// 📂 Package name (optional, for organizing files)
package Variables;

// Importing classes for big number handling
import java.math.BigDecimal;
import java.math.BigInteger;

public class StringDemon {
    public static void main(String[] args) {

        // 🔹 1️⃣ String literal with intern()
        // String literals stored in String Pool (inside heap)
        // intern() ensures that string is placed in the pool.
        String n1 = "Anurag".intern();

        // 🔹 2️⃣ Another literal (same value)
        // This also refers to the same String Pool object.
        String n2 = "Anurag";

        // 🔹 Check reference equality (== compares memory address)
        System.out.println(n1 == n2); // ✅ true (both refer to same pool object)


        // 🔹 3️⃣ Using 'new' keyword creates a new object (Heap memory)
        // Without intern(), it will not refer to pool.
        // String n3 = new String("Anurag");
        // System.out.println(n1 == n3); // ❌ false (different memory locations)


        // 🔹 4️⃣ Using intern() with new String()
        // Moves heap string to pool, returns pooled reference.
        String n3 = new String("Anurag").intern();
        System.out.println(n1 == n3); // ✅ true (now both are same from pool)


        // 🔹 5️⃣ String immutability
        // Strings are immutable → once created, can’t be changed.
        System.out.println(n2.toUpperCase()); // Prints "ANURAG"
        System.out.println(n2); // Still "Anurag" (original not modified)


        // 🔹 6️⃣ StringBuffer & StringBuilder
        // Both are mutable (can be changed without creating new object)

        // StringBuffer → Thread-safe (Synchronized)
        StringBuffer a = new StringBuffer();

        // StringBuilder → Not thread-safe but faster
        StringBuilder b = new StringBuilder("Anurag");

        // 🔹 Checking length & capacity
        System.out.println(b.length());   // number of characters → 6
        System.out.println(b.capacity()); // default = 16 + string length (16+6=22 approx)

        // 🔹 Appending data → same object modified
        b.append("asdshfididdhd");
        System.out.println(b.length());   // new length after adding
        System.out.println(b.capacity()); // may increase if limit crossed

        // 🔹 Add more characters to exceed capacity and trigger expansion
        b.append("dhudsfhiodfghijgi");
        System.out.println(b.length());
        System.out.println(b.capacity()); // newCap = oldCap * 2 + 2 (dynamic resizing)


        // 🔹 7️⃣ BigInteger & BigDecimal
        // Used for high-precision or large number calculations (beyond primitive limits)

        // BigDecimal → for very large or precise decimal values (like money, scientific data)
        BigDecimal ab = new BigDecimal("13212433433.3554444745");

        // BigInteger → for very large integers
        BigInteger ad = new BigInteger("24243432455445454");
        BigInteger ac = new BigInteger("24243432455454545454");

        // add() returns a new BigInteger object (immutable)
        BigInteger v = ac.add(ad);

        // Print the result of addition
        System.out.println("Addition of BigIntegers: " + v);

        // Print BigDecimal value
        System.out.println("BigDecimal Value: " + ab);
    }
}
