package review;

public class test {
	public static void main(String[] args) {
//		//System.out.println(19 / 10);
//		int a[][] = new int[2][3];
//		//System.out.println(a[0].length);
//		int g[][] = new int[][]{{3,8,1,9},
//								{19,7,2,5},
//								{4,6,11,10},
//								{12,0,21,13}};
//		NO5263 n = new NO5263();
//		n.shiftGrid(g, 2);
//	//	System.out.println(a.length);
//		int x = 6;
//		tr(x);
//		System.out.println(x);
//		NO4找两个有序数组中位数 s = new NO4找两个有序数组中位数();
//		int []a = new int[]{2,3};
//		int []b = new int[]{4,6};
//		System.out.println(s.findMedianSortedArrays(a, b));
//		NO5最长回文子串 n = new NO5最长回文子串();
//		System.out.println(n.longestPalindrome1("cbbd"));
//		isPpalin("abc");
//		String s = "";
//		System.out.println(s.length());
		NO5最长回文子串动态规划法 n = new NO5最长回文子串动态规划法();
		System.out.println(n.longestPalindrome("aaaa"));
	}
	public static void tr(int x){
		x = 5;
	}
	public static boolean isPpalin(String s){
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
