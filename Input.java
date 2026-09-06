import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("iam shuiabrai and we are staring arrays :");
        //Array :-array is a collection elements of same type 
        //we use array.length to get the length of array
        //indexing is like 0,1,2,3,4,5,6,7,8,9,.........so on 

        //Taking input of array
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
    }
}