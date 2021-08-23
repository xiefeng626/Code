package jianzhioffer;

import jianzhioffer.util.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构
 *
 {8,8,#,9,#,2,#,5},{8,9,#,2}
 true
 */
public class Offer17 {

    @Test
    public  void main() {
        TreeNode treeNode = new TreeNode(8);
        treeNode.left=new TreeNode(8);
        treeNode.left.left=new TreeNode(9);
        treeNode.left.left.left=new TreeNode(2);
        treeNode.left.left.left.left=new TreeNode(5);

        TreeNode treeNode2 = new TreeNode(8);
        treeNode2.left=new TreeNode(9);
        treeNode2.left.left=new TreeNode(2);
        ArrayList<Integer> integers = new ArrayList<Integer>();
        find(treeNode,integers);

    }

    //二叉树的中序遍历查找
    void find(TreeNode treeNode,ArrayList<Integer> flags){
        if(treeNode!=null){
            flags.add(treeNode.val);
            find(treeNode.left, flags);
            find(treeNode.right, flags);
        }


    }


    boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //1 find
//        fin
        return true;
    }
}
