import java.util.*;

class sumSingle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read the total number of elements in the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Loop to take array inputs from the user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize result to -1 (default value if no unique element is found)
        int result = -1;
        
        // Sort the array so that identical duplicate numbers sit right next to each other
        Arrays.sort(arr);
        
        // Loop through the array, jumping by 2 steps (j = j + 2) to check elements in pairs
        for (int j = 0; j < n; j = j + 2) {
            
            // EDGE CASE: If 'j' reaches the very last element, it means all previous 
            // pairs matched perfectly. This lone last element must be our unique single number.
            if (j == (n - 1)) {
                result = arr[j];
                break; // Stop execution immediately
            }
            // MAIN CHECK: Compare the current element with the immediate next element.
            // If they don't match, the current element 'arr[j]' is the unique single number.
            else if (arr[j] != arr[j + 1]) {
                result = arr[j];
                break; // Stop execution immediately so 'result' does not get overwritten
            }
        }
        
        // Print the final unique single element
        System.out.println(result);
        
        sc.close(); // Clean up resource leak
    }
}

/* ============================================================================
   🚀 THE FULLY OPTIMIZED XOR APPROACH (BEST FOR TCS NQT)
   ============================================================================
 
   How it works:
   - Any number XORed with itself cancels out and becomes 0 (e.g., 5 ^ 5 = 0).
   - Any number XORed with 0 remains unchanged (e.g., 0 ^ 3 = 3).
   - All pairs will destroy each other, leaving only the unique number behind!

import java.util.*;

class sumSingleXOR {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0; // Starts at 0 because (0 XOR any_number = any_number)

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            // Apply bitwise XOR operation to cancel out matching duplicates
            result = result ^ num; 
        }
        
        // Print the lone surviving unique element
        System.out.println(result);
        sc.close();
    }
}
============================================================================ */