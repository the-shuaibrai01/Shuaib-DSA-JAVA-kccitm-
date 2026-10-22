public class SumOfNumsRecursion{
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

