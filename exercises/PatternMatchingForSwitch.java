import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String type = scanner.nextLine();
            Object obj = null;

            // Input parsing logic
            if (type.equalsIgnoreCase("Integer")) {
                obj = Integer.parseInt(scanner.nextLine());
            } else if (type.equalsIgnoreCase("Double")) {
                obj = Double.parseDouble(scanner.nextLine());
            } else if (type.equalsIgnoreCase("String")) {
                obj = scanner.nextLine();
            }

            // Task: Use Java 17 Pattern Matching for switch to handle 'obj'
            // Write your switch expression/statement here
            Object result = switch (obj) {
                case Integer i -> i * i;
                case String s -> s.length();
                case Double d -> Math.abs(d);
                default -> "Invalid";
            };

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}