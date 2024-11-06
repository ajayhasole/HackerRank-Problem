import java.io.*;
import java.util.*;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        // Calculate the distance of cat x and cat y from the mouse
        int distanceCatX = Math.abs(x - z);
        int distanceCatY = Math.abs(y - z);

        // Compare the distances
        if (distanceCatX < distanceCatY) {
            return "Cat X";
        } else if (distanceCatY < distanceCatX) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    public static void main(String[] args) throws IOException {
        // Use Scanner to read from standard input
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int q = scanner.nextInt();
        scanner.nextLine();  // Consume the newline after reading the integer
        
        // Create a BufferedWriter for output (not necessary for console, but used in some environments)
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // Loop through each test case
        for (int qItr = 0; qItr < q; qItr++) {
            // Read the positions of cats x, y, and the mouse z
            String[] xyz = scanner.nextLine().split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);

            // Call the catAndMouse function and get the result
            String result = catAndMouse(x, y, z);

            // Write the result to the output
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        // Close the BufferedWriter and Scanner
        bufferedWriter.close();
        scanner.close();
    }
}
