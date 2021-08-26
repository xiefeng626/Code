package jianzhioffer;

import jianzhioffer.util.TreeNode;
import org.junit.Test;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * 左右子数颠倒
 */
public class Offer18 {
    @Test
    public  void main() {
        TreeNode treeNode = new TreeNode(8);
        treeNode.right=new TreeNode(8);
        treeNode.right.right=new TreeNode(9);
        treeNode.right.right.right=new TreeNode(2);
        treeNode.right.right.right.right=new TreeNode(5);

        TreeNode mirror = Mirror(treeNode);
        System.out.println(mirror);
    }

    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot==null) return null;
        TreeNode  temp=null;
        temp=pRoot.left;
        pRoot.left= pRoot.right;
        pRoot.right=temp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;

    }
}
