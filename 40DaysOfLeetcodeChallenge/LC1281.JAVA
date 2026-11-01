
import java.util.Scanner;

public class LC1281 {

    public static int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;

        while (n > 0) {

            int digit = n % 10;

            sum = sum + digit;
            product = product * digit;

            n = n / 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = subtractProductAndSum(n);

        System.out.println("Result: " + result);

        sc.close();
    }
}