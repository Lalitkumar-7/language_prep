import java.util.*;

class Expenses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read total income
        int income = sc.nextInt(); 
        
        String[] cat = new String[10];
        int[] price = new int[10];
        int sum = 0;
        int i = 0;
      
        while (true) {
            // 2. Read the category string (using sc.next() avoids buffer bugs)
            String s = sc.next(); 
            
            if (s.equalsIgnoreCase("Done")) {
                break; // Exit the loop cleanly
            }
            
            cat[i] = s;               // Store category name
            price[i] = sc.nextInt();  // Store corresponding price
            sum = sum + price[i];     // Add to total expense
            i++;                      // Increment counter
        }

        // 3. Print the final summary dashboard at the very end
        int totalSaving = income - sum;
        System.out.println("Total income:" + income);
        System.out.println("Total savings:" + totalSaving);
        System.out.println("Total Expences:" + sum);
        System.out.println("Category:");
        
        for (int j = 0; j < i; j++) {
            System.out.println(cat[j]+ ": " + price[j]);
        }
        
        sc.close();
    }
}