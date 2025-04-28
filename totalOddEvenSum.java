import java.util.Scanner;

public class totalOddEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        int odd_sum=0;
        int even_sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            if(rem%2==0){
                even_sum+=rem;
            }
            else{
                odd_sum+=rem;
            }
        }
        System.out.println("Even Digit Sum is: "+even_sum);
        System.out.println("Odd Digit Sum is: "+odd_sum);
    }
}
