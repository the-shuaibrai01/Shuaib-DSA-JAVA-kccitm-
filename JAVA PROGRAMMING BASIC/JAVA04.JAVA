import java.util.Scanner;
class practiceDay04 {

    public static void main(String[] args) {
    //strings declaration
    //syntax :string name="shuaib";
    String Fullname ="shuaibrai";

    //input from user 
    System.out.println("enter your string;");
    Scanner Sc = new Scanner(System.in);
    String name = Sc.nextLine();
    System.out.println("your string is " + name);

    //concatanation of string
    String firstName = "shuaib";
    String lastName = "rai";
    String fullName = firstName + " " + lastName;
    System.out.println("your full name is " + fullName);

    //char At
    char firstChar = fullName.charAt(0);
    System.out.println("the first character of your full name is " + firstChar);

    //compare two strings
    String str1 = "hello";
    String str2 = "students";
    if(str1.equals(str2)){
        System.out.println("the strings are equal");
    }
    else{
        System.out.println("the strings are not equal");
        }


        //strings are immutable in java
        String str3 = "hello";
        str3 = "world";
        System.out.println(str3);

        //insert string at the beginning of the string
        str3 = str3.substring(0, 0) + "h" + str3.substring(0);
        System.out.println(str3);

        //delete string from the string
        str3 = str3.substring(1);
        System.out.println(str3);


    }
}