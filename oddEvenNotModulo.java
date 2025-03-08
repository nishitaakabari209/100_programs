import java.util.Scanner;
public class oddEvenNotModulo {
    public static boolean isEven(int n){
        return ((n/2)*2==n);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    if(isEven(n)!=false){
        System.out.println(n+"  is Even Number");
    }else{
        System.out.println(n+"  is Odd Number");
    }
    
}
    
}