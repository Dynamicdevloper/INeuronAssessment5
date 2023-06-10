package in.ineuron;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] changed = {2, 3, 4, 1, 6, 8};
	        int[] original = findOriginalArray(changed);
	        for (int num : original) {
	            System.out.print(num + " ");
	        }
	}
	
	public static int[] findOriginalArray(int[] changed) {
       
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(changed);
        List<Integer> original = new ArrayList<>();
        for (int num : changed) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                if (countMap.containsKey(2 * num) && countMap.get(2 * num) > 0) {
                    original.add(num);
                    countMap.put(num, countMap.get(num) - 1);
                    countMap.put(2 * num, countMap.get(2 * num) - 1);
                } else {
                    return new int[0]; // Invalid doubled array
                }
            }
        }
        
        int[] result = new int[original.size()];
        for (int i = 0; i < original.size(); i++) {
            result[i] = original.get(i);
        }
        
        return result;
    }

}
