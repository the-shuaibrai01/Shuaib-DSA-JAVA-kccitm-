
import java.util.Scanner;

class practice_02 {
    public static void main(String[] args) {
        System.out.println("Practice 02");

        //LECTURE 2 : conditional statements and loops

        //if-else statement
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {//if statement is used to execute a block of code if a specified condition is true. In this case, it checks if the age is greater than or equal to 18.
            System.out.println("You are an adult.");
        } else {//else statement is used to execute a block of code if the condition in the if statement is false. In this case, it executes if the age is less than 18.
            System.out.println("You are not an adult.");
        }
        int a = sc.nextInt();
        System.out.println("Enter a number:");
        if (a % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

       //switch statement : ex-calculator program
        System.out.println("enter the num 1 .");
        a = sc.nextInt();
        System.out.println("enter the second number .");
        int b = sc.nextInt();
        System.out.println("enter the operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        int result = 0;
        boolean validOperator = true;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperator = false;
        }

        if (validOperator) {
            System.out.println("The result is: " + result);
        }

        //Quesation 2 : Ask the user to enter a number of mounth and print the name of the month for example if the user enters 1 then print january and so on
        System.out.println("Enter a month number (1-12):");
        int monthNumber = sc.nextInt();

        //using if-else statement to print the name of the month
        if (monthNumber == 1) {
            System.out.println("January");
        } else if (monthNumber == 2) {
            System.out.println("February");
        } else if (monthNumber == 3) {
            System.out.println("March");
        } else if (monthNumber == 4) {
            System.out.println("April");
        } else if (monthNumber == 5) {
            System.out.println("May");
        } else if (monthNumber == 6) {
            System.out.println("June");
        } else if (monthNumber == 7) {
            System.out.println("July");
        } else if (monthNumber == 8) {
            System.out.println("August");
        } else if (monthNumber == 9) {
            System.out.println("September");
        } else if (monthNumber == 10) {
            System.out.println("October");
        } else if (monthNumber == 11) {
            System.out.println("November");
        } else if (monthNumber == 12) {
            System.out.println("December");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
        //using switch statement to print the name of the month
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
        //loops : for loop, while loop and do-while loop
        //loop- perform a task repeatedly until a certain condition is met
        //for loop : used when the number of iterations is known    
        System.out.println("Enter a number to print its multiplication table:");
        int num = sc.nextInt(); 
        System.out.println("Multiplication table of " + num + ":"); 
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
    }

}