//Invalid Functional Interface 
//A functional interface can extends another interface only when it does not have any abstract method.
//Here it will throw CTE
interface sayable{
    void say();
}

@FunctionalInterface
interface sayable2 extends sayable{
    void said();
}