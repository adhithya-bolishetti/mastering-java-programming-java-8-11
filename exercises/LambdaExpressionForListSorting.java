import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        // Reading input integers
        if (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            for (String s : input) {
                scores.add(Integer.parseInt(s));
            }
        }

        // Use a Lambda Expression to sort the list in descending order
        // Write your code here
        scores.sort((a, b) -> b.compareTo(a));

        System.out.println("Sorted Scores: " + scores);
        scanner.close();
    }
}