import java.util.Scanner;

public class sumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];

            }
        }
        System.out.println("The sum of the evenn number is:"+sum);
        
    
    }
    
}
