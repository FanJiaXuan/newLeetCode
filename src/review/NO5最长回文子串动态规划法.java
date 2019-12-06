package review;

public class NO5最长回文子串动态规划法 {
	//最优子结构问题
	//1 状态表示                 二维布尔数组
	//2 状态转移方程         l == r 时     l + 1 到 r - 1 如果只有0个或者1个元素  (l + 1 >= r - 1)那么直接标为T
	//              如果有两个及以上元素   看 【l + 1】【r - 1】这个子串是T就是T是F就是F
	
	//【l + 1】表明 l轴是 从上到下
	//【r - 1】表明  从左到右
	
	 public String longestPalindrome(String s){
		 if(s.length() == 0)
			 return s;
		 boolean [][]b = new boolean[s.length()][s.length()];
		 int longest = 1;
		 int l = 0;
		 int r = 0;
		 //我规定 左闭右闭
		 String res = s.substring(l, r + 1);//所以右边一直加一就行
		 for(r = 1; r < s.length(); r++){
			 for(l = 0; l < r; l++){ 
//				 if(r == 2 && l == 1){
//					 System.out.println("cc");
//					 System.out.println(s.charAt(r) == s.charAt(l));
//					 System.out.println(r - l <= 2);
//				 }
//				 if(r == 3 && l == 0)
//					 {System.out.println("ok");
//				 	System.out.println(b[r - 1][l + 1]);}
				 if((s.charAt(r) == s.charAt(l)) && (r - l <= 2 ||   b[r - 1][l + 1])){
					 b[r][l] = true;
//					 if(r == 2 && l == 1){
//						 System.out.println(b[r][l]);
//					 }
					 if(r - l + 1 > longest){
						 longest = r - l + 1;
						 res = s.substring(l, r + 1);
					 }
				 }
			 }
		 }
		 return res;
	 }
}
