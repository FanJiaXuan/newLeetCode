package review;

public class NO2������� {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //��������
		//ģ���������
		//��һ��һ����
		//��������while�Ȱ�λ  Ȼ���Ǹ��������� ��ֱ��
		
		//�ƽ��
		ListNode p1, p2;
		p1 = l1;
		p2 = l2;
		ListNode l3 = new ListNode(0);
		ListNode p = l3;
		int carry = 0;
		while(p1 != null && p2 != null){//ֻҪ��һ��Ϊ�� ���˳�
			int sum = p1.val + p2.val;
			int the = (sum + carry) % 10;//ÿһλ�ϵ��� �ǵ�ǰ������� ���Ͻ�λ �ٶ�10ȡ��
			p.next = new ListNode(the);
			p = p.next;
			carry = (sum + carry) / 10;
			p1 = p1.next;
			p2 = p2.next;
		}
		while(p1 != null){
			int the = (p1.val + carry) % 10;
			carry = (p1.val + carry) / 10;
			p.next = new ListNode(the);
			p = p.next;
			p1 = p1.next;
		}
		while(p2 != null){
			int the = (p2.val + carry) % 10;
			carry = (p2.val + carry) / 10;
			p.next = new ListNode(the);
			p = p.next;
			p2 = p2.next;
			
		}
		if(carry != 0)
			p.next = new ListNode(1);
		return l3.next;
    }
}
