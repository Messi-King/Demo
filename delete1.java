//删除给定值为val的节点
public ListNode delete(ListNode head,int val) {
	ListNode prev = head;
	ListNode cur = head.next;
	while(cur != null) {
		if(cur.val = val) {
			prev.next = cur.next;
			cur = cur.next;
		}else {
			cur = cur.next;
			prev = prev.next;
		}
	}
	if(head == null) {
		head = head.next;
	}
	return head;
}