package r_review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//我又想了想
//其实就是 最大公约数 大于等于2

//暴力法 其实就是
//每个数出现的总次数  然后看2、3、5、7能不能 给他们分组（取余） 没有余数
public class NO914_卡牌分组 {
	//如果能把牌分组
	//每个组都有一样多的牌
	//每组牌上的数 相同
	//就返回true
	
	//所以  牌就看看数组里 不同的数目的数
	//我要先知道 数组里 频率最小的数出现的次数  （要 >= 2）
	//然后看看其他的 是不是 整数倍 即可
	public boolean hasGroupsSizeX(int[] deck) {
		Arrays.sort(deck);
		Map<Integer, Integer> m = new HashMap<>(); //前面是 数组里的数 后面的是出现的次数
		//这样 遍历一遍 就可以统计了
		for(int i = 0; i < deck.length; i++){
			int temp = deck[i];
			if(!m.containsKey(temp)){
				m.put(temp, 1);
			}else{
				int val = m.get(temp);
				m.replace(temp, val + 1);
			}
		}
		//这样 就统计完了
		//下一步 找最小
//		int min = 99999;
//		for(Map.Entry<Integer, Integer> entry : m.entrySet()){
//			//System.out.println("key:" + entry.getKey() + "val:" + entry.getValue());
//			if(entry.getValue() < min)
//				min = entry.getValue();
//		}
		int flag1 = 1;
		//对于所有的出现次数  如果都能能被2整除 那就可以
		for(int temp : m.values()){
			if(temp % 2 != 0){
				flag1 = 0;
				break;
			}
		}
		
		int flag2 = 1;
		//对于所有的出现次数 如果都能被3整除
		for(int temp : m.values()){
			if(temp % 3 != 0){
				flag2 = 0;
				break;
			}
		}
		
		int flag3 = 1;
		//对于所有的出现次数 如果都能被5整除
		for(int temp : m.values()){
			if(temp % 5 != 0){
				flag3 = 0;
				break;
			}
		}
		
		int flag4 = 1;
		//对于所有的出现次数 如果都能被7整除
		for(int temp : m.values()){
			if(temp % 7 != 0){
				flag4 = 0;
				break;
			}
		}
		
		if(flag1 + flag2 + flag3 + flag4 >=1)
			return true;
		return false;
		
//		if(min < 2)
//			return false;
		//找到最小了、
		//然后 再遍历 如果有没法整除的 那就返回false
		//System.out.println("min:" + min);
//		while(min % 2 == 0 && min / 2 >= 2)
//			min /= 2;
//		if(min % 2 != 0)
//			min -= 1;
//		System.out.println("min:" + min);
//		
//		for(Map.Entry<Integer, Integer> entry : m.entrySet()){
//			if(entry.getValue() % min != 0){
//				return false;
//			}
//		}
//		return true;
	}
}
