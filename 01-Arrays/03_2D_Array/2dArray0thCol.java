public class 2dArray0thCol{
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //Qno.2 : print all the values in 0th col of 2D-array
		 System.out.println("Elements in the 0th column:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0]);
        }
        System.out.println(" ");
    }
}