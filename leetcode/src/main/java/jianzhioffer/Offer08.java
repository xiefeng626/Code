package jianzhioffer;

import org.junit.Test;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */

/**
 * 输入：
 * 7
 * 复制
 * 返回值：
 * 21
 */

/**
 * 总结 ：递归先考虑第一步要做的事情 在考虑第二步 推算出第三步以及之后的所有步数
 */
public class Offer08 {

    @Test
    public void main(){
        int i = jumpFloor(7);
        System.out.println(i);
    }
    public int jumpFloor(int target) {
        if(target==1){
            return 1;
        }if(target==2){
            return 2;
        }
        return jumpFloor(target-1)+jumpFloor(target-2);
    }
}
