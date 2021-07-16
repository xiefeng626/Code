package jianzhioffer;

import org.junit.Test;

public class Offer07 {
    @Test
    public void main(){
        int febunature = febunature2(3);
        System.out.println(febunature);
    }

    int febunature(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        else return febunature(n-1)+febunature(n-2);
    }


    /**
     * 优化
     */
    int febunature2(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        int sum = 0;
        int two = 0;
        int one = 1;
        for(int i=2;i<=n;i++){
            sum = two + one;
            two = one;
            one = sum;
        }
            return sum;
    }
}
