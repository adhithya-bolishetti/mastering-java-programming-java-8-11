import java.util.Scanner;

class WordCounter {

   public int countWords(Scanner scanner) {
        int count = 0;

        // Hint: Use a loop to check if the scanner has more input.
        // The scanner.hasNext() method is useful here because it 
        // treats spaces and newlines as separators automatically.
        
        // --- Write your code here ---
        while(scanner.hasNext()) {
            String s = scanner.next();
            count++;
        }
        
        
        // ----------------------------
        
        return count;
}
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Instantiate the WordCounter class
        //Call the method to perform the count
        WordCounter wordCounter = new WordCounter();
        int count = wordCounter.countWords(scanner);
        // print the final output

        //Write your code here
        System.out.print("Total words: " + count);
        
        scanner.close();
    }
}