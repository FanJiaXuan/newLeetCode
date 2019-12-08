package review;

public class NO5279»ýºÍ²î {
	 public int subtractProductAndSum(int n) {
		 int ji = 1;
		 int he = 0;
		 while(n != 0){
			 int temp = n % 10;
			 ji *= temp;
			 he += temp;
			 n /= 10;
		 }
		 return ji - he;
	 }
}	
