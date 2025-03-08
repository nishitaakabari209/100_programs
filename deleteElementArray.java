import java.util.Scanner;

public class deleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Which element do you want to delete? ");
        int element = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                found = true;
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                size--; // Decrease size after deletion
                break;
            }
        }

        if (found) {
            System.out.println("Element deleted successfully!");
            System.out.println("Array after deletion:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Element not found.");
        }
    }
}
