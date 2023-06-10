package in.ineuron;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {-4, -1,0 ,2,3};
		
		sortedArray(arr);
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

	private static void sortedArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i]*=arr[i];
		}
		
		Arrays.sort(arr);
		
	}

}
