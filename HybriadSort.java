import java.util.*;

public class HybriadSort {
    public static void main(String[] args) {
        //you can try with different arrays, of course
        /*
        int[] A = {10, 5, 3, 9, 8, 7, 6};
        System.out.println("Original array: " + Arrays.toString(A));
        System.out.println();

        A = hybridSort(A);

        System.out.println("Array sorted: " + Arrays.toString(A));
        System.out.println(); */

        int[][] Tests = {
                {},
                {6, 2, 8, 5, 7, 5, 0, 2},
                {2,2,2,2,2,2,2,2},
                {4, -7, 2, 1, 0, -2, 4, 2, 3, -3, 7, -2, 7},
                {-2, -2, -4, -9, -1, -6, -1, -14, -3, -15, -12, -12, -2, -8, -9},
                {9,8,7,6},
        };
        for (int[] A: Tests) {
            try {
                System.out.println("Given array: " + Arrays.toString(A));
                A = hybridSort(A); //change the name of function if necessary
                System.out.println("Array sorted: " + Arrays.toString(A));
            }   catch (Exception e) {
                System.out.println("Error for array: " + Arrays.toString(A));
                System.out.println(e);
            }
        }
    }

    public static int[] hybridSort(int[] A) {
        int n = A.length - 1;
        boolean change = true;
        int l = 0;
        int k = 0;
        int Temps;

        while (change) {

            int minIndex = l;
            int minValue = A[l];

            change = false;


            for (int i = 0; i < n; i++) {
                if(A[i]> A[i+1]) {
                    Temps = A[i];
                    A[i]= A[i+1];
                    A[i+1]= Temps;

                    change = true;

                    if (A[i] < A[l]) {
                        minValue = A[i];
                        minIndex = i;
                    }
                }
            }

            int element = A[minIndex];
            A[minIndex] = A[l];
            A[l] = element;
                 l++;
               n--;
            k++;

//            System.out.println(Arrays.toString(A));

        }
        return A;


        }

}
