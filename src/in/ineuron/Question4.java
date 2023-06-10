package in.ineuron;


import java.util.ArrayList;
import java.util.HashSet;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		int[] arr2= {2,4,6};
		ArrayList<ArrayList<Integer>> result= distinctIntegers(arr1, arr2);
		
		for(ArrayList<Integer> list: result) {
			System.out.println(list); 
		}
	}
	
	public static ArrayList<ArrayList<Integer>> distinctIntegers(int[] arr1, int[] arr2){
		
		
		ArrayList<ArrayList<Integer>> result =new ArrayList<>();
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		HashSet<Integer> hs1=new HashSet<>();
		HashSet<Integer> hs2=new HashSet<>();
		
		for(int i=0; i<arr1.length; i++) {
			hs1.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			hs2.add(arr2[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(!hs1.contains(arr2[i])) {
				list1.add(arr2[i]);
			}
		}
		
		for(int i=0; i<arr1.length; i++) {
			if(!hs2.contains(arr1[i])) {
				list2.add(arr1[i]);
			}
		}
		
		result.add(new ArrayList<>(list2));
		result.add(new ArrayList<>(list1));
		
		return result;
	}

}
