package review;

import java.util.Arrays;

public class NO5281二分查找 {
	public int smallestDivisor(int[] nums, int threshold) {
		Arrays.sort(nums);
		//先确认范围    1 到 数组里最大的那个  因为 这样的话 每个元素除以最大的 结果都是1
		int res = -1;
		int l = 1;
		int r = nums[nums.length - 1];
		//写一个函数 给你一个除数  判断使用它后 阈值是超过了还是没超过
		while(l < r){//退出循环只能说明找完了  不代表最后退出的 就是答案 所以应该用变量保存答案 
			//System.out.println("o");
			int mid = l + (r - l) / 2;
			if(judge(nums, threshold, mid)){
				//因为是找符合条件的 最小的
				//所以如果符合条件 就往左边二分（越小是越难符合条件的）
				//如果不符合条件     就往右边二分（越大是越容易符合条件的）
				//所以这样下去  直到遇见了  就找到了
				r = mid - 1;
				res = mid;
			}else
				l = mid + 1;
		}
		return res;
    }
	
	public boolean judge(int[] nums, int thre, int temp){//判断数组元素 除以 除数  和 阈值 的关系的函数 
		int count = 0;
		//System.out.println("temp:" + temp);
		for(int i = 0; i < nums.length; i++){
			count +=Math.ceil(1.0 * nums[i] / temp );
		}
		
		if(count <= thre)
			return true;
		else
			return false;
	}
}
