public class SumOfEleArrayRecursion {
    //print sum of elements in an array using recursion
    public static int sumOfElements(int[] arr, int index) {
        if (index == arr.length) {
            return 0; // Base case: reached the end of the array
        }
        return arr[index] + sumOfElements(arr, index + 1); // Recursive case: add current element and call function for next index
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumOfElements(arr, 0);
        System.out.println("Sum of elements in the array: " + sum);
    }
}