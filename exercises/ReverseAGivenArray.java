import java.util.Scanner;

class ArrayReverser {

    int[] arr;

    // Constructor to initialize the array with validation
    public ArrayReverser(int[] arr, int size) {

        if (size <= 0) {
            System.out.print("Invalid input");
            System.exit(0);
        }

        this.arr = arr;
    }

    // Method to reverse the array
    public void reverseArray(int[] arr) {

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read size of array
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.print("Invalid input");
            return;
        }

        // Read array elements
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = scanner.nextInt();

            if (arr[i] > 10000 || arr[i] < -10000) {
                System.out.print("Invalid input");
                return;
            }
        }

        // Create object
        ArrayReverser arrayReverser = new ArrayReverser(arr, size);

        // Reverse array
        arrayReverser.reverseArray(arr);

        System.out.print("Reversed Array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}