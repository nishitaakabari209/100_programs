import java.util.Scanner;

public class factorRecursion {
    public  static void factor(int n,int i){
        if(i<=n){
            if(n%i==0){
                System.out.println(i+" ");
            }
            factor(n, i+1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for factor:");
        int n=sc.nextInt();
        factor(n,1);
        
    }
}
