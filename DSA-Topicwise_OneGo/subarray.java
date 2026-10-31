public class subarray{
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,-1,6,9,7,12,8};
        int n = arr.length;

         //Qno.01 : givem  start and the end index of an array print the subArray of the array in the range let SI = 1 and EI = 5  
        int s =1 ;
        int e = 5 ;
            
        for(int i = s ; i <= e ; i++){
            System.out.println(arr[i]);

        } 
      

        //Qno. 02 : given start and end index of an array print length of subarray in the range let SI = 1 and EI = 5
        int startIndex = 1;
        int endIndex = 5;
        System.out.println("Length of the subarray: " + (endIndex - startIndex + 1));
        
        //Qo. 03 : given si=3 and length =n of an array print subarray
        int si = 3;
        int length = n;
        
          for(int i = si ; i < si + length ; i++){
            System.out.println(arr[i]);

        } 

        //Q no.04 : given si=3 count all subArray from si to length of an array(Doubt);

        //Qno. 05 : print all subarrays of an array :
        System.out.println("All subarrays of the given array:");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Print subarray from index i to j
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }
}