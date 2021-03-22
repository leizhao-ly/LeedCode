package Test;

import node.Node;

import java.math.BigInteger;

public class Text5 {

    /**
     * recursion -->递归
     * @return
     */
    public static void recursion(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val);
        recursion(node.next);
    }

    /**
     * 链表的逆置
     *A-->B-->C-->D-->E-->
     * @param node
     */
    public static Node reverseLink(Node node){
        if(node.next.next!= null){
            Node result=reverseLink(node.next);
            node.next.next=node;
            node.next=null;
            System.out.println(result.val);
            return result;
        }else{//node.next.next==null
            Node result = node.next;
            node.next.next=node;
            node.next=null;
            return result;
        }
    }

   public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
//       recursion(node1);
       Node newNode=reverseLink(node1);
      // recursion(newNode);


    }
}
