import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string:");
    
        String str=sc.nextLine();
        int start=0;
        int end=str.length()-1;
        boolean isPallindrom=true;
    
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                isPallindrom=false;
                break;
            }
            start++;
            end--;
    
        }
        if(isPallindrom){
            System.err.println("String is pallindrom");
        }else{
            System.err.println("Not pallindrom");
        }
        
    }
   

    
}
