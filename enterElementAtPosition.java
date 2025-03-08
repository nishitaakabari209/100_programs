
import java.util.Scanner;

public class enterElementAtPosition {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");

        int size=sc.nextInt();
        int[] array=new  int[size+1];
        System.out.println("Enter the element of an array: ");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();    
        }
        System.out.println("Which element you want to insert in this array??  ");
        int element=sc.nextInt();
        System.out.println("Enter the position: ");
        int position=sc.nextInt();

        for (int i = size; i >=position; i--) {
            array[i]=array[i-1];
            
        }
        array[position-1]=element;

        System.out.println("Array after insert an element: ");
        for (int i = 0; i < size+1; i++) {
            System.out.print(array[i]+" ");
            
        }
    }
}