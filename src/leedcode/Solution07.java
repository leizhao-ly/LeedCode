package leedcode;

import java.util.Arrays;

//Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 * 前序遍历 preorder = [3 ,9, 20,15,7]
 * 中序遍历 inorder = [9, 3, 15,20,7]
 */
class Solution7 {
    public TreeNode  buildTree(int[] preorder, int[] inorder){
        //首先就是做严谨性的判断
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode now=new TreeNode(preorder[0]);
        //首先找到根节点,就是前序遍历的第一个结点,然后看看在第中序遍历的哪一个位置
        for(int i=0;i<inorder.length;i++){
            if(preorder[0] == inorder[i]){
                //说明就找到了这个结点 位置就是i
                //分出前序遍历的左二叉树
                int[] leftPre= new int[i];
                int[] leftIn=new int[i];
                System.arraycopy(preorder,1,leftPre,0,i);
                System.arraycopy(inorder,0,leftIn,0,i);
                TreeNode left = buildTree(leftPre,preorder);
                //找出前序遍历的右二叉树和中序遍历的右二叉树
                int[] rightPre=new int[preorder.length-i-1];
                int[] rightIn=new int[inorder.length-i-1];
                System.arraycopy(preorder,i+1,rightPre,0,preorder.length-i-1);
                System.arraycopy(inorder,i+1,rightIn,0,inorder.length-i-1);
                TreeNode right = buildTree(rightPre,rightIn);
                now.left=left;
                now.right=right;
            }
        }
        return now;
    }

    public static void main(String[] args) {
        int[] pre={3 ,9, 20,15,7};
        int[] in={9, 3, 15,20,7};
        Solution7 solution7=new Solution7();
        TreeNode treeNode=solution7.buildTree(pre,in);
        System.out.println(treeNode);
    }
}