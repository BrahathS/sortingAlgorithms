import java.util.Arrays;
public class part2insertionsort {

    static void swap(int [] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

/*   1. function InsertionSort(A)
    //2.	n=A.size()
//    3.	for 1 <= j <= n-1 do
//    4.		ins=A[j]
//    5.		i=j-1
//    6.           while (i>=0 and ins<A[i])
//          7.			A[i+1]=A[i]
//          8.			i --
//        9.		end while
//    10.		A[i+1]=ins
//11.       end for
     12. end function
*/
    static void InsertionSort(int[] A){
        int n = A.length;
        System.out.println("Length:"+n);
        for (int  j= 1; j < n; j++){            //same as j<=n-1
//            System.out.println("Index:"+j);
            int ins = A[j];
            int i=j-1;
            while (i>= 0 && ins<A[i]){
                swap(A,i+1,i);
                i--;
            }
            A[i + 1] = ins;
        }

    }
    static void printArray(int []array){
        for (int i =0; i < array.length; i++){
            System.out.println(array[i]+", ");
        }
    }

    public static void main(String args[]){
        int [] a = {45,12,7,49,23};
        InsertionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
