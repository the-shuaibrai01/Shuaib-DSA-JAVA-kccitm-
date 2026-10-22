public class Recursion01 {
    public static void main(String[] args) {
        // Recursive function to calculate Nto1 using recursion
        Nto1(5);
    }

    static void Nto1(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Nto1(n - 1);
    }
}