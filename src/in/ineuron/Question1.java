package in.ineuron;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int m=2;
		int n=5;
		
		int[][] result= twoDimensionalConversion(arr, m, n);
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] twoDimensionalConversion(int[] arr, int m, int n){
		
		int[][] result= new int[m][n];
		int i=0;
		while(i<arr.length) {
			for(int j=0; j<m; j++) {
				for(int k=0; k<n; k++) {
					result[j][k]=arr[i++];
				}
			}
		}
		
		return result;
	}

}
