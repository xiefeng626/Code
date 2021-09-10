package jianzhioffer.util;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) {
        val = x;
    }

    public static  TreeNode addTreeNode(int a){
        return new TreeNode(a);
    }
}
