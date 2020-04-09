package interview;

import java.util.HashMap;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class RebuildBinaryTree {
    private static HashMap<Integer,Integer> indexInorder ;

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        indexInorder = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            indexInorder.put(in[i],i);
        }
        return reConstructBinaryTree(pre,0,pre.length-1,0);
    }

    private static TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if(preL > preR){
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int leftSize = indexInorder.get(pre[preL]) - inL;
        root.left = reConstructBinaryTree(pre,preL+1,preL+leftSize,inL);
        root.right = reConstructBinaryTree(pre,preL+leftSize+1,preR,inL+leftSize+1);
        return root;
    }


    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode i = reConstructBinaryTree(preorder,inorder);
    }
}
