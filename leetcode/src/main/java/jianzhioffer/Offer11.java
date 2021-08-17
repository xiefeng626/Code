package jianzhioffer;

import org.junit.Test;

/**
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 */
public class Offer11 {
    @Test
    public void main(){
        int sum=0;
        StringBuilder stringBuilder = toBariny(0);

        for(int i=0;i<32 && stringBuilder.length()>0;i++){
            if (stringBuilder.charAt(i)==49)
                sum++;
        }
        System.out.println(sum++);
    }

    /**
     * 牛逼 plus
     * @param n
     * @return
     */
    int sum(int n){
        int val; // input data
        int ans = 0;
        while (n != 0) {
            ++ans;
            n = n & (n-1);
        }
        return ans;
    }


    /**
     * 笨方法
     * @param a
     * @return
     */
    StringBuilder toBariny(int a){
        StringBuilder stringBuilder = new StringBuilder();
        if(a>0){
            while(a>0) {
                if (a % 2 == 0) {
                    a = a / 2;
                    stringBuilder.insert(0,"0");
                } else {
                    a = a / 2;
                    stringBuilder.insert(0,"1");
                }
            }
            while(stringBuilder.length()<32){
                stringBuilder.insert(0,"0");
            }
        }else if(a<0){
            a=-a;
            while (a > 0) {
                if (a % 2 == 0) {
                    a = a / 2;
                    stringBuilder.insert(0, "1");
                } else {
                    a = a / 2;
                    stringBuilder.insert(0, "0");
                }
            }
            while(stringBuilder.length()<32){
                stringBuilder.insert(0,"1");
            }
            for(int i=31;i>0;i--){
                if(stringBuilder.charAt(i)==49){
                    stringBuilder.replace(i,i+1,String.valueOf('0'));
                }else if(stringBuilder.charAt(i)==48){
                    stringBuilder.replace(i,i+1, String.valueOf('1'));
                    break;
                }
            }
        }
        return stringBuilder;
    }
}

