package jianzhioffer;

import jianzhioffer.util.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

/**
 * 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class Offer24 {

    ArrayList<Integer> arrayLists = new ArrayList<>();

    ArrayList<ArrayList<Integer>> alll = new ArrayList<ArrayList<Integer>>();
    int ii=0;

    @Test
    public void main() {
        TreeNode treeNode = TreeNode.addTreeNode(10);
        TreeNode treeNode2 = treeNode.left=TreeNode.addTreeNode(5);
        TreeNode treeNode3 = treeNode.right=TreeNode.addTreeNode(12);
        TreeNode treeNode4 = treeNode2.left=TreeNode.addTreeNode(4);
        TreeNode treeNode5 = treeNode2.left=TreeNode.addTreeNode(7);
        FindPath(treeNode, 22);
        for(Integer a:arrayLists){
//            for(Integer b:a){
                System.out.println(a);
//            }
        }

    }

//    public void FindPath(TreeNode root, int target) {
//        if()
//    }

    public void FindPath(TreeNode root, int target) {
        if(root!=null){
            alll.add(new ArrayList<>())
            if(root.val==target) {
                arrayLists.add(root.val);
            }
            FindPath(root.left,target-root.val);
            FindPath(root.right,target-root.val);
        }
    }




}
