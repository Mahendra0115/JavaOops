import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Test {
    static int count = 0; // Declared static to be used inside the static main method

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // File path should be in double quotes
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\Java_Oops\\Streams\\ReadData.java"));

        int data = br.read(); // Read a single character from the file

        // Loop to read and print characters until the end of the file (-1 means end of file)
        while (data != -1) {
            System.out.print((char) data); // Convert int to char and print
            data = br.read(); // Read the next character
            count++; // Count each character read
        }

        System.out.println("Total characters read: " + count); // Print the total count of characters
        br.close(); // Always close the reader
    }
}
