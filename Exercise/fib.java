public class fib {

    // Recursive function to return nth Fibonacci number
    static int fib(int n) {
        if (n == 0)
            return 0;        // base case 1
        else if (n == 1)
            return 1;        // base case 2
        else
            return fib(n - 1) + fib(n - 2); // recursive call
    }

    public static void main(String[] args) {
        int n = 3; // number of terms

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
