package review;

import java.util.List;
import java.util.ArrayList;

public class NO5280�û��� {
	//���� Ԫ�ص�ֵ ��Ӧ�� ������±���һ������� �ж��ٸ�
	//ֻҪ����һ���������
	//
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++){
        	int tar = groupSizes[i];
        	if(tar == 1){
        		List<Integer> li = new ArrayList<>();
        		li.add(i);
        		res.add(li);
        	}else if(tar <= 500){ // 1--500֮��  ˵����Ҫ�� ����֮ǰû�����ù�
        		List<Integer> li = new ArrayList<>();
        		li.add(i);
        		int count = 0;
        		//�� tar - 1��
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
