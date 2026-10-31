
public class Topic01Pattern{
    public static void main(String[] args) {

        //Star Pattern
        System.out.println();
        System.out.println("squer");
        //squer....
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("hollow squer");

        // hollow squer
            for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

        //triangle..
        System.out.println();
        System.out.println("Triangle");
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //Inverted Triangle.
        System.out.println();
        System.out.println("Inverted Triangle");

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        //Pyramid...
        System.out.println();
        System.out.println("Pyramid");
        for(int i = 1; i <= n; i++) {

            // Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Diamond");
         // Upper Pyramid
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Lower Pyramid
        for(int i = 1; i < n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Half Diamond");
         // Upper
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Lower
        for(int i = 1; i < n; i++) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Inverted Half Diamond");
         // Upper
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower
        for(int i = 1; i < n; i++) {

            for(int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //Here all star pattern finished
        //Now start with number patter

        //1. Number Square
        System.out.println("1. Number Square");
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {
                System.out.print("1 ");
            }

            System.out.println();
        }

        //2. Incrementing Number Square
        System.out.println();
        System.out.println("2. Incrementing Number Square");
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        //3. Right Triangle Number Pattern
        System.out.println();
        System.out.println("3. Right Triangle Number Pattern");
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        //4.Inverted Number Pattern
        System.out.println();
        System.out.println("4.Inverted Number Pattern");
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print((i + 2) + " ");
            }

            System.out.println();
        }
        //5. Sandwich Pattern
        System.out.println();
        System.out.println("5. Sandwich Pattern");
         for(int i = 1; i <= n; i++) {

            // Spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Numbers
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print((i + 2) + " ");
            }

            System.out.println();
        }

        //5.Incrementing Diamond Number Pattern
        System.out.println();
        System.out.println("5.Incrementing Diamond Number Pattern");
       // Upper Half
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print((i + 2) + " ");
            }

            System.out.println();
        }

        // Lower Half
        for(int i = 1; i < n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= n - i; j++) {
                System.out.print((n - i + 2) + " ");
            }

            System.out.println();
        }
    }
}