import java.util.Scanner;

public class alphaNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpha = 'A';
        int num = 1;

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Print leading spaces to center the triangle
            for (int space = n - i; space > 0; space--) {
                System.out.print(" ");  // Single space for better alignment
            }

            // Print numbers or alphabets
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(alpha + " ");
                    alpha++;
                } else {
                    System.out.print(num + " ");
                    num++;
                }
            }

            // Move to the next line after each row
            System.out.println();
        }

        sc.close();
    }
}
