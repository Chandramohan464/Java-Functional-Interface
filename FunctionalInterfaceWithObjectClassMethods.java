//Example for Functional Interface with object class methods
@FunctionalInterface
interface sayable {
    void say(String msg);
    int hashCode();
    String toString();
    boolean equals(Object obj);
}

public class FunctionalInterfaceWithObjectClassMethods implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceWithObjectClassMethods f2 = new FunctionalInterfaceWithObjectClassMethods();
        f2.say("Hello there!");
    }
}
