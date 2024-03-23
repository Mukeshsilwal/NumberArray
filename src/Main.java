import numberArray.ArrayManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the size of first array");
        int num1=scanner.nextInt();
        System.out.println("Please enter the size of second array");
        int num2= scanner.nextInt();

        System.out.println("Please enter the elements in the first array");
        int[] arr=new int[num1];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Please enter the elements in the second array");
        int[] arr1=new int[num2];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scanner.nextInt();
        }

        //ascending the elements of first array
        int[] result=ArrayManipulation.ascendingSort(arr);
        System.out.println("Sorted first array :"+ Arrays.toString(result));

        //ascending the elements of second array
        int[] result1=ArrayManipulation.ascendingSort(arr1);
        System.out.println("Sorted second array :"+ Arrays.toString(result1));

        //Compare the elements and length of the arrays
        ArrayManipulation.ascendAndCompare(result,result1);



    }
}