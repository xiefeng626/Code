package jianzhioffer;

import org.junit.Test;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0。不得使用库函数，同时不需要考虑大数问题，也不用考虑小数点后面0的位数。
 */
public class Offer12 {
     double Power(double base, int exponent) {
         if(base==0){
             return 0;
         }if(exponent==0) {
             return 1;
         }
         int fh=1;
         int basefh=1;
         int exponentfh=1;

         if(base<0) basefh=-1;
         if(Math.abs(exponent)%2==0)
             fh=1;
         else fh=basefh;

         float Result=1;
         if(exponent>0){
             for(int i=0;i<exponent;i++){
                 Result*=base;
             }
         }else {
             for(int j=0;j<Math.abs(exponent);j++)
                Result/=base;
         }


         return fh*Math.abs(Result);



    }

    @Test
    public void main(){
        double power = Power(2, -3);
        System.out.println(power);
    }
}
