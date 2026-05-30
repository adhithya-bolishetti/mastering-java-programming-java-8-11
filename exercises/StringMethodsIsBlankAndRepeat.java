import java.util.Scanner;

class MessageProcessor {
    String message;

    MessageProcessor(String message) {
        this.message = message;
    }

    // Method to process and repeat the message
    void processMessage(int count) {
        // Step 1: Check if message is blank using Java 11 isBlank()
        if (message.isBlank()) {
            System.out.println("Invalid input");
            return;
        }

        // Step 2: Trim the message
        String trimmedMessage = message.trim();

        // Step 3: Repeat with space-separated formatting
        String result = (trimmedMessage + " ").repeat(count).trim();
        System.out.print(result);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (scanner.hasNextInt()) {
                int count = scanner.nextInt();
                
                MessageProcessor mp = new MessageProcessor(input);
                mp.processMessage(count);
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}