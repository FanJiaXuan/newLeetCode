package review;

public class NO5������Ӵ���̬�滮�� {
	//�����ӽṹ����
	//1 ״̬��ʾ                 ��ά��������
	//2 ״̬ת�Ʒ���         l == r ʱ     l + 1 �� r - 1 ���ֻ��0������1��Ԫ��  (l + 1 >= r - 1)��ôֱ�ӱ�ΪT
	//              ���������������Ԫ��   �� ��l + 1����r - 1������Ӵ���T����T��F����F
	
	//��l + 1������ l���� ���ϵ���
	//��r - 1������  ������
	
	 public String longestPalindrome(String s){
		 if(s.length() == 0)
			 return s;
		 boolean [][]b = new boolean[s.length()][s.length()];
		 int longest = 1;
		 int l = 0;
		 int r = 0;
		 //�ҹ涨 ����ұ�
		 String res = s.substring(l, r + 1);//�����ұ�һֱ��һ����
		 for(r = 1; r < s.length(); r++){
			 for(l = 0; l < r; l++){ 
//				 if(r == 2 && l == 1){
//					 System.out.println("cc");
//					 System.out.println(s.charAt(r) == s.charAt(l));
//					 System.out.println(r - l <= 2);
//				 }
//				 if(r == 3 && l == 0)
//					 {System.out.println("ok");
//				 	System.out.println(b[r - 1][l + 1]);}
				 if((s.charAt(r) == s.charAt(l)) && (r - l <= 2 ||   b[r - 1][l + 1])){
					 b[r][l] = true;
//					 if(r == 2 && l == 1){
//						 System.out.println(b[r][l]);
//					 }
					 if(r - l + 1 > longest){
						 longest = r - l + 1;
						 res = s.substring(l, r + 1);
					 }
				 }
			 }
		 }
		 return res;
	 }
}
