
import java.util.Scanner;

public class LC9 {

    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;

        while (x > reverse) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return x == reverse || x == reverse / 10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        LC9 solution = new LC9();

        boolean result = solution.isPalindrome(num);

        System.out.println("Is Palindrome: " + result);

        sc.close();
    }
}
