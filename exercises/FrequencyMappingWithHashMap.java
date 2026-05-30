import java.util.*;

class FrequencyAnalyzer {
    // Method to calculate and print frequency
    public static void printFrequencies(String[] input) {
        // Step 1: Initialize a Map (use LinkedHashMap to maintain input order)
        LinkedHashMap<String, Integer>  numbers = new LinkedHashMap<>();

        // Step 2: Iterate through the input array
        // Step 3: Update count in the map
        for(int i=0;i<input.length;i++) {
            numbers.put(input[i], numbers.getOrDefault(input[i], 0) + 1);
        }
        
        // Step 4: Print the map contents
        for(String key : numbers.keySet()) {
            System.out.println(key + ": " + numbers.get(key));
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.trim().isEmpty()) {
                String[] parts = line.trim().split("\\s+");
                FrequencyAnalyzer.printFrequencies(parts);
            }
        }
        
        scanner.close();
    }
}