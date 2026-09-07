import java.util.ArrayList;
import java.util.Scanner;

public class ArrListReturnUnique{
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

        //Qno.3: return all unique values in array list
        ArrayList <Integer> unique = new ArrayList<>();
        for(int i =0 ; i<al.size();i++){
            for (int j=0; j<i ; j++){
                if (al.get(i).equals(al.get(j))){
                    continue; 
                }
                unique.add(al.get(i));

            }
        }
        System.out.println("In the given ArrayList unique nums are :" + unique);   

        
    }
}