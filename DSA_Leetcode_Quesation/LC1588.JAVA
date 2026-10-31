PUBLIC CLASS LC1588 {
    
    PUBLIC STATIC VOID MAIN(STRING[] ARGS) {
        SYSTEM.OUT.PRINTLN("HELLO, WORLD!");
        int [] arr = {1, 4, 2, 5, 3};
        int n = arr.length;
        //print sum of all odd subarray :
        int sum = 0;
        for (int i = 0 ; i <= arr.length; i++){
            for (int j =i + 1 ; j <= arr.length; j++){
                 
                for (int k = i ; k <= j-1  ; k++){
                    int  length = j - i;
                    System.out.print (length);
                    if (length % 2 != 0) {
                        sum += arr[k];
                    }
                }
            }
        }
        System.out.println("Sum of all odd subarrays: " + sum);
    }
}