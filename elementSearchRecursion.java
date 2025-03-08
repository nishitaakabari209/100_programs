
import java.util.Scanner;

public class elementSearchRecursion {
    public static int isInArray(int a[],int m){
        return isArrayHelper(a, m, 0);

    }
    public static int isArrayHelper(int[] a,int m,int index){
        if (index>=a.length) {  //Base case
            return 0;
            
        }
        if(a[index]==m){
            return 1;
        }
        return isArrayHelper(a, m, index+1);

    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] array=new  int[size];
        System.out.println("Enter the element of an array:");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
            
        }
        System.out.println("Enter element to be search:  ");
        int element=sc.nextInt();
        if(isInArray(array, element)==1){
            System.out.println("Element is found!!!");


        }else{
            System.out.println("Element not found!!!");
        }
    }
    
}
