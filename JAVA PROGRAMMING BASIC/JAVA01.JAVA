import java.util.Scanner; //importing the Scanner class to read input from the user

class first{//class declaration
    public static void main(String[] args) { //main method - entry point of the program public static void main(String[] args) is the standard method signature for the main method in Java. It is the entry point of the program where the execution starts.
        System.out.println("Hello World");//println() is used to print a line of text and move to the next line
        System.out.println("Welcome to Java Programming");//system.out is the standard output stream in Java, and println() is a method that prints the specified message to the console followed by a new line.
        System.out.println("This is a practice code");

        //LECTURE 1: Introduction to Java Programming
        System.out.println("Java is a high-level, class-based, object-oriented programming language.");

        //pattern design to print a triangle
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        //pattern design in one line
        System.out.println("*\n**\n***\n****");

        //variables and data types
        var a = 10; //variable declaration and initialization
        var b = 20;
        var c = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = b / a;
        System.out.println("Sum of a and b is: " + c);
        System.out.println("Difference of b and a is: " + difference);
        System.out.println("Product of a and b is: " + product);
        System.out.println("Quotient of b and a is: " + quotient);

        String name = "shuaibrai"; //string variable
        int age = 25; //integer variable
        double salary = 50000.50; //double variable
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        //input from user
        Scanner sc  = new Scanner(System.in);//scanner class is used to read input from the user
        System.out.println("Enter your name:");
        String inputName = sc.nextLine();//nextLine() is used to read a line of text (including spaces)
        System.out.println("Enter your age:");
        int inputAge = sc.nextInt(); //input can also used to take input from the user and store it in a variable
        System.out.println("Enter your salary:");
        double inputSalary = sc.nextDouble();
        System.out.println("Name: " + inputName);
        System.out.println("Age: " + inputAge);
        System.out.println("Salary: " + inputSalary);

        //nextint() is used to read an integer value from the user
        //nextDouble() is used to read a double value from the user

        //quesation 1: take two numbers as input and print their sum, difference, product and quotient
        System.out.println("Enter first number:");
        int num1 = sc.nextInt(); //nextInt() is used to read an integer value from the user
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2; 
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("Difference of " + num1 + " and " + num2 + " is: " + difference);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("Quotient of " + num1 + " and " + num2 + " is: " + quotient);

        //QUESATION 2: Make a program that takes the radius of a circle as input, calculates its area and prints it as output to the user.
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + area);

        //QUESATION 3: Make a program that prints the table of a number that is input by the user. 
        System.out.println("Enter a number to print its table:");
        int tableNum = sc.nextInt();
        System.out.println("Table of " + tableNum + ":");
        System.out.println(tableNum + " x 1 = " + (tableNum * 1));
        System.out.println(tableNum + " x 2 = " + (tableNum * 2));
        System.out.println(tableNum + " x 3 = " + (tableNum * 3));
        System.out.println(tableNum + " x 4 = " + (tableNum * 4));
        System.out.println(tableNum + " x 5 = " + (tableNum * 5));
        System.out.println(tableNum + " x 6 = " + (tableNum * 6));
        System.out.println(tableNum + " x 7 = " + (tableNum * 7));
        System.out.println(tableNum + " x 8 = " + (tableNum * 8));
        System.out.println(tableNum + " x 9 = " + (tableNum * 9));
        System.out.println(tableNum + " x 10 = " + (tableNum *  10));

        //QUESATION 4: Make a program that takes the length and breadth of a rectangle as input, calculates its area and prints it as output to the user.
        System.out.println("Enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = sc.nextDouble();
        area = length * breadth;
        System.out.println("Area of the rectangle is: " + area);

        //QUESATION 5: Make a program that takes the base and height of a triangle as input, calculates its area and prints it as output to the user.
        System.out.println("Enter the base of the triangle:"); 
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = sc.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle is: " + triangleArea);
        
    }
}