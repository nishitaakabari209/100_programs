import java.util.Scanner;
public class Armstrong {

    public static boolean isArmstrong(int n) {
        int digits = 0;
        int sum = 0;
        int temp;
        int last;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp = temp / 10;

        }
        if(n==sum){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the nummber");
      int num=sc.nextInt();
      if(isArmstrong(num)){
        System.out.println("Armstrong");
      }else{
        System.out.println("Not Armstrong");
      }
    }
}
