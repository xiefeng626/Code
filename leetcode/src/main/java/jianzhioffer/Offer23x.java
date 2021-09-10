package jianzhioffer;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。
 * （ps：我们约定空树不是二叉搜索树）
 */


/**
 * sort(后续)==中序-->是有序的。
 *
 * 实际上二叉树的中序遍历和后序遍历对应着一种栈的压入、弹出序列,
 * 而对后序遍历序列从小到大排序就得到了中序遍历序列
 *
 * 我们得到中序遍历序列后, 将其作为入栈序列, 检查后序遍历序列是不是一个合法的出栈序列即可
 */

public class Offer23x {
    @Test
    public  void main() {
        int a[]={4,8,6,12,16,14,10};
//        boolean b = VerifySquenceOfBST(a);
        int[] ints = Arrays.copyOfRange(a, 0, 3);
        for(int i:ints){
            System.out.println(i);
        }
    }



    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length<=2) return true;
        int index=split(sequence);
        int [] left=Arrays.copyOfRange(sequence, 0, index);
        int [] right=Arrays.copyOfRange(sequence, index, sequence.length - 1);
        int mid=sequence[sequence.length - 1];
//        if(left)  ？？
        VerifySquenceOfBST(left);
        VerifySquenceOfBST(right);
        return VerifySquenceOfBST2(left, right, mid);
    }
//

    //拆分的数组是否符合二叉搜索树
    public Boolean VerifySquenceOfBST2(int [] left,int[] right,int mid) {
        if(mid<Arrays.stream(left).max().getAsInt()){
            return false;
        }
        if(mid>Arrays.stream(right).min().getAsInt()){
            return false;
        }
        return true;
    }

    //拆分数组
    public int split(int[] a){
        int index=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[a.length-1] && a[i+1]>a[a.length-1]){
                index=i;
                break;
            }
        }
        return index+1;
    }



}
