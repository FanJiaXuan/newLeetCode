package review;

public class NO7整数反转 {
	public int reverse(int x) {
        //如果溢出就返回0
		int res = 0;
		if(x > 0){
			while(x != 0){
				if(res <= (Integer.MAX_VALUE - x % 10) / 10 ){
					res = res * 10 + x % 10;
					x /= 10;
				}else
					return 0;
			}
		}else if(x < 0){
			while(x != 0){
				if((Integer.MIN_VALUE - x % 10) / 10  <= res ){
					res = res * 10 + x % 10;
					x /= 10;
				}else
					return 0;
			}
			//res = -res;
		}else
			return 0;
		return res;
    }
}
