//print 0 to n using recursion

public class recursion0toN {
    public static void main(String[] args) {
        // Recursive function to calculate 0toN using recursion
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        ZeroToN(0, n);
    }
    static void ZeroToN(int x , int n) {
        if (x > n)
            return ;
        System.out.println(x);
        ZeroToN(x + 1, n);
        }
}