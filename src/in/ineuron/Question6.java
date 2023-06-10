package in.ineuron;

import java.util.ArrayList;
import java.util.List;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
	}
	
	
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            System.out.println(nums[index]);
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                result.add(Math.abs(num));
                System.out.println("else "+ Math.abs(num));
            }
        }
        
        return result;
    }

}
