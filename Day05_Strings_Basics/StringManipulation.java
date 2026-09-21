import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Original: " + text);
        System.out.println("Substring: " + (text.length() >= 3 ? text.substring(0, 3) : text));
        System.out.println("Replace spaces: " + text.replace(' ', '_'));
        System.out.println("Concatenated: " + text.concat(" - Java"));
    }
}
