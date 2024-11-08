import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    // This function takes in a 3x3 grid and returns the minimum cost to convert it into a magic square
    public static int formingMagicSquare(List<List<Integer>> s) {
        // All possible 3x3 magic squares using numbers 1 to 9
        List<List<List<Integer>>> magicSquares = Arrays.asList(
            Arrays.asList(
                Arrays.asList(8, 1, 6),
                Arrays.asList(3, 5, 7),
                Arrays.asList(4, 9, 2)
            ),
            Arrays.asList(
                Arrays.asList(6, 1, 8),
                Arrays.asList(7, 5, 3),
                Arrays.asList(2, 9, 4)
            ),
            Arrays.asList(
                Arrays.asList(4, 9, 2),
                Arrays.asList(3, 5, 7),
                Arrays.asList(8, 1, 6)
            ),
            Arrays.asList(
                Arrays.asList(2, 9, 4),
                Arrays.asList(7, 5, 3),
                Arrays.asList(6, 1, 8)
            ),
            Arrays.asList(
                Arrays.asList(8, 3, 4),
                Arrays.asList(1, 5, 9),
                Arrays.asList(6, 7, 2)
            ),
            Arrays.asList(
                Arrays.asList(4, 3, 8),
                Arrays.asList(9, 5, 1),
                Arrays.asList(2, 7, 6)
            ),
            Arrays.asList(
                Arrays.asList(6, 7, 2),
                Arrays.asList(1, 5, 9),
                Arrays.asList(8, 3, 4)
            ),
            Arrays.asList(
                Arrays.asList(2, 7, 6),
                Arrays.asList(9, 5, 1),
                Arrays.asList(4, 3, 8)
            )
        );
        
        // Convert the input list of lists into a single list of integers for easy comparison
        List<Integer> sList = new ArrayList<>();
        for (List<Integer> row : s) {
            sList.addAll(row);
        }

        int minCost = Integer.MAX_VALUE;
        
        // Compare the input square with each of the 8 magic squares
        for (List<List<Integer>> magic : magicSquares) {
            List<Integer> magicList = new ArrayList<>();
            for (List<Integer> row : magic) {
                magicList.addAll(row);
            }

            // Calculate the cost for this magic square
            int cost = 0;
            for (int i = 0; i < 9; i++) {
                cost += Math.abs(sList.get(i) - magicList.get(i));
            }

            // Keep track of the minimum cost
            minCost = Math.min(minCost, cost);
        }
        
        return minCost;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
