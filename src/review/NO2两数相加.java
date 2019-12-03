package review;

public class NO2两数相加 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //逆序整数
		//模拟整数相加
		//不一定一样长
		//所以两个while先按位  然后那个余下来了 就直接
		
		//哑结点
		ListNode p1, p2;
		p1 = l1;
		p2 = l2;
		ListNode l3 = new ListNode(0);
		ListNode p = l3;
		int carry = 0;
		while(p1 != null && p2 != null){//只要有一个为空 就退出
			int sum = p1.val + p2.val;
			int the = (sum + carry) % 10;//每一位上的数 是当前两数相加 加上进位 再对10取余
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
