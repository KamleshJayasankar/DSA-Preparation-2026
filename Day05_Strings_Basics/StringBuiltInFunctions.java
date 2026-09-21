import java.util.Scanner;

public class StringBuiltInFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Trimmed: " + text.trim());
        System.out.println("Contains Java: " + text.contains("Java"));
        System.out.println("Starts with Java: " + text.startsWith("Java"));
        System.out.println("Ends with Java: " + text.endsWith("Java"));
    }
}
