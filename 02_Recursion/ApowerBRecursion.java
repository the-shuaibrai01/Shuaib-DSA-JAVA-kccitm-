import java.util.Scanner;

public class ApowerBRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the exponent (b): ");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power of " + b + " is: " + pow(a, b));
    }
    /* 
    static int pow(int a ,int b){ //time complexity O(b)
        if (b == 0) {
            return 1; //base case
        }
        return a*pow(a,b-1);//recursive case
    }
    */
    static int pow(int a ,int b){ //time complexity O(logn)
        if (b == 0) {
            return 1; //base case
        }   
        int call = pow(a,b/2);
        if (b%2 == 0) { //for even no.s
            return call*call;
        }else{ //for odd no.s
        return a*call*call;
        }
    }
}