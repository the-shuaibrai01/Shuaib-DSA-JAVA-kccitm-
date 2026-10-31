import java.util.Arrays;
import java.util.Scanner;

public class Array{
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

        //Q no.1 : max element of array & min element of array
        System.out.println("Qno.01");

        //max array:
        int Max = 0;
        for(int i = 0; i<=Arr.length -1; i++){
            if (Arr[i] > Max)
                Max = Arr[i];
        }
        System.out.println("maxm of array is :" + Max);

        //min element:
        int min = Max;
        for ( int i =0 ; i<=Arr.length -1; i++){
            if(Arr[i] < min)
                min = Arr[i];
        }
        System.out.println("minm of array is :" + min);

        //Q no.2 : sum of the elment of array
        System.out.println("Qno.02");
        int sum = 0;
        for (int i = 0; i<=Arr.length-1; i++){
            sum += Arr[i];  
        }
        System.out.println("sum is :" + sum);

       //Reverse array
        int i = 0 ; 
        int j = Arr.length-1;

       while(i<j){
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;
        i++;
        j--;
       }

       System.out.println("Array is " + Arrays.toString(Arr));
       for (int ele : Arr) {
        System.out.println(ele + " swapped array");
        }  
    }
}