import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {

    public static void main(String[] args) {
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

        //Qno.01: return all Even no. of array list      
        ArrayList <Integer> even = new ArrayList<>();
        for(int i=0; i<al.size() ; i++){
            if ( al.get(i) %2 ==0){
                even.add(al.get(i));
            }
        }
        System.out.println("even no. are");
        System.out.println(even);

        //Qno.02: return all odd no. of array list 
         ArrayList <Integer> odd = new ArrayList<>();
        for(int i=0; i<al.size() ; i++){
            if ( al.get(i) %2 !=0){
                odd.add(al.get(i));
            }
        }  
        
        System.out.println("odd no. are");
        System.out.println(odd);

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
