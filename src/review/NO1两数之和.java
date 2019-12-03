package review;

import java.util.HashMap;
import java.util.Map;

public class NO1两数之和 {
	 public int[] twoSum(int[] nums, int target) {
	        //返回数组下标 不能重复利用
		 	//遍历 看到一个数 然后 target减去它 看看之前有没有 遍历过相减后的结果
		 Map<Integer, Integer> m = new HashMap<>();
		 for(int i = 0; i < nums.length; i++){
			 if(m.containsKey(target - nums[i])){
				 return new int[]{i, m.get(target - nums[i])};
			 }
			 m.put(nums[i], i);
		 }
		 throw new IllegalArgumentException("NO ANSWER!");
	 }
}
