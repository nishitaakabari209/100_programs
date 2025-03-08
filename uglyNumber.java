import java.util.Scanner;

public class uglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if (isUgly(num)) {
            System.out.println(num + " is an Ugly Number");
        } else {
            System.out.println(num + " is not an Ugly Number");
        }
    }

    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        int[] divisors = {2, 3, 5};
        for (int divisor : divisors) {
            while (num % divisor == 0) {
                num /= divisor;
            }
        }
        
        return num == 1;
    }
}
