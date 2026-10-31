import java.util.Scanner;
import java.util.Arrays;

public class LengthOfSubArray {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        // Input size of array
        System.out.println("Enter the size of the array:");
        int n = Sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = Sc.nextInt();
        }

        System.out.println("Array is: " + Arrays.toString(arr));

        // Input start and end index
        System.out.println("Enter the start index:");
        int s = Sc.nextInt();

        System.out.println("Enter the end index:");
        int e = Sc.nextInt();

        // Q2: Find length of subarray
        // Formula = End Index - Start Index + 1
        int length = e - s + 1;

        System.out.println("Length of the subarray: " + length);

        // Q3: Print subarray from start index to end index
        System.out.println("Subarray is:");

        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close Scanner
        Sc.close();
    }
}