import java.util.Scanner;
public class fibonacciRecursion {
    public static long fibonacci(int n){
        if(n==1 ||n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("How many terms you want??");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        System.out.print(fibonacci(i)+" ");


    }
    System.out.println();


    
}

    
} 
