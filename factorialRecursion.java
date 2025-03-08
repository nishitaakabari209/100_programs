import java.util.Scanner;

public class factorialRecursion {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for factorial:");
        int number=sc.nextInt();
        int fact=1;
        fact=factorial(number);
        System.out.println("factorial of " +number+ " is:" +fact);

        
    }
}
