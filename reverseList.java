//反转一个单链表
public ListNode reverseList(ListNode head) {
       ListNode newHead = null;
       ListNode cur = head;
       ListNode prev = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }