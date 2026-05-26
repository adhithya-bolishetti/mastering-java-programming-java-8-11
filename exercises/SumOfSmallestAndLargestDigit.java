import java.util.Scanner;

class DigitAnalyzer {

    String text;

    // Constructor to initialize the text
    DigitAnalyzer(String text) {
        this.text = text;
    }

    // Method to calculate sum of smallest and largest digit
    // Returns -1 if no digits are found
    int calculateDigitSum() {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        boolean foundDigit = false;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= '0' && ch <= '9') {

                int digit = ch - '0';

                smallest = Math.min(smallest, digit);
                largest = Math.max(largest, digit);

                foundDigit = true;
            }
        }

        if (!foundDigit) {
            return -1;
        }

        return smallest + largest;
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {

            String input = scanner.nextLine();

            // Create DigitAnalyzer object
            DigitAnalyzer digitAnalyzer = new DigitAnalyzer(input);

            int result = digitAnalyzer.calculateDigitSum();
            if(result == -1) {
                System.out.print("Invalid input");
            } else {
                System.out.print("Sum: " + result);
            }
        }

        scanner.close();
    }
}