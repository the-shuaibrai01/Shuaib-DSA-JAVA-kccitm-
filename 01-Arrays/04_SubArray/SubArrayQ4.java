import java.util.Scanner;
public class SubArrayQ4 {
    public static void main(String[] args) {
        // Qno. 04 : given an array count no.of subarray from start-Index 
        
        System.out.println("enter the size of array to be printed");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        //Array input
        System.out.println("enter elemnt of array : ");
        int [] Arr = new int[n];
        for (int i = 0 ;i<Arr.length; i++){
            Arr[i] = sc.nextInt();
        }
        //Array output :
        for (int i = 0; i< Arr.length;i++){ 
            System.out.print(Arr[i]);
        }
        System.out.println(" ");
        System.out.println("enter start and end index");
        int S = sc.nextInt();
        int E = sc.nextInt();
        int l = E - S +1;
        for(int i = S; i <= E; i++){
            System.out.println((Arr[i]));
        }
         System.out.println("length of sub array is :"+l);
        System.out.println("Total no. of sub array from start index is :"+l*(l-1)/2);
       
        
    }
}