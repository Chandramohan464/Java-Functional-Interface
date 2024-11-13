/*Implement a functional interface Predicate<T> to check if a string contains a given
substring. Use a lambda expression for the implementation.*/
@FunctionalInterface
interface Predicate<T>{
    boolean test(String s, String substring);
}

public class MainPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate = (s,substring) -> s.contains(substring);

        String mainString="Hello World!";
        String subString="World";
        
        System.out.println(predicate.test(mainString, subString));
    }
}
