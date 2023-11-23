public class recursion {
    public static void main(String[] args) {
        // Example usage
        double result = power(2, 3);
        System.out.println("Result: " + result);
    }

    // Function to calculate power
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            // If n is even, x^n = (x^(n/2))^2
            double temp = power(x, n / 2);
            return temp * temp;
        } else {
            // If n is odd, x^n = x * (x^(n-1))
            return x * power(x, n - 1);
        }
    }

}
    
