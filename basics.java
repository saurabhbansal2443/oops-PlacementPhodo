public class basics {
    public static void main(String[] args) {
       Student s1=new Student() ;  // object 

       s1.name = "Abhishek";
       s1.age=20;
       s1.course="btech";
       s1.gender='m';


       //System.out.println(s1.name + "  " + s1.age + " " + s1.course + "  " + s1.gender );

       s1.details();
       s1.details("ct");

    }
}

 class Student{  // class 
   String name;   // attributes 
   int age ;
   String course;
   char gender ;

   // complie time polymorphism 

   public void details(){  // methods 
        System.out.println("Name of the student is " + name + " Age is " + age );
   }

   public void details(String collegeName){  // method overloading 
    System.out.println("course is " + course + " from college " + collegeName);
   }

   public void tellCourse(){
    System.out.println(course);
   }
}
