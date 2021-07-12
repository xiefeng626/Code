package jianzhioffer;

import org.junit.Test;

public class offer45 {
    /**
     * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     */
    @Test
    public void main(){

        /**
         * 去掉前面的0
         * 位数一样 小的数字放在前面
         * 位数不一样  第一位小的放在前面
         * 结果用字符串表示
         */
        int [] a={3,30,34,5,9};                             //3 30 34 5 9    //拆解为2个不可行
        String []c = new String[a.length];
        for(int i=0;i<a.length;i++){
            c[i]=String.valueOf(a[i]);
        }
        for(int i=1;i<c.length;i++) {
            if (Integer.valueOf(c[0].substring(0, 1)) > Integer.valueOf(c[i].substring(0, 1))) {
                c[i] += c[0];
                c[0]=c[i];
            } else  {
                c[0] += c[i];
            }
        }
        System.out.println(c[0]);

    }
}
