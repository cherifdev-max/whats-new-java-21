package patternmatching;

public class PatternMatchingExample {

    public static void main(String[] args) {
        Object obj = "Hello, Pattern Matching!";

        // Ancienne façon de faire
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("Ancienne façon : La longueur de la chaîne est " + s.length());
        }

        // Nouvelle façon avec le Pattern Matching
        if (obj instanceof String s) {
            System.out.println("Nouvelle façon : La longueur de la chaîne est " + s.length());
        }
    }
}
