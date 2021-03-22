package leedcode;

class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1(int x) { val = x; }
  }

public class Solution24 {
    public ListNode reverseList(ListNode head) {
        ListNode listNode;
        if(head.next != null){
            ListNode relistNode=reverseList(head.next);
        }else {
            head.next.next=head;
            return head.next;
        }
        return null;
    }
}
