import java.util.Scanner;

class practice03 {
    //functions are made on before the public static void main
    public static int sum (int n1 ,int n2){
        int sum = n1 + n2;
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //loop concepts :1-for lop 2-while loop 3-do while loop
        // 1-for loop
        //syntax: for(initialization; condition; update){
        //code to be executed
        //} FOR EXAMOLE: print 1 to 10
        System.out.println("using for loop:");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        //while loop
        //syntax: while(condition){
        //code to be executed
        //} for example: print 1 to 10
        System.out.println("using while loop:");
        int j = 1;
        while(j <= 10){
            System.out.println(j);
            j++;
        }

        //do while loop
        //syntax: do{
        //code to be executed
        //}while(condition);

        //for  example: print 1 to 10
        System.out.println("using do while loop:");
        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k <= 10);

        //QUESATION 01 : print the sum of first n natural numbers
        System.out.println("Question 01: print the sum of first n natural numbers using loops");
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum  = sum + i;
        }
        System.out.println(sum);

        //FUNCTION : a block of code that performs a specific task
        //syntax: return_type function_name(parameters){
        //code to be executed
        //} for example: a function to add two numbers
        System.out.println("function example: a function to add two numbers");

        System.out.println("enter the number 01:");
        int n1 = sc.nextInt();
        System.out.println("enter the secount number :");
        int  n2 = sc.nextInt();

        int addition = sum(n1, n2);
        System.out.println("The sum is equal to: " + addition);

        //Question 02: FIND THE FACTORIAL OF A NUMBER USING FUNCTION

        System.out.println("Question 02: FIND THE FACTORIAL OF A NUMBER USING FUNCTION");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;

        //using lops 
        for (int i=num;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
      


    }

}