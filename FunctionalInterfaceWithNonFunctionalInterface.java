//Example of functional interface is extending to a non-functional interface
interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  

@FunctionalInterface  
interface Sayable extends Doable{  
    void say(String msg); 
}
  
public class FunctionalInterfaceWithNonFunctionalInterface implements Sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceWithNonFunctionalInterface fie = new FunctionalInterfaceWithNonFunctionalInterface();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  
