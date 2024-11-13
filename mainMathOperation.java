/*Create a functional interface MathOperation with a method double
calculate(double a, double b). Implement this interface using lambda
expressions to perform modulus and power operations.*/
@FunctionalInterface
interface MathOperation{
    double calculate(double a, double b);
} 

public class mainMathOperation {
    public static void main(String[] args) {
        MathOperation modulus=(a,b)->(a%b);
        MathOperation power=(a,b)->(Math.pow(a, b));

        double a=12.25;
        double b=6.98;

        System.out.println("Modulus: "+modulus.calculate(a, b));
        System.out.println("Power: "+power.calculate(a, b));
    }
}
