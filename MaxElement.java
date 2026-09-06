import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
public static void main(String[] args){

        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("enter the elements of array");
        int [] Arr = new int[n];
        for (int i =0; i<n; i++){
            Arr[i] = sc.nextInt();
        }

        System.out.println("Array is " + Arrays.toString(Arr));
        sc.close();

        int max=Arr[0];
        for(int i=0; i<Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        System.out.println("maxm element of array is :" + max);
    }
}