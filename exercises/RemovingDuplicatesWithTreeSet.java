import java.util.*;

class NameProcessor {
    // Method to process names using a TreeSet
    public static void processNames(String[] names) {
        // Step 1: Initialize a TreeSet of Strings
        TreeSet<String> uniqueNames = new TreeSet<>();
        
        // Step 2: Add all elements from the array to the TreeSet
        for(String name : names) {
            uniqueNames.add(name);
        }
        
        // Step 3: Print the TreeSet in the required format
        System.out.print("Sorted Unique Names: " + uniqueNames);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.trim().isEmpty()) {
                String[] names = line.trim().split("\\s+");
                NameProcessor.processNames(names);
            }
        }
        
        scanner.close();
    }
}