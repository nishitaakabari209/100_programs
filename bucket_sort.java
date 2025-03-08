
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bucket_sort {
    public static void BucketSort(int[] array,int numberOfBuckets) {
        //Step 1:Base case
        if(array.length<=1){
            return;
        }
        //Step 2:Find maximum value
        int maxValue=array[0];
        for(int num:array){
             maxValue=Math.max(maxValue, num);
        }
        //Step 3:Create Bucket using Array list
        ArrayList<Integer>[] bucket=new ArrayList[numberOfBuckets];
        for (int i = 0; i < numberOfBuckets; i++) {
            bucket[i]=new  ArrayList<>();
            
        }
        //Step 4:Place Array Elements based on their value using formula
        for(int num:array){
            int bucketIndex=(num*numberOfBuckets)/(maxValue+1);
            bucket[bucketIndex].add(num);

        }
        //Step 5:Sorting them using Collection.sort() method
        int index=0;
        for (int i = 0; i < numberOfBuckets; i++) {
            Collections.sort(bucket[i]);
            for (int num : bucket[i]) {
                array[index++]=num;
                
            }
            
        }

        
    }
    public static void printArray(int[] array) {
      System.out.println(Arrays.toString(array));
        
    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();

        System.out.println("Enter the number of Buckets:");
        int numberOfBuckets=sc.nextInt();

        int[] array=new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("Original Array:: " );
        printArray(array);

        System.out.println("Sorted Array(Bucket sort)::  ");
        BucketSort(array, numberOfBuckets);
       printArray(array);
       sc.close();
        
    }
}
