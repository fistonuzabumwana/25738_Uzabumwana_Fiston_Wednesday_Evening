// EOFExceptionExample.java
import java.io.*;
public class EOFExceptionExample {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(new byte[]{}));
            dis.readUTF();
        } catch (EOFException e) {
            System.out.println("EOFException occurred: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}