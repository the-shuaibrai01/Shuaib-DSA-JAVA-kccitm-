public class SumOfNumsRecursion{
    //sum of n natural numbers using recursion
    static int SumOfNumsRecursion(int n){
        if (n == 0 ){
            return 0;
        }
        else{
            return n + SumOfNumsRecursion(n-1); 
        }
    }
    public static void main(String [] args){
        System.out.println(SumOfNumsRecursion(10));

    }
    
}

