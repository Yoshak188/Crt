public class FibonacciDP {

    // Function to calculate nth Fibonacci number using dynamic programming
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1]; // Array to store Fibonacci values
        dp[0] = 0;
        dp[1] = 1;

        // Build the dp array from bottom up
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n]; // Return the nth Fibonacci number
    }

    public static void main(String[] args) {
        int n = 10; // You can change this value to test other inputs

        try {
            System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
