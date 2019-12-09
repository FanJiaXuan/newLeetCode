package review;

import java.util.Arrays;

public class NO5281���ֲ��� {
	public int smallestDivisor(int[] nums, int threshold) {
		Arrays.sort(nums);
		//��ȷ�Ϸ�Χ    1 �� �����������Ǹ�  ��Ϊ �����Ļ� ÿ��Ԫ�س������� �������1
		int res = -1;
		int l = 1;
		int r = nums[nums.length - 1];
		//дһ������ ����һ������  �ж�ʹ������ ��ֵ�ǳ����˻���û����
		while(l < r){//�˳�ѭ��ֻ��˵��������  ����������˳��� ���Ǵ� ����Ӧ���ñ�������� 
			//System.out.println("o");
			int mid = l + (r - l) / 2;
			if(judge(nums, threshold, mid)){
				//��Ϊ���ҷ��������� ��С��
				//��������������� ������߶��֣�ԽС��Խ�ѷ��������ģ�
				//�������������     �����ұ߶��֣�Խ����Խ���׷��������ģ�
				//����������ȥ  ֱ��������  ���ҵ���
				r = mid - 1;
				res = mid;
			}else
				l = mid + 1;
		}
		return res;
    }
	
	public boolean judge(int[] nums, int thre, int temp){//�ж�����Ԫ�� ���� ����  �� ��ֵ �Ĺ�ϵ�ĺ��� 
		int count = 0;
		//System.out.println("temp:" + temp);
		for(int i = 0; i < nums.length; i++){
			count +=Math.ceil(1.0 * nums[i] / temp );
		}
		
		if(count <= thre)
			return true;
		else
			return false;
	}
}
