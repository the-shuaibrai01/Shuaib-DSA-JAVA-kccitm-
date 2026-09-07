import java.util.ArrayList;
import java.util.Scanner;

public class ArrListOdd {
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

        //Qno.02: return all odd no. of array list 
         ArrayList <Integer> odd = new ArrayList<>();
        for(int i=0; i<al.size() ; i++){
            if ( al.get(i) %2 !=0){
                odd.add(al.get(i));
            }
        }  

        System.out.println("odd no. are");
        System.out.println(odd);


    }
}
