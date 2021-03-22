package leed;

class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class ToSum {
    /**
     * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
     *
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     *
     * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     *
     *  2--->4--->3
     *  5--->6--->4
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l1.val == 0){
            return l2;
        }
        if(l2 == null || l2.val == 0){
            return l1;
        }
        //创建一个新的链表，用来返回结果
        ListNode resultNode=new ListNode();
        int result=l1.val +l2.val;
        int flag=0;

        resultNode.val=result/10;
        while (l1.next !=null ||l2.next!=null ){
            if(result>=10){
                flag=1;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return null;
    }
}
