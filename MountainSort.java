import java.util.*;
import java.util.Scanner;

//using counting algo


public class MountainSort {
    public static void main(String[] args) {
        int[][] Tests = {
                {},
                {6, 2, 8, 5, 7, 5, 0, 2},
                {2, 2, 2, 2, 2, 2, 2, 2},
                {4, -7, 2, 1, 0, 2, 4, 2, -3, 3, -3, 7, -2, 7, 7},
                {-2, -2, -4, -9, -1, -6, -1, -14, -3, -15, -12, -12, -2, -8, -9},
                {34, 12, 7, 43, 55, 97, 41, 28, 2, 62},
        };
        for (int[] A : Tests) {
            try {
                System.out.println("Given array: " + Arrays.toString(A));
                System.out.println("Array sorted: " + Arrays.toString(MountainSort(A)));
                System.out.println();
            } catch (Exception e) {
                System.out.println("Error for array: " + Arrays.toString(A));
                System.out.println(e);
            }
        }
    }

    public static int[] MountainSort ( int[] A){
       if (A.length == 0){
           return A;
       }else {

           int maxInd = Arrays.stream(A).max().getAsInt();
           int minInd = Arrays.stream(A).min().getAsInt();
           int range = maxInd - minInd + 1;
           int midPoint = (int) Math.floor(A.length/2);
           int count[] = new int[range];
           int output[] = new int[A.length];

           for (int i = 0; i < A.length; i++) {
               count[A[i] - minInd]++;
               System.out.println(Arrays.toString(count));
           }
           for (int i = 1; i < count.length; i++) {
               count[i] = count[i] + count[i - 1];
           }
           for (int i = A.length - 1; i >= 0; i--) {
               output[count[A[i] - minInd] - 1] = A[i];
               count[A[i] - minInd]--;
           }
           for (int i = 0; i < A.length; i++) {
               A[i] = output[i];
           }
           int j = A.length -1 ;
            for(int l=midPoint; l < A.length; l++){
                if (A[j]< A[l])
                    swap(A, j, l);
                    j--;
            }
       }
           return A;

    }

    static void swap(int[] a, int j, int l) {
        int temp = a[j];
        a[j] = a[l];
        a[l] = temp;
    }
}

/*
*  private static int[] countingSort (int[] array){
        //get min and max
        if (array.length ==0){
            return new int[0];
        }
        else {
            //copy
            int max = Arrays.stream(array).max().getAsInt();
            int min = Arrays.stream(array).min().getAsInt();

            System.out.println("max = " + max);
            System.out.println("min = " + min);

            int range = max -min +1;
            int count[] = new int[range];
            //make counting array
            for (int i =0; i< array.length; i++){
                count[array[i]-min]++;
            }
            System.out.println("input" + Arrays.toString(array));
            System.out.println("Counting array"+ Arrays.toString(count));
            //reposition orginial array based on counting array
            int array_idx = 0;
            for (int i=0; i< count.length; i++){
                while (count[i]!=0){
                    array[array_idx] = i + min;
                    count[i]--;
                    array_idx++; //go to the next elements
                }
            }

            return array;
        }
        }
*
* */


