public class ReversenoRecursion {

    public static int reverseNumber(int n, int r) {
        if (n == 0) {
            return r;
        }
        return reverseNumber(n / 10, r * 10 + n % 10);
    }

    public static void main(String[] args) {
        int n = 12345;

        System.out.println("Reversed number: " + reverseNumber(n, 0));
    }
}