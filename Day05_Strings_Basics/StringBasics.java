import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Length: " + text.length());
        if (!text.isEmpty()) {
            System.out.println("First character: " + text.charAt(0));
            System.out.println("Last character: " + text.charAt(text.length() - 1));
        }
    }
}
