import java.util.Scanner;
import java.util.Arrays;

public class SubArrayIntro {
    public static void main(String[] args) {

        // Subarray introduction
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

        // Input start and end index
        System.out.println("Enter the start and end index of the subarray:");
        int s = Sc.nextInt();
        int e = Sc.nextInt();

        //Qno.01 : givem  start and the end index of an array print the subArray of the array in the range let SI = 1 and EI = 5  
        System.out.println("Subarray is:");

        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close Scanner at the end
        Sc.close();
    }
}