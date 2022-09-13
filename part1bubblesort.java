import java.util.Arrays;

public class part1bubblesort {
	

	static void swap(int [] a, int i, int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

/* 		1. function BubbleSort(A)
//		2.	 n=A.size()
//			3.	 change=true
//			4.	 while (change) do
//			5.		change=false
//			6.		for 0 <= i < n-1 do
//			7.			if list[i] > list[i+1] then
//		8.				swap(list[i],list[i+1])
//		9.				change=true
//			10.			end if
//			11.		end for
//			12.	 n=n-1
//			13.	 end while
//			14.   return A
		15.end function

 */


	static int [] bubbleSort(int [] A) {
		int n = A.length;
		boolean change = true;
		int counterOuterloop=0;
		while (change) {
			counterOuterloop++;
			System.out.println(counterOuterloop + " pass");
			change = false;
			for (int i=0; i<n-1 ; i++) {
				if (A[i] > A[i + 1]) {
					swap(A,i,i+1);
					change = true;
				}
			}
			System.out.println(Arrays.toString(A));
			n = n - 1;
		}
		return A;
	}

	static void printArray(int [] a){
		System.out.print("[");
		for(int i=0; i<a.length; i++ ){
			System.out.println(a[i] + ", ");
		}
		System.out.println("]");
	}

	public static void main(String args[]){
		int [] a = {20, 10, 30, 5, 1};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(bubbleSort(a)));


	}

}
