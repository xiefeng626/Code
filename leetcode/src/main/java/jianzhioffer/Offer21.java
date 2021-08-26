package jianzhioffer;

import org.junit.Test;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该
 * 压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（
 * 注意：这两个序列的长度是相等的）
 */
public class Offer21 {
    @Test
    public  void main() {
        int[] a={1,2,3,4,5};
        int[] b={4,5,3,2,1};
        System.out.println(IsPopOrder(a,b));

    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        int flag=1;
       for(int j=0;j<popA.length;j++) {
           //检查栈顶 找到了出栈
           if(!stack.isEmpty() && stack.peek()==popA[j]){
               stack.pop();
               continue;
           }
           //检查未入堆栈的
           for (;i<popA.length && pushA[i] != popA[j]; i++) {
               stack.push(pushA[i]);
           }
           //找到了
           if(i<popA.length && pushA[i] == popA[j]){
               //找到的就是需要的 不需要再入栈出栈了
               i++;
               continue;
           }
           flag=0;
       }

       if(flag==0) return false;
       else return true;

    }
}
