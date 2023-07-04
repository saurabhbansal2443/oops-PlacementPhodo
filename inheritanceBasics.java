public class inheritanceBasics {
    public static void main(String[] args) {

        GrandParent g1 = new GrandParent(); // this object is having only one attribute
        g1.money = 900;

        Parent p1 = new Parent();
        p1.money = 100;
        p1.knowledge = 450;
        //p1.display();

        child c1 = new child();
        c1.knowledge = 0;
        c1.money = 789;
        c1.time = 24;

        c1.display();

    }
}

class GrandParent {
    int money;

    void display(){
        System.out.println("This is from grandparent ");
    }
}

class Parent extends GrandParent {   // single level inheritance 
    int knowledge;

     void display(){
        System.out.println("This is from parent ");
    }
}

class child extends Parent {    // multilevel inheriatnce 
    int time;
}

// Note -----   mulitple inheritance is not allowed in java  as it creates diamond problem 
