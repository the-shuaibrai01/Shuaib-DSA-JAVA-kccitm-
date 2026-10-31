public class PrintIncDecRecursion{
    static int n ; 
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        printIncDec(n);
    }
    static void printIncDec(int n) {
        if (n == 0 ) {
            return ;
        }
        System.out.println(n +" ");
        printIncDec(n - 1);
        if ( n != 1) System.out.println( n + "");
    }

}