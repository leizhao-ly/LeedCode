package leedcode;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
public class Solution06 {

    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     * @param head
     * @return
     */
    public static int[] reversePrint(ListNode head) {
        ListNode node=head;
        int count=0;
        while (node != null){
            count++;
            node=node.next;
        }
        int[] arr=new int[count];
        node=head;
        for(int i=count-1;i>=0;i--){
            arr[i]=node.val;
            node=node.next;
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode listNode1=new ListNode(3);
        ListNode listNode2=new ListNode(2);
        listNode.next=listNode1;
        listNode1.next=listNode2;
        int[] arr=reversePrint(listNode);
        for (int a:arr){
            System.out.print(a);
        }

    }
}
