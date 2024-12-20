import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Summary: This project demonstrates practical handling of exceptions in Java. Each exception is implemented in its own file to ensure clarity and focus on individual exception handling mechanisms.
// Approach: For each exception, we deliberately trigger the exception in a meaningful scenario and handle it using try-catch blocks. Comprehensive comments are provided to explain each block's purpose and functionality.

// IOExceptionExample.java

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent_file.txt"));
            reader.readLine();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }

    }
}
