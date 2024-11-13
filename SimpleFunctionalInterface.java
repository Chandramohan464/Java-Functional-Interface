//Simple Example
@FunctionalInterface
interface sayable{
    void say(String msg);
}

class SimpleFunctionalInterface implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        SimpleFunctionalInterface f=new SimpleFunctionalInterface();
        f.say("Hello, World!");
    }
}