import java.util.*;

public class switchcase {
    public static void main(String args[]) {

        System.out.println("Enter 5 salary amounts:"); 
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        // Error 1: Incorrect method call for sorting
        Arrays.sort(a); 

        System.out.println("Select operation you want to perform:");
        System.out.println("0 for smallest, 1 for biggest, 2 for sum, 3 for average:");
        int x = sc.nextInt();

        // Error 2: Incorrect case-insensitive keyword
        switch (x) {  // 
            case 0:
                System.out.println("The smallest number is: " + a[0]);
                break;
            case 1:
                System.out.println("The largest number is: " + a[4]);
                break;
            case 2:
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += a[i];
                }
                System.out.println("The sum of the array is: " + sum);
                break;
            case 3:
                int total = 0;
                for (int i = 0; i < 5; i++) {
                    total += a[i];
                }
                System.out.println("The average is: " + (total / 5.0));  
                break;
            default:  
                System.out.println("Incorrect input.");
        }

        sc.close();  
    }
}
