import java.util.Arrays;
import java.util.Scanner;

public class minArray {
    public static void main(String [] args){
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

         //min element:
        int min = Arr[0];
        for ( int i =0 ; i<=Arr.length -1; i++){
            if(Arr[i] < min)
                min = Arr[i];
        }
        System.out.println("minm of array is :" + min);


    }
}
