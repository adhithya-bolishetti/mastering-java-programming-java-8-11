import java.util.Scanner;

// Define the Functional Interface
@FunctionalInterface
interface SquareRoot {
    double calculate(double n);
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble()) {
            double input = scanner.nextDouble();

            // Task: Assign the static method Math.sqrt to the interface using a Method Reference
            // SquareRoot sr = ...
            SquareRoot sr = Math::sqrt;
            
            // Task: Call the calculate method and print the result
            System.out.print("Result: " + sr.calculate(input));
        }

        scanner.close();
    }
}