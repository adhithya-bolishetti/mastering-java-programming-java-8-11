import java.util.Scanner;

// Step 1: Define the sealed interface and permitted final classes
sealed interface PaymentMethod permits CreditCard, DigitalWallet {
    String getPortal();
}

final class CreditCard implements PaymentMethod {
    @Override
    public String getPortal() {
        return "Redirecting to Bank Portal...";
    }
}

final class DigitalWallet implements PaymentMethod {
    @Override
    public String getPortal() {
        return "Opening Wallet App...";
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            String choice = scanner.next();
            PaymentMethod method = null;

            // Step 2: Initialize the correct class based on input
            if (choice.equals("Credit")) {
                method = new CreditCard();
            } else if (choice.equals("Wallet")) {
                method = new DigitalWallet();
            }

            // Step 3: Print result or "Invalid payment method"
            if (method != null) {
                System.out.println(method.getPortal());
            } else {
                System.out.println("Invalid payment method");
            }
        }

        scanner.close();
    }
}