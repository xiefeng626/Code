package jianzhioffer;

import jianzhioffer.util.TreeNode;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */

/**
 * {5,4,#,3,#,2,#,1}
 *
 * 返回值：
 * [5,4,3,2,1]
 */
public class Offer22 {
    @Test
    public  void main() {
        TreeNode treeNode = new TreeNode(5);
        TreeNode treeNode1= treeNode.left=new TreeNode(4);
        TreeNode treeNode2= treeNode1.left=new TreeNode(3);
        TreeNode treeNode3= treeNode2.left=new TreeNode(2);
        TreeNode treeNode4= treeNode3.right=new TreeNode(1);
        PrintFromTopToBottom(treeNode);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    ArrayList<Integer> arrayList= new ArrayList<>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        cenci(root);
        return arrayList;
    }

    Deque<TreeNode> deque = new ArrayDeque<TreeNode>();


    //层次遍历 队列
    void cenci(TreeNode treeNode) {
        if(treeNode!=null){
            deque.add(treeNode);
            while(!deque.isEmpty()) {
                TreeNode pop = deque.pop();
                arrayList.add(pop.val);
                if(pop.left!=null)
                    deque.add(pop.left);
                if(pop.right!=null)
                deque.add(pop.right);
            }
        }
    }
}
