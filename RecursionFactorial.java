public class RecursionFactorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}