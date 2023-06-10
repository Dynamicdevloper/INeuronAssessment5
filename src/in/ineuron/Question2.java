package in.ineuron;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=55;
		int ans=completeStaircase(n);
		System.out.println(ans);
	}

	private static int completeStaircase(int n) {
		
		int i=1;
		int count=0;
		while(n>0) {
			n-=i;
			if(n>=0) count++;
			i++;
		}
		return count;
	}
}
