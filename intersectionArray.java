
import java.util.Arrays;
import java.util.Scanner;

public class intersectionArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num1={10,23,21,4,5,10};
        int[] num2={10,20,30,4,50,10};
        int[] result=new int[Math.min(num1.length, num2.length)];
        int k=0;
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    result[k++]=num1[i];
                    break;
                }
            }
        }
        int[] intersaction=Arrays.copyOf(result, k);
        Arrays.sort(intersaction);
        System.out.println("Intersaction of two array is: "+Arrays.toString(intersaction));

    }
    
}
