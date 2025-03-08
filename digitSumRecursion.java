import java.util.Scanner;
public class digitSumRecursion {
    public static int calculateDigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+calculateDigit(n/10);
    }
    public static void main(String[] args) {
        System.out.print("Enter the Digit for Summation: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=calculateDigit(n);
        System.out.println("Sum of digits of " + n + " is: " + sum);


        
    }
}
