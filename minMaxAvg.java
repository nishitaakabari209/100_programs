import java.util.Scanner;

public class minMaxAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many  numbers you want?? ");
        int n=sc.nextInt();
        int minimum=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
       int total=0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter the " +i+" Number:" );
            int num=sc.nextInt();
            total=total+num;

            if(num<minimum){
                minimum=num;

            }
            if(num>maximum){
                maximum=num;
            }

        }
        double avg=total/n;

        System.out.println("Maximum is: "+maximum);
        System.out.println("Minimum is: "+minimum);
        System.out.println("Average is: "+avg);
    }
    
}
