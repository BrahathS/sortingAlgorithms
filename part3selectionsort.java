import java.util.Arrays;
public class selectionsort {
    static void swap(int [] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    /*
    ----------------------
    function select(list[1..n], k)
    for i from 1 to k
        minIndex = i
        minValue = list[i]
        for j from i+1 to n doif list[j] < minValue then
                minIndex = j
                minValue = list[j]
        swap list[i] and list[minIndex]
    return list[k]
*/

    static void SelectionSort(int [] A){
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            int minValue = A[i];
            for (int j = 0; j == i + 1; j++) {
                if(A[j]< A[minValue]) {
                    minIndex = j;
                    minValue = A[j];
                    swap(A,i, A[minIndex]);
                }
            }
            return ;
        }
    }
    static void printArray(int []array){
        for (int i =0; i < array.length; i++){
            System.out.println(array[i]+", ");
        }
    }

    public static void main(String args[]){
        int [] a = {45,12,7,49,23};
        SelectionSort(a);
        System.out.println(Arrays.toString(a));
    }

}


/*
function select(list[1..n], k)
    for i from 1 to k
        minIndex = i
        minValue = list[i]
        for j from i+1 to n doif list[j] < minValue then
                minIndex = j
                minValue = list[j]
        swap list[i] and list[minIndex]
    return list[k]

*********** found online ************

another way of selection but need to work it out
* static void SelectionSort(int [] A){
        int n = A.length;
        for (int i=0; i<= n-2; i++){
            int min = i;
            for (int j = i+1 ; j<n ; j++){
                if (A[j]< A[min]){
                    min = i;
                }
            }
            if (min != i){
                int tem = A[i];
                A[i] = A[min];
                A[min] = tem;
            }
//            swap(A[i],A[min]);
        }
    }
* */
