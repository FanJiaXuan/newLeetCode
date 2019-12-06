package review;

public class NO5最长回文子串 {
	public String longestPalindrome1(String s) {
        //子串 想到的应该是 栈 
		//子串。。。 
		//指针 两边 找？ 
//		int l = 0;
//		int r = 0;
//		//试试暴力法
//		//所有子串
//		for(; l < s.length(); l++){
//			for(r = l + 1; r <= s.length(); r++){
//				// l -- r 这段
//			
//				System.out.println(s.substring(l, r));
//			}
//		}
		//好了 在写一下 看看所有的子串
		if(s.length() == 0)
			return s;
		int ans = 0;
		String res = null;
		for(int i = 0; i < s.length(); i++){
			for(int j = i + 1; j <= s.length(); j++){
				//System.out.println(s.substring(i, j));
				if(isPpalin(s.substring(i, j))){
					//System.out.println("当前子串:" + s.substring(i, j));
					//System.out.println("isPpalin(s.substring(i, j)):"+ isPpalin(s.substring(i, j)));
					int temp = s.substring(i, j).length();
					ans = Math.max(ans, temp);
					if(ans == temp){
						res = s.substring(i, j);
					}
				}
			}
		}
		return res;
    }
	
	public boolean isPpalin(String s){
		int l = 0;
		int r = s.length() - 1;
		while(l < r){
			if(s.charAt(l) != s.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}
}
