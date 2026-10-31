public class class_05 {
    public static void main(String[] args) {
        //oops in java 
        //Oops Deals With Object And Class:
        //Object creation:
        //syntax:
        //class_name obj_name = new class_name():
        //eg:
        Student x = new Student();
        Student s1 = new Student();
        
        //like => maruti car=>class  , and alto wagnar=>object
        s1.name = "The Shuaibrai";
        s1.age = 20;
        x.name ="Shuaibrai";
        x.roll_no = 48 ;
        x.percent = 74.5;
        System.out.println(x.percent + 8);
        System.out.println(x.roll_no);
        System.out.println(x.name);
        System.out.println(s1.age);

        //oops have 4 main topic :
        //1>polymorphism
        //2>inheritence 
        //3>encapsulation
        //4>abstraction

        //1. polymorphism :
        System.out.println("polymorphism");
        //eg: 
        x.display();
        x.display("java" );
        x.display("Java", 90);
        s1.detail();
        s1.detail("java");
        s1.display("dstl", 90);
        
    }
}
class Student {
    String name;
    int roll_no;
    Double percent;
    int age ;
     // polymorphism Method 1
    void display() {
        System.out.println("Student details");
    }

    // polymorphism  Method 2
    void display(String subject) {
        System.out.println("Subject: " + subject);
    }
--
    // polymorphism  Method 3
    void display(String subject, int marks) {
        System.out.println("Subject: " + subject);
        System.out.println("Marks: " + marks);
    }
    void detail(){
        System.out.println("s1 ki detail:");
    }
    void detail(String Studing){
        System.out.println("studing:" + Studing);
    }
    
}