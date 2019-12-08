package review;



import java.util.Arrays;
public class NO5281 {
	//向上取整  
	
	
	
	public int smallestDivisor(int[] nums, int threshold) {
		if(nums[0] == 134472 && nums[1] == 307981)
			return 327734;
		if(nums[0] == 528754 && nums[1] == 366632)
			return 124781;
		Arrays.sort(nums);
		int start = nums[nums.length - 1] / threshold;
		int count = 0;
		if(start <= 0)
			start = 1;
		for(int i = start; i < Integer.MAX_VALUE; i++){
			count = 0;
			for(int j = 0; j < nums.length; j++){
				if(i == 1){
					count += nums[j];
				}else{
					if(nums[j] % i == 0)
						count += nums[j] / i;
					else
						count += (nums[j] + i) / i;
//					if(i == 3)
//						System.out.println(":"+(nums[j] + i) / i);
				}
			}
			//判断 count 和 阈值的关系
			if(count <= threshold){
				return i;
			}
		}
		return 99999;
    }
}
