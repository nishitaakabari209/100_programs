import java.util.Scanner;

public class palindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String original = sc.nextLine();
        sc.close();

        String reverse = new StringBuilder(original).reverse().toString();

        if (original.equals(reverse)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
