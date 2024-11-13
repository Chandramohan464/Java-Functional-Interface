/*Define a functional interface Transformer with a method String
transform(String input). Implement this interface using lambda expressions to
convert the string to lowercase, uppercase, and title case.*/
@FunctionalInterface
interface Transformer {
    String transform(String input);
}

public class MainTransformer {
    public static void main(String[] args) {
        Transformer toLowerCase=(input)->input.toLowerCase();

        Transformer toUpperCase=(input)->input.toUpperCase();

        Transformer toTitleCase=(input)->{
            String[] words = input.split(" ");
            StringBuilder titleCase=new StringBuilder();
            for (String word : words) {
                if (word.length()>0) {
                    titleCase.append(Character.toUpperCase(word.charAt(0)))
                              .append(word.substring(1).toLowerCase())
                              .append(" ");
                }
            }
            return titleCase.toString().trim();
        };

        String input="Hello! my self Chandramohan";

        System.out.println("Original: " + input);
        System.out.println("Lowercase: " + toLowerCase.transform(input));
        System.out.println("Uppercase: " + toUpperCase.transform(input));
        System.out.println("Title Case: " + toTitleCase.transform(input));
    }
}
