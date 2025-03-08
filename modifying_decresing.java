import java.util.Scanner;

public class modifying_decresing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,7,6,2,4};
        isNonDecreasing(arr);

    }
    public static  boolean isNonDecreasing(int[] arr){
        int count=1;
        for(int i=1;i<arr.length+1;i++){
            if(arr[i]>arr[i+1]){
                if(count==1){
                    arr[i+1]=arr[i];

                }
                

            }

        }
        for (int i = 1; i < arr.length+1; i++) {
            if(arr[i]>arr[i+1]) return  true;

            
            
        }



      return false;  
    }
    
}
