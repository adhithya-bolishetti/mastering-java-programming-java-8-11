import java.util.Scanner;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            
            // Define Predicate 1: Check if multiple of 7
            // Write your code here
            Predicate<Integer> multipleOf7 = n -> n % 7 == 0;

            
            // Define Predicate 2: Check if greater than 50
            // Write your code here
            Predicate<Integer> greaterThan50 = n -> n > 50;
            
            // Combine them and test the input

            boolean result = multipleOf7.and(greaterThan50).test(num);

            System.out.print("Elite: " + result);
        }
        
        scanner.close();
    }
}