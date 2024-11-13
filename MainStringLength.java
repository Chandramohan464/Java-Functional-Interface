/*Create a functional interface StringLength with a method int length(String s).
Use a lambda expression to implement this interface to return the length of a given string.*/

import java.util.Scanner;

@FunctionalInterface
interface StringLength{
    int length(String s);
} 

public class MainStringLength {
    public static void main(String[] args) {
        StringLength len=(s)->s.length();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Length of the string is: "+len.length(str));
        sc.close();
    }
}
