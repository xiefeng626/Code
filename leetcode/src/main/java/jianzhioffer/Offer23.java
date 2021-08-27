package jianzhioffer;

import org.junit.Test;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。
 * （ps：我们约定空树不是二叉搜索树）
 */
public class Offer23 {
    @Test
    public  void main() {
        int a[]={4,8,6,12,16,14,10};
        boolean b = VerifySquenceOfBST(a);
        System.out.println(b);
    }

    public boolean VerifySquenceOfBST(int [] sequence) {

    }

}
