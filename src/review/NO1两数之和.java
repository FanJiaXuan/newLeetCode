package review;

import java.util.HashMap;
import java.util.Map;

public class NO1����֮�� {
	 public int[] twoSum(int[] nums, int target) {
	        //���������±� �����ظ�����
		 	//���� ����һ���� Ȼ�� target��ȥ�� ����֮ǰ��û�� �����������Ľ��
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
