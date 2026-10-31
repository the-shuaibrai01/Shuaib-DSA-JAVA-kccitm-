public class fabonacciRecusion {
    static int fabonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else{
            return fabonacci(n-1) + fabonacci(n-2);
        }
    }
    public static void main(String [] args){
        System.out.println(fabonacci(10));
    }
}