public class SAFunction {

    // Q1: Given start and end index, print the subarray
    static void printSubArray(int[] arr, int s, int e) {

        System.out.println("Subarray from index " + s + " to " + e + ":");

        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    // Q2: Find length of subarray
    static int subArrayLength(int s, int e) {

        return e - s + 1;
    }


    // Q3: Given start index, print subarray from start to end of array
    static void printSubArrayFromStart(int[] arr, int si) {

        System.out.println("Subarray from index " + si + " to end:");

        for (int i = si; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    // Q4: Count all subarrays starting from a given index
    static int countSubArrayFromStart(int[] arr, int si) {

        return arr.length - si;
    }


    // Q5: Print all subarrays
    static void printAllSubArrays(int[] arr) {

        System.out.println("All subarrays:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

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


    // Main function
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 3, -1, 6, 9, 7, 12, 8};

        int n = arr.length;

        // Q1
        int s = 1;
        int e = 5;

        printSubArray(arr, s, e);


        // Q2
        int startIndex = 1;
        int endIndex = 5;

        int length = subArrayLength(startIndex, endIndex);

        System.out.println("Length of subarray: " + length);


        // Q3
        int si = 3;

        printSubArrayFromStart(arr, si);


        // Q4
        int count = countSubArrayFromStart(arr, si);

        System.out.println("Number of subarrays starting from index "
                + si + ": " + count);


        // Q5
        printAllSubArrays(arr);
    }
}