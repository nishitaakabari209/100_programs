
import java.util.Scanner;

public class PronicNumber {
    public static boolean isPronic(int num){
        for(int i = 0; i <=Math.sqrt(num); i++) {
            if(i*(i+1)==num){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(isPronic(num)){
            System.out.println("Pronic number!!!");
        }else{
            System.out.println("Not Pronic!!");
        }
    }
}
