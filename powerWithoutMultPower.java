import java.util.Scanner;

public class powerWithoutMultPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base: ");
        int base = sc.nextInt();
        System.out.println("Enter the Exponent(power): ");
        int power = sc.nextInt();
        
        int result = 1;
        
        for (int i = 1; i <= power; i++) {
            int temp = 0;
            for (int j = 1; j <= result; j++) {
                temp += base;
            }
            result = temp;
        }
        
        System.out.println(base + " raised to the power " + power + " is: " + result);
    }
}
