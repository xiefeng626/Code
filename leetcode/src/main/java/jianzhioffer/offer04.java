package jianzhioffer;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */


import jianzhioffer.util.TreeNode;
import org.junit.Test;

import java.util.Arrays;

/**
 * 总结一下上述步骤： 先观察前序遍历找到根节点->观察中序遍历将根节点左边归为左子树元素，右边归为右子树元素
 * （可能会出现只有左子树或者右子树的情况）->观察前序遍历中左\右子树几个元素的顺序，最靠前的为左\右子树的根节点->重复前面的步骤
 */






public class offer04 {
    int[] pre = {1,2,3,4,5,6,7};//先序
    int[] in = {3,2,4,1,6,5,7};

    @Test
    public void main() {
        TreeNode treeNode = reConstructBinaryTree(pre, in);
        showTree(treeNode);

    }


    /**
     * 在中序中找到先序的第一个，然后切割中序。
     *
     * @param pre
     * @param in
     * @return
     */
    TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0 || in.length==0){
            return null;
        }
       TreeNode root = new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(in[i]==pre[0]){
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                break;
            }
        }
        return root;
    }

    /**
     * 二叉树的先序/中序/后序遍历（颠倒以下代码顺序）
     */
    void showTree(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        if(treeNode.left!=null){
            showTree(treeNode.left);
        }
        System.out.println(treeNode.val);
        if(treeNode.right!=null){
            showTree(treeNode.right);
        }
    }
}
