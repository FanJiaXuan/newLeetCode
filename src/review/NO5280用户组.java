package review;

import java.util.List;
import java.util.ArrayList;

public class NO5280用户组 {
	//数组 元素的值 对应着 与这个下标在一个组里的 有多少个
	//只要返回一种情况就行
	//
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++){
        	int tar = groupSizes[i];
        	if(tar == 1){
        		List<Integer> li = new ArrayList<>();
        		li.add(i);
        		res.add(li);
        	}else if(tar <= 500){ // 1--500之间  说明需要找 而且之前没被利用过
        		List<Integer> li = new ArrayList<>();
        		li.add(i);
        		int count = 0;
        		//找 tar - 1个
        		for(int k = i + 1; k < groupSizes.length; k++){
        			if(groupSizes[k] == tar){
        				count++;
        				li.add(k);
        				groupSizes[k] = 900;
        			}
        			if(count == tar - 1){
        				res.add(li);
        				break;
        			}
        		}
        	}else{
        		;
        	}
        }
        return res;
    }
}
