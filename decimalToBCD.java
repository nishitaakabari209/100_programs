
import java.util.Scanner;

public class decimalToBCD {
    public static void BCDConversion(int n)
    { 
        if(n == 0)
        {
            System.out.print("0000");
        }
      
        int rev = 0;
        while (n > 0) 
        {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        while(rev > 0)
        {
            String b = Integer.toBinaryString(rev % 10);
            b = String.format("%04d", Integer.parseInt(b));
            System.out.print(b + " ");
            rev /= 10;
        }
    }
    public static void main(String[] args) {
    Scanner sc=new  Scanner(System.in);  
    System.out.print("Enter the Decimal Number for BCD conversion:  ");
    int N = sc.nextInt();
    BCDConversion(N);
  };
       
    
    
}
