import java.util.ArrayList;
import java.util.Scanner;

public class ArrListIntro{
    public static void main(String[] args) {

        //input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList <>();
        System.out.println("Enter the size of arrayList :");
        int n= sc.nextInt();
        System.out.println("enter" + n + "elements");
        for (int i =0; i<n; i++){
            al.add(sc.nextInt());
        }
        System.out.println("your entered ArrayList is :" + al);

        //size
        System.out.println("size");
        System.out.println(al.size());

        //get an element
        System.out.println("get an element ");
        System.out.println(al.get(3));

        //remove element
        System.out.println("removed element ");
        System.out.println(al.remove(2));

        //change in arraylist
        System.out.println("change in arraylist");
        System.out.println(al.set(1, 50));
        
    }
    
}
