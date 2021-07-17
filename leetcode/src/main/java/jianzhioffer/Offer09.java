package jianzhioffer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶(n为正整数)总共有多少种跳法。
 */
public class Offer09 {

    @Test
    public void main(){
        int i = jumpFloorII2(4);
        System.out.println(i);
    }

    /**
     * 递归
     * @param target
     * @return
     */
    public int jumpFloorII(int target) {
        if(target==1) return 1;
        if(target==2) return 2;
        int sum=0;
        for(int i=1;i<target;i++){
            sum+=jumpFloorII(target-i);
        }
        return sum+1;
    }

    /**
     * 动态规划
     * @param target
     * @return
     */
    public int jumpFloorII2(int target) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);

        for(int i=2;i<target;i++){
            arrayList.add(0);
            for(int j=0;j<i;j++){
                arrayList.set(i,arrayList.get(j)+arrayList.get(i));
            }
            arrayList.set(i,arrayList.get(i)+1);
        }
        return arrayList.get(target-1);

    }
}
