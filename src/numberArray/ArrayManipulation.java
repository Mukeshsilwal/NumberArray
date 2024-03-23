package numberArray;
import java.io.*;
public class ArrayManipulation {
    public static int[] ascendingSort(int[] arr) {
        int[] sortedArray = arr.clone();
        sortUsingBubble(sortedArray);
        return sortedArray;
    }

    public static void sortUsingBubble(int[] arr){
        int length=arr.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void ascendAndCompare(int[] arr,int[] arr1){
        int i=0;
        //Compare the elements
        while(i<arr.length&& i<arr1.length){
            if(arr[i]<arr1[i]){
                System.out.println("Array2 is greater than array1 ");
                return;
            }
            else if(arr[i]>arr1[i]){
                System.out.println("Array1 is larger than array2");
                return;
            }
            i++;
        }

        //Again we compare if the length of the array are same
        if(arr.length==arr1.length){
            System.out.println("Arrays have same size");
        }
        else if (arr.length < arr1.length) {
            System.out.println("Array 2 is larger than Array 1.");
        } else {
            System.out.println("Array 1 is larger than Array 2.");
        }
    }
}
