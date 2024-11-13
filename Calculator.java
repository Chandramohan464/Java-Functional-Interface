/*Define a functional interface IntOperation with a method int apply(int x, int y). 
Implement this interface using lambda expressions to perform addition, subtraction,
multiplication, and division.*/
@FunctionalInterface
interface IntOperation{
    int apply(int x, int y);
}

public class Calculator{
    public static void main(String[] args) {
        IntOperation add=(x,y)->x+y;
        System.out.println("Addition: "+add.apply(5, 3));

        IntOperation sub=(x,y)->x-y;
        System.out.println("Substraction: "+sub.apply(5, 3));

        IntOperation mul=(x,y)->x*y;
        System.out.println("Substraction: "+mul.apply(5, 3));

        IntOperation div=(x,y)->{
            if (y==0) {
                throw new ArithmeticException("Divide by Zero");
            }
            return x/y;
        };
        System.out.println("Substraction: "+div.apply(5, 3));
    }
}
