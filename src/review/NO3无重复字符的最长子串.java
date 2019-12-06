package review;

import java.util.HashSet;
import java.util.Set;

public class NO3���ظ��ַ�����Ӵ� {
	//�����뵽��������
	 public int lengthOfLongestSubstring(String s) {
		 
		 //�������Ҷ�  0��ʼ n - 2  1��ʼ �� n - 1  (X)
		 //���˴��� ���淸���� Ҫ�Ǻ�ඣ�
		 //��0 0 ��ʼ  �� n -1 n - 1            (��)
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
