

import java.io.Console;
import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        // Access system console for hidden input
        Console console = System.console();

        if (console == null) {
            System.out.println("⚠️ Console not available. Run this code in CMD or terminal (not VS Code).");
            return;
        }

        String password = new String(console.readPassword("Enter your password: "));

        // Regex for password validation
        String regex = "^(?=.*[0-9])"        // at least one digit
                     + "(?=.*[A-Z])"         // at least one uppercase
                     + "(?=\\S+$)"           // no spaces
                     + ".{8,25}$";             // at least 8 chars to 25

        // Compile regex and match
        if (Pattern.matches(regex, password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Invalid password!");
        }
    }
}
