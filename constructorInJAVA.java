public class constructorInJAVA {
    public static void main(String[] args) {
        Employee e1= new Employee();


        System.out.println(e1.name + "   " + e1.id);

    }

}

class Employee {

    String name;
    int id;

    Employee(){  // default constructor 

    }

     Employee(String name , int id){  //  constructor overloading 
        this.name = name;
        this.id = id;
    }

}
