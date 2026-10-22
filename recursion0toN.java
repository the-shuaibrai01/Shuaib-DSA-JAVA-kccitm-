public class recursion0toN {
    public static void main(String[] args) {
        // Recursive function to calculate 0toN using recursion
        
        OneToN(5);
    }
    static void OneToN(int n ){
        if (n == 0) {
            System.out.println(n);
            return;
        }
            OneToN(n - 1);
            System.out.println(n);
        }
}