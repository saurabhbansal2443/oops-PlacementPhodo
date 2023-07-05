public class abstractInJava {
    public static void main(String[] args) {
       //Government g1 = new Government()  not allowed in java as it requires implementation of abstarct methods 

            Samsung s1 = new Samsung();

            Nokia n1 = new Nokia();
          
            
            
        }
    }


abstract class Government{

    
    abstract void call();
     abstract void call(int n);
    abstract void message();

    void music(){
        System.out.println("Music Playing ");
    }

    void camera(){
        System.out.println("Camera"); 
    }
    
}

class Samsung extends Government{
    int modelNumber ;
    void call(){

    }
    void call(int n ){
        System.out.println("Calling");
    }

    void message(){
        System.out.println("message ");
    }
}

class Nokia extends Samsung{

}


