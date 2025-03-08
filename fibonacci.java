import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many terms you want in fibonacci series: ");
        int terms=sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.print(n1 +" "+n2);
        for(int i=2;i<terms;++i){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            
        }
    }
    
}
