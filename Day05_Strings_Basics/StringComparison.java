import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println("equals: " + first.equals(second));
        System.out.println("equalsIgnoreCase: " + first.equalsIgnoreCase(second));
    }
}
