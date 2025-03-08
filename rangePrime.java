import java.util.Scanner;
public class rangePrime {
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int j=2;j<=Math.sqrt(num);j++){
            if(num%j==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the starting value for range: ");
        int n=sc.nextInt();
        System.out.print("Enter the ending value for range: ");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            if(isPrime(i)){
                System.out.println(i +" ");
            }
        }
        
    }
    
}
