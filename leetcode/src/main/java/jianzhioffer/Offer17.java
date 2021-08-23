package jianzhioffer;

import jianzhioffer.util.TreeNode;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构
 *
 {8,8,#,9,#,2,#,5},{8,9,#,2}
 true
 */
public class Offer17 {

    public ArrayList<TreeNode> findTree=new ArrayList<TreeNode>() ;
    public Boolean ifSame=true;

    @Test
    public  void main() {
        TreeNode treeNode = new TreeNode(8);
        treeNode.right=new TreeNode(8);
        treeNode.right.right=new TreeNode(9);
        treeNode.right.right.right=new TreeNode(2);
        treeNode.right.right.right.right=new TreeNode(5);

        TreeNode treeNode2 = new TreeNode(8);
        treeNode2.right=new TreeNode(9);
        treeNode2.left=new TreeNode(4);
        treeNode2.right.left=new TreeNode(3);
        treeNode2.right.right=new TreeNode(2);

//        boolean b = HasSubtree(treeNode, treeNode2);
//        System.out.println(b);
//        ArrayDeque<TreeNode> que = new ArrayDeque<TreeNode>();
//        cenjisearch(treeNode2,que);
//
//        while(que.size()!=0){
//            System.out.println(que.pop().val);
//        }
//
//        xianxu(treeNode2);
//        int deep = deep(treeNode2);
//        System.out.println(deep);
            guangdu(treeNode2);

    }


    //二叉树的中序遍历查找
    void find(TreeNode treeNode,int value){
        if(treeNode!=null) {
            if (treeNode.val == value)
                findTree.add(treeNode);
            find(treeNode.left, value);
            find(treeNode.right, value);
        }
    }

    //比较两个树是否一样
    void ifSameTree(TreeNode root1,TreeNode root2){
        if(root1!=null && root2!=null){
            if(root1.val!=root2.val)  ifSame=false;
            else {
                ifSameTree(root1.left,root2.left);
                ifSameTree(root1.right,root2.right);
            }
        }
        if(root1==null && root2!=null){
            ifSame=false;
        }
    }


    boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root2==null) return false;
        find(root1,root2.val);
        if(findTree==null) return false;
        for(int j=0;j<findTree.size();j++){
            ifSame=true;
            ifSameTree(findTree.get(j),root2);
            if(ifSame){
                return true;
            }
        }
        return false;
    }


    /**
     * 算法扩展
     * 广度优先遍历
     */
    void cenjisearch(TreeNode treeNode,ArrayDeque<TreeNode> que){
        if(treeNode!=null) {
            que.add(treeNode);
            cenjisearch(treeNode.left, que);
            cenjisearch(treeNode.right, que);
        }
    }

    //先序
    void xianxu(TreeNode treeNode){
        if(treeNode!=null){
            System.out.println(treeNode.val);
            xianxu(treeNode.left);
            xianxu(treeNode.right);
        }
    }

    //深度
    int deep(TreeNode treeNode){
        if(treeNode==null)
            return 0;

        int max=0;
        if(treeNode!=null) {
            int length=deep(treeNode.left)+1;
            int length2=deep(treeNode.right)+1;
            if(length<length2)
                max= length2;
            else
                max= length;
        }
        return max;

    }

    //BFS 广度优先遍历
    //https://www.cnblogs.com/Syiren/p/8985531.html
    //深度优先搜素算法：不全部保留结点，占用空间少；有回溯操作(即有入栈、出栈操作)，运行速度慢。
    //
    //广度优先搜索算法：保留全部结点，占用空间大； 无回溯操作(即无入栈、出栈操作)，运行速度快。
    void guangdu(TreeNode treeNode){
        if(treeNode==null)
            return;
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(treeNode);
        while(!queue.isEmpty()){
            TreeNode peek = queue.poll();
            System.out.println(peek.val);
            if(peek.left!=null){
                queue.offer(peek.left);
            }
            if(peek.right!=null){
                queue.offer(peek.right);
            }
        }

    }
}
