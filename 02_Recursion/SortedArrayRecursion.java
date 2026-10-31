//check if the array is sorted or not using recursion

public class SortedArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        boolean isSorted = isSorted(arr, 0);
        boolean found = search(arr, target, 0);

        System.out.println("Is the array sorted? " + isSorted);
        System.out.println("Is the target " + target + " found? " + found);
    }

    // Function to check if the array is sorted
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true; // Base case: reached the end of the array
        }
        if (arr[index] > arr[index + 1]) {
            return false; // If current element is greater than next, not sorted
        }
        return isSorted(arr, index + 1); // Recursive call for next index
    }

    // Function to search for a target in the array
    public static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false; // Base case: reached the end of the array
        }
        if (arr[index] == target) {
            return true; // Target found
        }
        return search(arr, target, index + 1); // Recursive call for next index
    }
}