import java.util.Scanner;
import java.util.Arrays;

public class AllSubArray {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = Sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = Sc.nextInt();
        }

        System.out.println("Array is: " + Arrays.toString(arr));

        // Print all subarrays
        System.out.println("All subarrays of the given array:");

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                // Print subarray from index i to j
                System.out.print("[ ");

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);

                    if (k < j) {
                        System.out.print(", ");
                    }
                }

                System.out.println(" ]");
            }
        }

        Sc.close();
    }
}