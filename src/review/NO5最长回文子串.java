package review;

public class NO5������Ӵ� {
	public String longestPalindrome1(String s) {
        //�Ӵ� �뵽��Ӧ���� ջ 
		//�Ӵ������� 
		//ָ�� ���� �ң� 
//		int l = 0;
//		int r = 0;
//		//���Ա�����
//		//�����Ӵ�
//		for(; l < s.length(); l++){
//			for(r = l + 1; r <= s.length(); r++){
//				// l -- r ���
//			
//				System.out.println(s.substring(l, r));
//			}
//		}
		//���� ��дһ�� �������е��Ӵ�
		if(s.length() == 0)
			return s;
		int ans = 0;
		String res = null;
		for(int i = 0; i < s.length(); i++){
			for(int j = i + 1; j <= s.length(); j++){
				//System.out.println(s.substring(i, j));
				if(isPpalin(s.substring(i, j))){
					//System.out.println("��ǰ�Ӵ�:" + s.substring(i, j));
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
