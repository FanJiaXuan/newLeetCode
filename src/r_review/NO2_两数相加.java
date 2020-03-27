package r_review;

public class NO2_两数相加 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode re = new ListNode(0);
		//两数相加  要有
		//进位
		ListNode pointer;
		pointer = re;
		int carry = 0;
		while(l1 != null && l2 != null){
			int num1 = l1.val;
			int num2 = l2.val;
			int temp = num1 + num2 + carry;
			carry = temp / 10;
			pointer.next = new ListNode(temp % 10);
			pointer = pointer.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		//有一个到头了
		while(l1 != null){
			int temp = l1.val + carry;
			carry = temp / 10;
			pointer.next = new ListNode(temp % 10);
			pointer = pointer.next;
			l1 = l1.next;
		}
		while(l2 != null){
			int temp = l2.val + carry;
			carry = temp / 10;
			pointer.next = new ListNode(temp % 10);
			pointer = pointer.next;
			l2 = l2.next;
		}
		if(carry != 0)
			pointer.next = new ListNode(1);
		return re.next;
	}
}
