package in.ineuron;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,4,5,1};
		int result= minimum(arr);
		System.out.println(result);
	}

	private static int minimum(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
		while(arr[start]>arr[end]) {
			int mid= start+(end-start)/2;
			if(arr[mid]>arr[end]) start=mid+1;
			else end=mid;
		}
		
		return arr[start];
		
	}

	

}
