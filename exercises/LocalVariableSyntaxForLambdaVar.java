import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("\\s+");
            List<Integer> numbers = Arrays.stream(parts)
                                          .map(Integer::parseInt)
                                          .collect(Collectors.toList());

            // Task: Filter the numbers using a lambda expression with 'var'
            // A number is a success if (n % 3 == 0 && n % 7 == 0)
            List<Integer> result = numbers.stream()
                    .filter(n -> n % 3 == 0 && n % 7 == 0)
                    .collect(Collectors.toList());

            System.out.println("Success Numbers: " + result);
        }
        
        scanner.close();
    }
}