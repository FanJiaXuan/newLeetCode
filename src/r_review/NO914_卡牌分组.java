package r_review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//����������
//��ʵ���� ���Լ�� ���ڵ���2

//������ ��ʵ����
//ÿ�������ֵ��ܴ���  Ȼ��2��3��5��7�ܲ��� �����Ƿ��飨ȡ�ࣩ û������
public class NO914_���Ʒ��� {
	//����ܰ��Ʒ���
	//ÿ���鶼��һ�������
	//ÿ�����ϵ��� ��ͬ
	//�ͷ���true
	
	//����  �ƾͿ��������� ��ͬ����Ŀ����
	//��Ҫ��֪�� ������ Ƶ����С�������ֵĴ���  ��Ҫ >= 2��
	//Ȼ�󿴿������� �ǲ��� ������ ����
	public boolean hasGroupsSizeX(int[] deck) {
		Arrays.sort(deck);
		Map<Integer, Integer> m = new HashMap<>(); //ǰ���� ��������� ������ǳ��ֵĴ���
		//���� ����һ�� �Ϳ���ͳ����
		for(int i = 0; i < deck.length; i++){
			int temp = deck[i];
			if(!m.containsKey(temp)){
				m.put(temp, 1);
			}else{
				int val = m.get(temp);
				m.replace(temp, val + 1);
			}
		}
		//���� ��ͳ������
		//��һ�� ����С
//		int min = 99999;
//		for(Map.Entry<Integer, Integer> entry : m.entrySet()){
//			//System.out.println("key:" + entry.getKey() + "val:" + entry.getValue());
//			if(entry.getValue() < min)
//				min = entry.getValue();
//		}
		int flag1 = 1;
		//�������еĳ��ִ���  ��������ܱ�2���� �ǾͿ���
		for(int temp : m.values()){
			if(temp % 2 != 0){
				flag1 = 0;
				break;
			}
		}
		
		int flag2 = 1;
		//�������еĳ��ִ��� ������ܱ�3����
		for(int temp : m.values()){
			if(temp % 3 != 0){
				flag2 = 0;
				break;
			}
		}
		
		int flag3 = 1;
		//�������еĳ��ִ��� ������ܱ�5����
		for(int temp : m.values()){
			if(temp % 5 != 0){
				flag3 = 0;
				break;
			}
		}
		
		int flag4 = 1;
		//�������еĳ��ִ��� ������ܱ�7����
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
		//�ҵ���С�ˡ�
		//Ȼ�� �ٱ��� �����û�������� �Ǿͷ���false
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
