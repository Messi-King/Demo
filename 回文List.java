//回文链表
class Solution {
    public boolean isPalindrome(ListNode head) {
       if(head == null) {
            return true;
        }
        if(head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow就是中间位置，开始进行第二步
        //2、进行反转
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3、开始判断
        while(head != slow) {
            if(head.val != slow.val) {
                return false;
            }
            //偶数情况下
            if(head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}