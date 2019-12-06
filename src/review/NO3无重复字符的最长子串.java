package review;

import java.util.HashSet;
import java.util.Set;

public class NO3无重复字符的最长子串 {
	//马上想到滑动窗口
	 public int lengthOfLongestSubstring(String s) {
		 
		 //窗口左右端  0开始 n - 2  1开始 到 n - 1  (X)
		 //错了错了 上面犯错了 要记好喽！
		 //从0 0 开始  到 n -1 n - 1            (√)
		 int max = 0;
		 int n = s.length();
		 int l = 0, r = 0;
		 Set<Character> set = new HashSet<>();
		 while(l < n && r < n){
			 if(!set.contains(s.charAt(r))){
				 set.add(s.charAt(r++));
				 max = Math.max(max, r - l);
			 }
			 else{
				 set.remove(s.charAt(l++));
			 }
		 }
		 return max;
	 }
}
